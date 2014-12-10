
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>出错</title>
    <script src="<%=basePath%>javascript/jquery/jquery-1.11.0.min.js"></script>

</head>
<body>
登陆失败!
<script>
    setTimeout("goBack()",1000)

    function goBack(){
        history.go(-1);
    }
</script>
</body>

</html>
