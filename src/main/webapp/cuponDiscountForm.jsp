<%@ page import="java.util.List" %>
<%@ page import="models.Band" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Discount coupon form</title>
</head>
<body>
    <h1>Discount coupon form</h1>

    <form action="printCupon" method="post">
        <label for="name">Name</label><br>
        <input type="text" id="name" name="name" required><br>
        <label for="lastname">Lastname</label><br>
        <input type="text" id="lastname" name="lastname" required><br>
        <label for="dni">DNI</label><br>
        <input type="text" id="dni" name="dni" required><br>
        <label for="dni">Email</label><br>
        <input type="email" id="email" name="email" required><br>
        <label for="band">Band</label><br>
        <select id="band" name="band" required>
            <%
                List<Band> bands = (List<Band>) application.getAttribute("bands");
                for (Band band : bands) {
            %>
                <option value="<%= band %>"><%= band %></option><br>
            <% } %>
        </select>
        <input type="submit" value="Submit">
    </form>

</body>
</html>
