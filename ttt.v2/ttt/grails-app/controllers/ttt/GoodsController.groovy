package ttt

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class GoodsController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

// 对应 views/goods/searchForm.gsp
def searchForm={
}

def search ={
params.max=params.max?:2 // 每页最多显示条数
params.offset=params.offset?:0 // 从哪条开始
def searchClosure = {
if (params.cust) {
customer{
eq( 'name' , params.cust)
}
}
if (params.goodsName){
eq( 'name' , params.goodsName)
}
if (params.priceStart){
ge( 'price' , new BigDecimal(params.priceStart))
}
if (params.priceEnd){
le( 'price' , new  BigDecimal(params.priceEnd))
}
}
def c = Goods.createCriteria ()
def goods = c.list(params, searchClosure)
def goodsCount = goods.totalCount // 符合条件的条目总数
/* 在 list .gsp 页面显示结果 ， 【要显示的数据集，符合条件的条目总数，页面参数】 */
render(view: 'list' ,model:[goodsList:goods,totaler:goodsCount, params:params])
}
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Goods.list(params), model:[goodsInstanceCount: Goods.count()]
    }

    def show(Goods goodsInstance) {
        respond goodsInstance
    }

    def create() {
        respond new Goods(params)
    }

    @Transactional
    def save(Goods goodsInstance) {
        if (goodsInstance == null) {
            notFound()
            return
        }

        if (goodsInstance.hasErrors()) {
            respond goodsInstance.errors, view:'create'
            return
        }

        goodsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'goods.label', default: 'Goods'), goodsInstance.id])
                redirect goodsInstance
            }
            '*' { respond goodsInstance, [status: CREATED] }
        }
    }

    def edit(Goods goodsInstance) {
        respond goodsInstance
    }

    @Transactional
    def update(Goods goodsInstance) {
        if (goodsInstance == null) {
            notFound()
            return
        }

        if (goodsInstance.hasErrors()) {
            respond goodsInstance.errors, view:'edit'
            return
        }

        goodsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Goods.label', default: 'Goods'), goodsInstance.id])
                redirect goodsInstance
            }
            '*'{ respond goodsInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Goods goodsInstance) {

        if (goodsInstance == null) {
            notFound()
            return
        }

        goodsInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Goods.label', default: 'Goods'), goodsInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'goods.label', default: 'Goods'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
