<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Inquiry Form</title>
</head>
<body>
<center>
<h3><s:text name="label.asuccess" /></h3>
<h4><s:text name="label.inquiryTitle" /></h4>

<table>
<s:form action="inquiry" theme="simple">
<tr><td><s:text name="label.rno" /></td><td><s:textfield name="rno"></s:textfield></td><td><s:fielderror fieldName="rno" /></td></tr>
<tr><td></td><td><s:submit key="label.inquiry" /><s:reset key="label.reset" /></td><td></td></tr>
</s:form>

</table>
<s:form action="iback"><s:submit key="label.back"/></s:form>

</center>
</body>
</html>