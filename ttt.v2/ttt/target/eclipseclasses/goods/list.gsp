<body>
<br/>
<g:each in = "${goodsList}" status= "i" var= "goodsInstance" >
<g:link action = "show" id= "${goodsInstance.customer}" >
${fieldValue(bean: goodsInstance, field: "customer" )}
</g:link>
${fieldValue(bean: goodsInstance, field: "name" )}
${fieldValue(bean: goodsInstance, field: "price" )} <br/>
</g:each>
<g:paginate total = "${totaler}" params= "${params}" />
</body>