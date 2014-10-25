import ttt.Customer
import ttt.Goods
class BootStrap {
// 初始化函数
def init = { servletContext ->
// 定义一个客户
def customer = new Customer(name: "Eminem" )
// 如果 “ 客户 ” 成功保存在数据库的表中
if (customer.save()){
// 定义三条 “ 商品 ”
def goods = [
new Goods(name: "Book" , price:45.89 ),
new Goods(name: "Disc" , price:50 ),
new Goods(name: "Apple" , price:34.55 )
]
// 定义每条商品的所有者
goods*.customer = customer
// 执行保存每条商品
goods*.save()
}
}
def destroy = {
}
}