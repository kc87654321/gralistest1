package ttt

class User {

    String userName // �û�
String passWord // ����
String email // �ʼ�
String phone // �绰
String address // ��ַ
/** ��Ӧ��Լ�� **/

static constraints = {
//size �����ȣ� blank ��Ϊ��
userName( size : 2 .. 10 , blank: false  )
passWord( size : 6 .. 30 , blank: false )
//email ���ʼ���ʽ�� unique �������ظ�
email(email: true  , unique: true , blank:  false )
//matches ��������֤ �� 7-11 λ ���֣�
phone(matches: /\d{7,11}/ , blank:  false )
//maxSize �����Χ
address(maxSize: 200 , blank:  false )
}
 
}
