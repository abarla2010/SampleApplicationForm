<%--
  Created by IntelliJ IDEA.
  User: abhishekbarla
  Date: 8/8/16
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form action="Registration Form" method="GET">
    Registration Form:
    <br/>
    <br/>
    Identify the person by their unique ID and then update their details using the form below.
    <br/>
    <br/>
    Unique ID: <input type ="int" name="rowid">
    <br/>
    Name: <input type="text" name="name">
    <br />
    Email ID: <input type="text" name="emailid" />
    <br/>
    Zip Code: <input type="int" name="zipcode"/>
    <br/>
    Phone: <input type="int" name="phone"/>
    <br/>
    <input type="submit" value="Write to Database" />
</form>
</body>
</html>
