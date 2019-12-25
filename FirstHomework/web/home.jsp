<%--
  Created by IntelliJ IDEA.
  User: 16834
  Date: 2019/12/25
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>home</title>
    <!-- 最新版本的Bootstrap 核心CSS文件 -->
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css" />

    <!-- 需要引入jQuery文件 -->
    <script type="text/javascript" src="bootstrap/js/jquery-1.12.2.min.js"></script>

    <!-- 最新的Bootstrap 核心JavaScript文件 -->
    <script type="text/javascript" src="bootstrap/js/bootstrap.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<h2>添加</h2>
<hr width="80%">
<form class="form-horizontal" action="${pageContext.request.contextPath}/DellServlet?cmd=add">
    <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">username</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputEmail3" placeholder="username">
        </div>
    </div>

    <div class="form-group">
        <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
        </div>
    </div>

    <div class="form-group">
        <label class="sr-only" for="inputPassword3">gender</label>
        <select class="form-control" name="gender" id="gender">
            <option>Female</option>
            <option>Male</option>
        </select>
    </div>

    <div class="form-group">
        <label class="sr-only" for="inputPassword3">salary</label>
        <input type="text" name="salary" placeholder="salary" class="form-password form-control" id="salary">
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">Sign in</button>
        </div>
    </div>
</form>

</body>
</html>
