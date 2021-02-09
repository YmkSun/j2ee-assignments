<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Party Insert</title>
</head>
<body>
<center>
<s:head/>
<h3><s:text name="label.partytitle" /></h3>

<s:form action="ptyinsert" method="post" theme="simple">
<table>
<tr>
<td align="right"><s:text name="label.pname" /></td>
<td><s:textfield name="prty.partyname" /></td>
<td><s:fielderror fieldName="prty.partyname" /></td>
</tr>
<tr>
<td align="right"><s:text name="label.acronym" /></td>
<td><s:textfield name="prty.acronym" /></td>
<td><s:fielderror fieldName="prty.acronym" /></td>
</tr>
<tr><td></td><td><s:submit key="label.insert" /><s:reset key="label.reset" /></td><td></td></tr>
</table>
</s:form>
</center>
</body>
</html>