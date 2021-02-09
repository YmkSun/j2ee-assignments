<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voter Insert Success</title>
</head>
<body>

<center>
<h3><s:label label="Voter Insert Success as " /><s:property value="votr.name"/></h3>

<s:form action="voterToIndex">
<s:submit key="label.back" />
</s:form>
</center>

</body>
</html>