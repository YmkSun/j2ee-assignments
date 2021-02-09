<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World</title>
</head>
<body bgcolor="#CCFFFF">
<center>

<h4><s:text name="label.title"/></h4>

<font color="red"><s:actionerror/></font>
<s:form action="/hello">
<s:textfield name="username" key="label.name"></s:textfield>
<s:submit key="label.submit" />
<s:reset key="label.reset"/>
</s:form>
</center>
</body>
</html>