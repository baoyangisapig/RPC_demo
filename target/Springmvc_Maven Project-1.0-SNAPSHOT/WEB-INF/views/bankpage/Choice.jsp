<%--
  Created by IntelliJ IDEA.
  User: 15651
  Date: 2018/3/25
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- 新Bootstrap核心css文件 -->
    <link rel="stylesheet" href="../../../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../../bootstrap/css/MyCss.css">

    <!--jsquery文件。务必在bootstrap.min.js之前引入  -->
    <script src="../../../bootstrap/js/jquery-3.2.1.min.js" type="text/javascript"></script>

    <!-- 最新的Bootstrap核心JavaScript文件 -->
    <script src="../../../bootstrap/js/bootstrap.min.js" type="text/javascript"></script>

    <META HTTP-EQUIV="Pragma" CONTENT="no-cache">
    <META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
    <META HTTP-EQUIV="Expires" CONTENT="0">
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <div class="page-header">
                <h1>
                    <a style="color: red">欢迎进入中国农业银行ATM网上系统</a> <small>下面选择您要进行的操作</small>
                </h1>
            </div>
        </div>
    </div>
</div>
<div class="btn-group" style="margin-left: 30px">

    <button type="button" class="btn btn-default" onclick="alert('您选择了存款服务');window.location.href='../../BSave/index'">存款</button>
    <button type="button"  class="btn btn-default" onclick="alert('您选择了取款服务');window.location.href='../../BOut/index'">取款</button>
    <button type="button"   class="btn btn-default" onclick="alert('您选择了查询服务');window.location.href='../../BSearch/index'">查询余额</button>
    <button  type="button"  class="btn btn-default" onclick="alert('您选择了转账服务');window.location.href='../../BGive/index'">转账</button>
</div>



</body>
</html>
