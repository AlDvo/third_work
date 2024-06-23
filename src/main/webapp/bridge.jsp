<%--
  Created by IntelliJ IDEA.
  User: aldvo
  Date: 15.06.2024
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.dvorenenko.model.UserInfo" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<body>
<h1>Ты принял вызов. Поднимешься на мостик к капитану?</h1>
<form action="${pageContext.request.contextPath}/bridge" method="post">
    <div>
        <input type="radio" name="choice" value="approved" checked>Принять вызов
        <br>
        <input type="radio" name="choice" value="rejected">Отклонить вызов
        <br>
        <br>
    </div>
    <div>
        <input type="submit" value="Ответить">
    </div>
    <div style='position: fixed; bottom: 0; left: 0;'>
        <p>Статистика:</p>
        <p>Имя пользователя: <%= UserInfo.getInstance().getName() %></p>
        <p>IP address: <%= UserInfo.getInstance().getIpAddress() %></p>
        <p>Количество игр: <%= UserInfo.getInstance().getQuantityGame() %></p>
    </div>
</form>
</body>
</html>
