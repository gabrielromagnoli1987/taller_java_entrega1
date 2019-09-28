<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cupons Stats</title>
</head>
<body>
    <h2>Cupons Stats</h2>
    <div>
        <%
            HashMap<String, Integer> cupons = (HashMap<String, Integer>) application.getAttribute("cupons");
            for (Map.Entry entry : cupons.entrySet()) { %>
                <%= "Key: "+ entry.getKey() + " & Value: " + entry.getValue() %><br>
           <% } %>
    </div>

</body>
</html>
