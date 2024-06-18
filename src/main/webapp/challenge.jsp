<%--
  Created by IntelliJ IDEA.
  User: aldvo
  Date: 15.06.2024
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h1>Ты потерял память. Принять вызов НЛО?</h1>
<form action="${pageContext.request.contextPath}/mistake" method="post">
    <div>
        <input type="radio" name="choice" value="approved">Принять вызов
        <br>
        <input type="radio" name="choice" value="rejected">Отклонить вызов
        <br>
        <br>
    </div>
    <div>
        <input type="submit" value="Ответить"></input>
    </div>
</form>
</body>
</html>
