<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Studio</title>
</head>
<body>

<center>
<h2>Welcome to Online Music Collections System</h2>
<hr color="#0000FF">

<h4>New MusicStudio Information</h4>
<s:form action="stoinsert" method="post" theme="simple">
<table>
<tr><td align="right"><s:text name="label.sname" /></td><td><s:textfield name="musto.name" /></td></tr>
<tr><td align="right"><s:text name="label.email" /></td><td><s:textfield name="musto.email" /></td></tr>
<tr><td></td><td><s:checkbox name="check" /><s:text name="label.feed" /></td></tr>
<tr><td></td><td align="right"><s:submit key="label.cresto" /></td></tr>
</table>
</s:form>
</center>
</body>
</html>