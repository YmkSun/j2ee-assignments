<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<center>
<%String user=(String)session.getAttribute("user"); %>
<h3>Welcome <%=user %></h3>
<font color="red"><s:actionerror/></font>
<table>
<tr><td>
<s:form action="display"><s:submit key="label.display"/></s:form>
</td><td>
<s:form action="wback"><s:submit key="label.back"/></s:form>
</td></tr>
</table>
</center>
</body>
</html>