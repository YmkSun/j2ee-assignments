<%@ page import="entity.Employee" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Success</title>
</head>
<body>

<center>
<h2>Welcome to Online Music Collections System</h2>
<hr color="#0000FF">
<%
Employee e=(Employee)session.getAttribute("empsearched");
%>
<br>
<a href="index.jsp"> Home </a>
&emsp;
<a href="empsearch.jsp"> Search Employee Again </a>
<br>
<h4>Employee found!</h4>
<table>
<tr><td align="right"><b>Employee ID:</b></td><td><%=e.getEmpid() %></td></tr>
<tr><td align="right"><b>Name:</b></td><td><%=e.getEmpname() %></td></tr>
<tr><td align="right"><b>Address:</b></td><td><%=e.getAddress() %></td></tr>
<tr><td align="right"><b>Department:</b></td><td><%=e.getDepartment() %></td></tr>
<tr><td align="right"><b>Rank:</b></td><td><%=e.getRank() %></td></tr>
</table>
</center>

</body>
</html>