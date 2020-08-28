<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: S_Zab
  Date: 28-Aug-20
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>customers</title>
</head>
<body>
<table border="1">
    <tr>
        <th>ID</th>
        <th>NameFa</th>
        <th>NameEn</th>
        <th>EmailAddress</th>
        <th>WebsiteAddress</th>
    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.nameFa}</td>
            <td>${customer.nameEn}</td>
            <td>${customer.emailAddress}</td>
            <td>${customer.websiteAddress}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
