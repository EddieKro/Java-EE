<%--
  Created by IntelliJ IDEA.
  User: alexa
  Date: 1/30/2019
  Time: 8:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Should I go to the university tomorrow?</title>
</head>
<body>
<p>How many classes will you have tomorrow?</p>
<form action="Controller" method="post" >
    <label>
        <select name="number" size="1">
            <option value="1">One</option>
            <option value="2">Two</option>
            <option value="3">Three</option>
            <option value="4">Four</option>
            <option value="5">Five</option>
            <option value="6">Six</option>
        </select><br>

        <input type="submit">

    </label>
</form>

</body>
</html>
