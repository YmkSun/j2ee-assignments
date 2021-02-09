<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Job Search</title>
</head>
<body>
<h3>Job Search Index</h3>
<font color="red"><s:actionerror /></font>
<s:form action="search" theme="simple">
<s:text name="label.searchid" /><s:textfield name="jid" /><s:submit key="label.search" />
</s:form>

</body>
</html>