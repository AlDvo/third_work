<%@ page import="com.dvorenenko.model.UserInfo" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<body>
<h1>Пролог</h1>
<p>Ты стоишь в космическом порту и готов подняться на борт </p>
<p>своего корабля. Разве ты не об этом метал? Стать капитаном</p>
<p>галактического судна с экипажом, который будет совершать</p>
<p>подвиги под твоим командованием.</p>
<p>Так что ввперед!</p>
<br>
<br>
<h2>Знакомство с экипажом</h2>

<p>Когда ты подымался на борт корабля, тебя приветствовала девушка с черной папкой в руках:</p>
<p>- Здраствуйте командир! Я Зинаида - ваша помошница. Видите? Там в углу пьет кофе</p>
<p>мой штурман - Сержант Перетерый Шлейф, под штурвалом спит наш бортмеханик - Черный Богдан</p>
<p>а фотографирует его Сергей Стальная Пятка - наш навигатор.</p>
<p>А как обращаться к Вам?</p>
<br>

<form action="${pageContext.request.contextPath}/index" method="post">
    <div>
        <label for="name">Укажите своё имя: </label>
        <input type="text" name="name" id="name" required/>
    </div>
    <div>
        <input type="submit" value="Представиться!"/>
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
