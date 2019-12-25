<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品信息添加</title>
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">  
       
        <link href="//cdn.bootcss.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">  
       
        <script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>  
      
        <script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>  
    
         <link rel="stylesheet" href="css/style.css">
</head>
 <body>  
    <div class="container">  
        <div class="form row">  
            <form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="register_form" action="<%=request.getContextPath()%>/spaddServlet" 
		method="post" >  
                <h3 class="form-title">商品信息添加</h3>  
                <div class="col-sm-9 col-md-9">  
                <div class="form-group">  
                        <i class="fa fa-check fa-lg"></i>  
                        <input class="form-control required" type="text" placeholder="ID" id="ID" name="ID" autofocus="autofocus" />  
                    </div>  
                    <div class="form-group">  
                        <i class="fa fa-check fa-lg"></i>  
                        <input class="form-control required" type="text" placeholder="名称" id="mc" name="mc" autofocus="autofocus" />  
                    </div>  
                    <div class="form-group">  
                            <i class="fa fa-check fa-lg"></i>  
                            <input class="form-control required" type="text" placeholder="品牌" id="pp" name="pp"/>  
                    </div>  
                    <div class="form-group">  
                            <i class="fa fa-check fa-lg"></i>  
                            <input class="form-control required" type="text" placeholder="价格" id="jg" name="jg"/>  
                    </div>  
                    <div class="form-group">  
                            <i class="fa fa-check fa-lg"></i>  
                            <input class="form-control required" type="text" placeholder="库存" id="kc" name="kc"/>  
                    </div>  
                   
                    <div class="form-group">  
                        <input type="submit" class="btn btn-success pull-right" value="添加 "/>  
                      <input type="button" class="btn btn-success pull-left" value="返回" onClick="location.href='homesuccess.jsp'"/> 
                    </div>  
                </div>  
            </form>  
        </div>  
        </div>  
    
    </body>  
</html>
