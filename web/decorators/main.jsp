<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title><decorator:title/></title><decorator:head/>
    <script src="<%=basePath%>javascript/jquery/jquery-1.11.0.min.js"></script>

</head>
<body>
<h2>SiteMesh装饰器header</h2>
<hr/>

<decorator:body/>

<hr />
<h2>SiteMesh装饰footer</h2>
</body>
</html>
