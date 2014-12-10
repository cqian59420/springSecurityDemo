
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title></title>
    <script src="<%=basePath%>javascript/jquery/jquery-1.11.0.min.js"></script>
</head>
<body>
我来了
</body>
</html>
