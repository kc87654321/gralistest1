// 对应 list.gsp 页面
def list = {
// 设置最大值，没有的话设置 10
params.max=params.max?:3
// 设置起始页，没有的话设置 0
params.offset=params.offset?:0
// 从 offset 开始查询 max 条
def goodsList=Goods.list(max:params.max,offset:params.offset)
// 每个页面显示总数为查询到的总数
params.total=goodsList.totalCount
// 给页面传值 Map （数据，显示条数）
[goodsList:goodsList, totaler:params.total]
}