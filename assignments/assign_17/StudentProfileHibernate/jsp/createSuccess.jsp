<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Success</title>
</head>
<body>

<center>
<s:label label="Student Insert Successful as" />
<s:property value="sad.stupk.name"/>

<s:form action="createToIndex">
<s:submit key="label.back" />
</s:form>
</center>
</body>
</html>