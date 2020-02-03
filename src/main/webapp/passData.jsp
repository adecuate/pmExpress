<%--
  Created by IntelliJ IDEA.
  User: myFractalDesign
  Date: 03.02.2020
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pass Data</title>
</head>
<body>
<form id="user-form" action="/passData" method="post" modelAttribute="${team}">
    <p> First team Name: <input type="text" name="firstTeamName"></p>
    <p> Second team Name: <input type="text" name="secTeamName"></p>
    <input type="submit" value="Pass Data">
    </form>
</body>
</html>
