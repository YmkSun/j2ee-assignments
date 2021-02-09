<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="java.util.*" %>
<%@ page import="login.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Display</title>
</head>
<body>
<%
ArrayList<Student> al=(ArrayList<Student>)session.getAttribute("students");
%>

<center>
<h3>Student Display</h3>

<table border="1">

<tr><td align="center"><b>Student Name</b></td><td align="center"><b>Email</b></td><td align="center"><b>Address</b></td><td align="center"><b>Contact No.</b></td></tr>
<%
for(Student s:al){
%>
<tr><td align="left"><%=s.getName() %></td><td align="left"><%=s.getEmail() %></td><td align="left"><%=s.getAddr() %></td><td align="left"><%=s.getContact() %></td></tr>
<%
}
%>
</table>
<s:form action="dback"><s:submit key="label.back"/></s:form>
</center>

</body>
</html>