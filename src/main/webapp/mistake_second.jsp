<%--
  Created by IntelliJ IDEA.
  User: aldvo
  Date: 18.06.2024
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.dvorenenko.model.UserInfo" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<body>
<h1>Ты не пошел на переговоры.</h1>
<h1>Поражение</h1>

<form action="${pageContext.request.contextPath}/restart" method="get">
    <div>
        <input type="submit" value="Начать игру заново">
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
