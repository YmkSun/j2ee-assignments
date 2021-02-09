<%@ page import="profile.Profile" %>
<%@ page import="database.DB"%>
<%@ page import="java.util.*"%>

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
ArrayList<Profile> al=new DB().getProfile();
%>
<center>
	<h3>User Profile Info.</h3><br>
	<form action="index.jsp">
		<table border="1" bgcolor="#CCFFFF">
		<tr><td>User ID</td><td>Username</td><td>Password</td><td>Email</td><td>Address</td></tr>
		<%
		for(Profile p:al){
		%>
		<tr><td><%=p.getUserID() %></td><td align="left"><%=p.getUserName() %></td><td align="left"><%=p.getPassword() %></td><td align="left"><%=p.getEmail() %></td><td align="left"><%=p.getAddress() %></td></tr>
		<%
		}
		%>
		
	</table><br>
	<input type="submit" name="backIndex" value="Back">
	</form>
</center>		
</body>
</html>