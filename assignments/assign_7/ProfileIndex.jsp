<%@ page import="profile.Profile" %>
<%@ page import="database.DB"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Registration</title>
</head>
<body>

<center><h3>User Profile Registration</h3>

<form action="RegisterProfile.jsp">

<table>
<tr><td align="left"><label>User ID:</label></td><td><input type="text" size="20" name="userid"></td></tr>
<tr><td align="left"><label>User Name:</label></td><td><input type="text" size="20" name="username"></td></tr>
<tr><td align="left"><label>Password:</label></td><td><input type="password" size="20" name="password"></td></tr>
<tr><td align="left"><label>Email:</label></td><td><input type="text" size="20" name="email"></td></tr>
<tr><td align="left"><label>Address:</label></td><td><textarea rows="3" cols="16" name="address"></textarea></td></tr>
<tr><td align="left"></td><td><input type="submit" name="save" value="Save">&emsp;<input type="reset" name="reset" value="Reset"></td></tr>
</table>
</form>
</center>

</body>
</html>