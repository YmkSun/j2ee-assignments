<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Success</title>
</head>
<body>
<center>
<h3>Personal Profile Information</h3>
<table border="1">
<tr><td><s:text name="label.fname" />:</td><td><s:property value="#session.profile.firstname"/></td></tr>
<tr><td><s:text name="label.sname" />:</td><td><s:property value="#session.profile.surname"/></td></tr>
<tr><td><s:text name="label.age" />:</td><td><s:property value="#session.profile.age"/></td></tr>
<tr><td><s:text name="label.mail" />:</td><td><s:property value="#session.profile.email"/></td></tr>
<tr><td><s:text name="label.mobile" />:</td><td><s:property value="#session.profile.mobile"/></td></tr>
<tr><td><s:text name="label.dob" />:</td><td><s:property value="#session.profile.dateOfBirth"/></td></tr>
<tr><td><s:text name="label.pass" />:</td><td><s:property value="#session.profile.password"/></td></tr>
<tr><td><s:text name="label.country" />:</td><td><s:property value="#session.profile.country"/></td></tr>
</table>

<s:form action="sback"><s:submit key="label.back" /></s:form>
</center>

</body>
</html>