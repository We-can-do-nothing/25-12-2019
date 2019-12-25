<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>  
    <head>  
        <meta charset="utf-8" />  
        <title>登陆</title>  
        
        <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">  

        <link href="//cdn.bootcss.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">  
 
        <script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>  

        <script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>  

         <link rel="stylesheet" href="css/style.css">
   
   
   

</script>
   
    </head>  
    <body>  
    <div class="container">  
        <div class="form row">  
            <form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="login_form" action="${pageContext.request.contextPath }/EmpServlet?cmd=login" method="post">  
                <h3 class="form-title">Login to your account</h3>  
                <div class="col-sm-9 col-md-9">  
                    <div class="form-group">  
                        <i class="fa fa-user fa-lg"></i>  
                        <input class="form-control required" type="text" placeholder="Username"  id="nickname" name="nickname" autofocus="autofocus" maxlength="20"/>  
                    </div>  
                    <div class="form-group">  
                            <i class="fa fa-lock fa-lg"></i>  
                            <input class="form-control required" type="password" placeholder="Password" id="password" name="password" maxlength="8"/>  
                    </div>  
                    <div class="form-group">  
                        <label class="checkbox">  
                            <input type="checkbox" name="remember" value="1"/> Remember me  
                        </label>  
                        <hr />  
                        
                    </div>  
                    <div class="form-group">  
                        <input type="submit" class="btn btn-success pull-right" value="Sign in"/>   
                        <input type="button" class="btn btn-success pull-left" value="Register" onClick="location.href='register.jsp'"/>  
                    </div>  
                </div>  
            </form>  
        </div>  
  
        
        </div>  
    
    </body>  
</html>  
