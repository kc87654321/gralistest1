<body>
<h1> ��¼ </h1>
<g:if test ="${flash.message}">
${flash.message}
</g:if >
<g:form action = "loginCheck" method = "post" >
email�� <input type = "text" name = "email"/> <br/>
passWord�� <input type = "password" name = "passWord"/> <br/>
<input type = "submit" value = " ��¼ " />
</g:form >
</body >