<%--
  Created by IntelliJ IDEA.
  User: aldvo
  Date: 15.06.2024
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Ты принял вызов. Поднимешься на мостик к капитану?</h1>
<form action="who_are_you.jsp">
    <div>
        <input type="radio" id="firstChoice" name="choice" value="approved" />
        <label for="firstChoice">Подняться на мостик</label>
        <br>
        <input type="radio" id="secondChoice" name="choice" value="rejected" />
        <label for="secondChoice">Отказаться подниматься на мостик</label>
    </div>
    <div>
        <button type="submit">Ответить</button>
    </div>
</form>
</body>
</html>
