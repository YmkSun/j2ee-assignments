<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Search</title>
</head>
<body>
<center>
<h3><s:text name="label.srtitle" /></h3>


<s:form action="searchstu" method="post" theme="simple" >
<font color="red"><s:actionerror /></font>
<table>
<tr><td><s:text name="label.rno" /></td><td><s:textfield name="spk.rno" ></s:textfield></td><td></td></tr>
<tr><td><s:text name="label.sname" /></td><td><s:textfield name="spk.name" ></s:textfield></td><td></td></tr>
<tr><td></td><td><s:submit key="label.search" /><s:reset key="label.reset" /></td><td></td></tr>
</table>
</s:form>
</center>
</body>
</html>