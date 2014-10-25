<body>
<h1> µÇÂ¼ </h1>
<g:if test ="${flash.message}">
${flash.message}
</g:if >
<g:form action = "loginCheck" method = "post" >
email£º <input type = "text" name = "email"/> <br/>
passWord£º <input type = "password" name = "passWord"/> <br/>
<input type = "submit" value = " µÇÂ¼ " />
</g:form >
</body >