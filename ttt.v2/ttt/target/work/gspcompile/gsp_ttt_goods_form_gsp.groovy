import ttt.Goods
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ttt_goods_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/goods/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: goodsInstance, field: 'customer', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("goods.customer.label"),'default':("Customer")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("customer"),'name':("customer.id"),'from':(ttt.Customer.list()),'optionKey':("id"),'required':(""),'value':(goodsInstance?.customer?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: goodsInstance, field: 'name', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("goods.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("name"),'required':(""),'value':(goodsInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: goodsInstance, field: 'price', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("goods.price.label"),'default':("Price")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("price"),'value':(fieldValue(bean: goodsInstance, field: 'price')),'required':("")],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414045828000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
