<%@ include file="header.jsp" %>

<h2>Student Registration</h2>
<form action="/register/student" method="post">
    Name: <input type="text" name="name" required><br>
    Email: <input type="email" name="email" required><br>
    Password: <input type="password" name="password" required><br>
    <input type="submit" value="Register">
</form>

<%@ include file="footer.jsp" %>