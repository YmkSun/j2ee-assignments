<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Voter</title>
</head>
<body>
<s:head/>
<center>
<h3><s:text name="label.searchtitle" /></h3>
<s:actionerror />
<s:form action="vtrsearch" method="post" theme="simple">
<table>
<tr><td><s:text name="label.pid" />:&nbsp;</td><td><s:textfield name="ptid" /></td>
<td><s:fielderror fieldName="ptid" /></td></tr>
<tr><td></td><td><s:submit key="label.search" /><s:reset key="label.reset" /></td><td></td></tr>
</table>
</s:form>
</center>

</body>
</html>