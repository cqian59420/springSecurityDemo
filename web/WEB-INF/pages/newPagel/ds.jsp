<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
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
你好 我在这边
Model结果 ： ${sc/UserController.do.paramsssss}
ModelMap结果 ： ${sda}

<sf:form method="post" modelAttribute="splittle" >
    <fieldset>
        <table cellpadding="0">
            <tr>
                <th><label for="user_full_name">full Name : </label></th>
                <td><sf:input path="fullName" id="user_full_name" size="15"></sf:input></td>
            </tr>

            <tr>
                <th><label for="user_screen_name">userName : </label></th>
                <th><sf:input path="username" size="15" maxlength="15" id="user_screen_name"/>
                    <small id="username_msg">No Space,Please</small>
                </th>
            </tr>

            <tr>
                <th><label for="user_password">password : </label></th>
                <th><sf:password path="passworld" size="30" maxlength="15" showPassword="true" id="user_password"/>
                    <small>6 characters or more(be tricky!)</small>
                </th>
            </tr>

            <tr>
                <th><label for="user_email">userEmail : </label></th>
                <th><sf:input path="email" size="30" id="user_email"/>
                    <small>in case you forget something</small>
                </th>
            </tr>

            <tr>
                <th></th>
                <th><sf:checkbox path="updateByEmail" id="user_send_email_newsletter"/>
                    <label for="user_send_email_newsletter">send me email updates!</label>
                </th>
            </tr>

        </table>
    </fieldset>
    <input type="submit" value="提交">
</sf:form>
</body>
</html>
