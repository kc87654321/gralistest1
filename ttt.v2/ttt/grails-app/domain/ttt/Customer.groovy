package ttt
class Customer {
String name // 顾客姓名
static goods = [good:Goods] // 针对多个 商品--直接下一步有问题，所以1
//static goods // 针对多个 商品
static constraints = {
name(unique:true) // 唯一的
}
}