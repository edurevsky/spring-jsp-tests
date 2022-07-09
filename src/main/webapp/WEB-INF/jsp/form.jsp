<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/sum" method="get">
    <label for="numA">First Number</label>
    <input type="number" id="numA" name="a"/>
    <label for="numB">Second Number</label>
    <input type="number" id="numB" name="b"/>
    <button type="submit">Go</button>
</form>
</body>
</html>
