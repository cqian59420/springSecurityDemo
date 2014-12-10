<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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

<form action="/homeController.do?login" method="post">
    <div align="center">
        <div>
            <label for="userName">用户名</label>
            <input type="text" size="20" name="userName" id="userName" maxlength="25">
            </di>
            <div>
                <label for="password">密码</label>
                <input type="password" size="20" name="password" id="password" maxlength="25">
            </div>
        </div>
    </div>
    <input type="submit" value="提交啊">
</form>
</body>
</html>
