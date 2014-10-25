import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ttt_goodslist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/goods/list.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
createTagBody(1, {->
printHtmlPart(0)
loop:{
int i = 0
for( goodsInstance in (goodsList) ) {
printHtmlPart(1)
createTagBody(3, {->
printHtmlPart(1)
expressionOut.print(fieldValue(bean: goodsInstance, field: "customer" ))
printHtmlPart(1)
})
invokeTag('link','g',6,['action':("show"),'id':(goodsInstance.customer)],3)
printHtmlPart(1)
expressionOut.print(fieldValue(bean: goodsInstance, field: "name" ))
printHtmlPart(1)
expressionOut.print(fieldValue(bean: goodsInstance, field: "price" ))
printHtmlPart(2)
i++
}
}
printHtmlPart(1)
invokeTag('paginate','g',10,['total':(totaler),'params':(params)],-1)
printHtmlPart(1)
})
invokeTag('captureBody','sitemesh',1,[:],1)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414054608000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
