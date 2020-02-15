<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <link href="<c:url value = "/resources/css/team_input.css?v=@buildNumber" />" rel=stylesheet>
    <script src="<c:url value = "/resources/js/table_creation.js" />"> </script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <title>Teams</title>
</head>
<body>
    <form id="fSaveDb" name="fSaveDb" method="post" action="/add">
        <input type="text" name="nameEvent" id="nameEvent">
        <input type="number" name="kefEvent" id="kefEvent">
        <input type="submit" class="input-box" value="Add team">
        <table id="table" style="display: none" >
          <thead>
            <tr>
             <th width="500px" height="15">Події</th>
             <th height="15px">Коєфіцієнт</th>
             <th height="15px">Повернення</th>
             <th height="15px">Програш</th>
            </tr>
          </thead>
        </table>
    </form>

<div>
    <h2> Введіть кількість подій: </h2>

    <select id ="loc">
        <option selected="selected">2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
        <option>6</option>
        <option>7</option>
        <option>8</option>
        <option>9</option>
        <option>10</option>
        <option>11</option>
        <option>12</option>
    </select>

    <button id="draw" onclick="addTable()">Підтвердити</button>
    <button id="test" onclick="saveToDb()">test</button>



    <p></p>

</div>
</body>

</html>
