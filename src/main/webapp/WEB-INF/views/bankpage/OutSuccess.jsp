<%--
  Created by IntelliJ IDEA.
  User: 15651
  Date: 2018/3/27
  Time: 21:43
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
<body background="../../../img/background/back2.jpg" style="background-size: cover">
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <div class="page-header">
                <h1>
                    <p style="color: lightskyblue">欢迎进入中国农业银行ATM网上系统</p> <small>转账服务</small>
                </h1>
            </div>
        </div>
    </div>
</div>
<p style="color: red;size: 20px;">取款成功</p>
<button class="btn-success"onclick="alert('即将返回服务列表');window.location.href='../Back/comeback'" >回到服务选择页面</button>
</body>
</html>
