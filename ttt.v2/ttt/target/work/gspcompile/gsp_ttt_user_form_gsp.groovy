import ttt.User
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ttt_user_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: userInstance, field: 'userName', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("user.userName.label"),'default':("User Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("userName"),'maxlength':("10"),'required':(""),'value':(userInstance?.userName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'passWord', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("user.passWord.label"),'default':("Pass Word")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("passWord"),'maxlength':("30"),'required':(""),'value':(userInstance?.passWord)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'email', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("user.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['type':("email"),'name':("email"),'required':(""),'value':(userInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'phone', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("user.phone.label"),'default':("Phone")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("phone"),'pattern':(userInstance.constraints.phone.matches),'required':(""),'value':(userInstance?.phone)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userInstance, field: 'address', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("user.address.label"),'default':("Address")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("address"),'maxlength':("200"),'required':(""),'value':(userInstance?.address)],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414062764000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
