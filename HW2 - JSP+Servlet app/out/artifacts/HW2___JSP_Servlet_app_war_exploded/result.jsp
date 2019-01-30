<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: alexa
  Date: 1/30/2019
  Time: 6:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<p>
    <%
        //we use list because casting a single string ignore all '\n'
        List answer = (List) request.getAttribute("attr");
        for (Object o : answer) {
            out.print(o + "<br>");
        }

    %>
</p>
<p>

<p>
    <a href='index.jsp'>Try this once more</a>
</p>

<h5>
    Thanks for the attention!
</h5>
</body>
</html>
