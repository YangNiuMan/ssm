<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2019/11/3
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>成功</h3>
<c:forEach items="${list}" var="account">
    ${account.name}
    ${account.money}
    ${account.toString()}
</c:forEach>
</body>
</html>
