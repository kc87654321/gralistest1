<%@ page import="ttt.Goods" %>



<div class="fieldcontain ${hasErrors(bean: goodsInstance, field: 'customer', 'error')} required">
	<label for="customer">
		<g:message code="goods.customer.label" default="Customer" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="customer" name="customer.id" from="${ttt.Customer.list()}" optionKey="id" required="" value="${goodsInstance?.customer?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: goodsInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="goods.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${goodsInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: goodsInstance, field: 'price', 'error')} required">
	<label for="price">
		<g:message code="goods.price.label" default="Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="price" value="${fieldValue(bean: goodsInstance, field: 'price')}" required=""/>

</div>

