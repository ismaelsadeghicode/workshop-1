<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: fqx
  Date: 2020/8/28
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Category</th>
    </tr>
   <c:forEach items="${products}" var="product">
       <tr>
           <td>${product.id}</td>
           <td>${product.name}</td>
           <td>${product.category}</td>
       </tr>
   </c:forEach>
</table>
</body>
</html>
