package ttt

class User {

    String userName // 用户
String passWord // 密码
String email // 邮件
String phone // 电话
String address // 地址
/** 对应表单约束 **/

static constraints = {
//size ：长度， blank ：为空
userName( size : 2 .. 10 , blank: false  )
passWord( size : 6 .. 30 , blank: false )
//email ：邮件格式， unique ：不可重复
email(email: true  , unique: true , blank:  false )
//matches ：正则验证 （ 7-11 位 数字）
phone(matches: /\d{7,11}/ , blank:  false )
//maxSize ：最大范围
address(maxSize: 200 , blank:  false )
}
 
}
