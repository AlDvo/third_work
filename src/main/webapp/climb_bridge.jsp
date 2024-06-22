<%--
  Created by IntelliJ IDEA.
  User: aldvo
  Date: 18.06.2024
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.dvorenenko.model.UserInfo" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<body>
<h1>Ты поднялся на мостик. Ты кто?</h1>
<form action="${pageContext.request.contextPath}/climb_challenge" method="post">
    <div>
        <input type="radio" name="choice" value="approved">Рассказать правду о себе
        <br>
        <input type="radio" name="choice" value="rejected">Солгать о себе
        <br>
        <br>
    </div>
    <div>
        <input type="submit" value="Ответить"></input>
    </div>
    <div style='position: fixed; bottom: 0; left: 0;'>
        <p>Статистика:</p>
        <p>Имя пользователя:<%= UserInfo.getInstance().getName() %></p>
        <p>IP address: <%= UserInfo.getInstance().getIpAddress() %></p>
        <p>Количество игр: <%= UserInfo.getInstance().getQuantityGame() %></p>
    </div>
</form>
</body>
</html>
