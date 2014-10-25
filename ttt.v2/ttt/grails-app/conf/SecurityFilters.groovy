class SecurityFilters {
   def filters = {
       loginCheck(controller:'*', action:'*') {
           before = {
              if(!session.userId && (!actionName.equals('login')) && (!actionName.equals('loginCheck'))) {
              
                  redirect(controller:"user",action:"login")
                  return false					
	           }
           }

} } }