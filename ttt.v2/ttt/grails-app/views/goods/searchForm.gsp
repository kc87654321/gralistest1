<g:form method="get" action="search">
cu:<g:select name = "cust" from="${ttt.Customer.list()}" optionKey= "name" optionValue = "name" noSelection="${['':'']}">
</g:select>
goodsName: <input type = "text" name = "goodsName" />
priceStart: <input type = "text" name = "priceStart" />
priceEnd: <input type = "text" name = "priceEnd" />
<input type = "submit" value = " search " />
</g:form >
