package ttt
class Customer {
String name // �˿�����
static goods = [good:Goods] // ��Զ�� ��Ʒ--ֱ����һ�������⣬����1
//static goods // ��Զ�� ��Ʒ
static constraints = {
name(unique:true) // Ψһ��
}
}