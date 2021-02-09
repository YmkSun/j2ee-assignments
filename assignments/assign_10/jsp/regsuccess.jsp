<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Success</title>
</head>
<body>

<center>
<h3><s:text name="label.title"/></h3>

<s:property value="message" />
<table>
<tr><td align="right">Student Name:</td><td align="left"> <s:property value="sname"/></td></tr>
<tr><td align="right">Email:</td><td align="left"> <s:property value="email"/></td></tr>
<tr><td align="right">Address:</td><td align="left"> <s:property value="address"/></td></tr>
<tr><td align="right">Contact No.:</td><td align="left"><s:property value="contactNo"/></td></tr>
</table>

<s:form action="jsp/registration.jsp" theme="simple">
<s:submit key="label.back" align="center"/>
</s:form>

</center>

</body>
</html>