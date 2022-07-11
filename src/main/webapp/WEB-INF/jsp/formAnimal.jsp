<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<%--<form action="${pageContext.request.contextPath}/newAnimal" method="post">--%>
<%--    <label for="name">Name</label>--%>
<%--    <input type="text" id="name" name="name">--%>
<%--    <button type="submit">Save</button>--%>
<%--</form>--%>
<form:form action="${pageContext.request.contextPath}/newAnimal" method="post" modelAttribute="animalRequest">
    <form:label path="name">Name</form:label>
    <form:input path="name"/>
    <button type="submit"></button>
</form:form>
</body>
</html>
