<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品信息查询</title>
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">  
       
        <link href="//cdn.bootcss.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">  
       
        <script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>  
      
        <script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>  
    
         <link rel="stylesheet" href="css/style.css">
</head>
 <body>  
    <div class="container">  
        <div class="form row">  
            <form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="register_form" action="${pageContext.request.contextPath}/chaServlet?cmd=查询"
		method="post" >  
                <h3 class="form-title">商品信息查询</h3>  
                <div class="col-sm-9 col-md-9">  
                <div class="form-group">  
                        <i class="fa fa-check fa-lg"></i>  
                        <input class="form-control required" type="text" placeholder="请输入查询的ID" id="ID" name="ID" autofocus="autofocus" />  
                    </div>  
                    <div class="form-group">  
                        <i class="fa fa-check fa-lg"></i>  
                        <input class="form-control required" type="text" placeholder="名称" id="mc" value="${mc}" name="mc" readonly="readonly" />  
                    </div>  
                    <div class="form-group">  
                            <i class="fa fa-check fa-lg"></i>  
                            <input class="form-control required" type="text" placeholder="品牌" value="${pp}" id="pp" readonly="readonly"/>  
                    </div>  
                    <div class="form-group">  
                            <i class="fa fa-check fa-lg"></i>  
                            <input class="form-control required" type="text" placeholder="价格" value="${jg}" id="jg" readonly="readonly"/>  
                    </div>  
                    <div class="form-group">  
                            <i class="fa fa-check fa-lg"></i>  
                            <input class="form-control required" type="text" placeholder="库存" value="${kc}" id="kc" readonly="readonly"/>  
                    </div>  
                   
                    <div class="form-group">  
                        <input type="submit" class="btn btn-success pull-right" value="查询 "/>  
                      <input type="button" class="btn btn-success pull-left" value="返回" onClick="location.href='homesuccess.jsp'"/> 
                    </div>  
                </div>  
            </form>  
        </div>  
        </div>  
    
    </body>  
</html>
