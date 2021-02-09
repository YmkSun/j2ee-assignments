<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
</head>
<body>

<center>
<h3><s:text name="label.title"/></h3>

<font color="red"><s:actionerror/></font>
<table>
<s:form action="/register" theme="simple">
<tr><td align="right">Student Name:</td><td><s:textfield name="sname" ></s:textfield></td></tr>
<tr><td align="right">Email:</td><td><s:textfield name="email" ></s:textfield></td></tr>
<tr><td align="right">Address:</td><td><s:textfield name="address"></s:textfield></td></tr>
<tr><td align="right">Contact No.:</td><td><s:textfield name="contactNo"></s:textfield></td></tr>
<tr><td></td><td><s:submit key="label.submit"/>
<s:reset key="label.reset"/></td></tr>
</s:form>
</table>
</center>

</body>
</html>