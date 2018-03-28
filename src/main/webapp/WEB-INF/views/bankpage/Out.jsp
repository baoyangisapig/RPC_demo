<%--
  Created by IntelliJ IDEA.
  User: 15651
  Date: 2018/3/25
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../../bootstrap/css/MyCss.css">

    <!--jsquery文件。务必在bootstrap.min.js之前引入  -->
    <script src="../../../bootstrap/js/jquery-3.2.1.min.js" type="text/javascript"></script>

    <!-- 最新的Bootstrap核心JavaScript文件 -->
    <script src="../../../bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <div class="page-header">
                <h1>
                    <a style="color: lightskyblue">欢迎进入中国农业银行ATM网上系统</a> <small>转账服务</small>
                </h1>
            </div>
        </div>
    </div>
</div>
<form class="form-horizontal" role="form" action="Out">
    <div class="form-group">
        <label for="firstname" class="col-sm-2 control-label">请输入取款金额</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="firstname"  name="amount" placeholder="取款金额" style="width: 150px;">
        </div>

    </div>
    <div class="form-group">
        <label for="lastname" class="col-sm-2 control-label">请输入密码</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="lastname" name="password" placeholder="密码" style="width: 150px;">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <div class="checkbox">
                <label>
                    <input type="checkbox">请记住我
                </label>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">确认取款</button>
        </div>
    </div>
</form>
</body>
</html>
