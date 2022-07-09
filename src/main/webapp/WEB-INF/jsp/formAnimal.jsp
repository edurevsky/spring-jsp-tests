<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/newAnimal" method="post">
    <label for="name">Name</label>
    <input type="text" id="name" name="name">
    <button type="submit">Save</button>
</form>
</body>
</html>
