import ttt.Customer
import ttt.Goods
class BootStrap {
// ��ʼ������
def init = { servletContext ->
// ����һ���ͻ�
def customer = new Customer(name: "Eminem" )
// ��� �� �ͻ� �� �ɹ����������ݿ�ı���
if (customer.save()){
// �������� �� ��Ʒ ��
def goods = [
new Goods(name: "Book" , price:45.89 ),
new Goods(name: "Disc" , price:50 ),
new Goods(name: "Apple" , price:34.55 )
]
// ����ÿ����Ʒ��������
goods*.customer = customer
// ִ�б���ÿ����Ʒ
goods*.save()
}
}
def destroy = {
}
}