<%@ page import="database.DB"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Registration</title>
</head>
<body bgcolor="#CCFFFF">

<%
String userID=request.getParameter("userid");
String mail=request.getParameter("email");
String password=request.getParameter("password");

if(userID!=null && !userID.equals("") && mail!=null && !mail.equals("") && password!=null && !password.equals("")){
	if(new DB().isProfile(userID, mail, password)){
		response.sendRedirect("./profile.jsp");
	}
	else{
		response.sendRedirect("./index.jsp");
	}
}
%>
<form action="index.jsp" method="get">
<center>
<table>
<tr><td align="left">User ID:</td><td><input type="text" name="userid" size="20"></td></tr>
<tr><td align="left">Email:</td><td><input type="text" name="email" size="20"></td></tr>
<tr><td align="left">Password:</td><td><input type="password" name="password" size="20"></td></tr>
<tr><td></td><td><input type="submit" name="save" value="Log In">&emsp;<input type="reset" name="reset" value="Reset"></td></tr>
</table>
</center>
</form>

</body>
</html>