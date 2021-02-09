<%@ page import="person.PersonalProfile" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show JSP</title>
</head>
<body>

<%
PersonalProfile p=(PersonalProfile)session.getAttribute("pprofile");
%>

<center>
<h3>Personal Profile</h3><br>

<table>
<tr><td align="right">First Name :</td><td align="left"><%=p.getFirstName() %></td></tr>
<tr><td align="right">Last Name :</td><td align="left"><%=p.getLastName() %></td></tr>
<tr><td align="right">Email :</td><td align="left"><%=p.getEmail() %></td></tr>
<tr><td align="right">Password :</td><td align="left"><%=p.getPassword() %></td></tr>
<tr><td align="right">Address :</td><td align="left"><%=p.getAddress() %></td></tr>
</table>
<br>
<form action="enquiry.jsp">
	<input type="submit" name="backIndex" value="Back">
</form>	
</center>
</body>
</html>