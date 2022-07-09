<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Animals</title>
</head>
<body>
<c:forEach var="animal" items="${animals}">
    <p>${animal.name}</p>
    <small><fmt:formatDate value="${animal.birthDate}" pattern="dd/MM/yyyy HH:mm"/></small>
</c:forEach>
</body>
</html>
