<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Staff Entry</title>
</head>
<body>
<s:head />
<center>
<h3><s:text name="label.entryTitle" /></h3>

<table>
<s:form action="staffEntry" method="post" theme="simple">
<tr><td align="right"><s:text name="label.name" /><font color="red">*</font>:</td><td><s:textfield name="staff.staffName"></s:textfield></td><td><s:fielderror fieldName="staff.staffName" /></td></tr>
<tr><td align="right"><s:text name="label.rank" /><font color="red">*</font>:</td><td><s:textfield name="staff.rank"></s:textfield></td><td><s:fielderror fieldName="staff.rank" /></td></tr>
<tr><td align="right"><s:text name="label.dept" /><font color="red">*</font>:</td><td><s:textfield name="staff.department"></s:textfield></td><td><s:fielderror fieldName="staff.department" /></td></tr>
<tr><td></td><td><s:submit key="label.save" /><s:reset key="label.reset" /></td><td></td></tr>
</s:form>
</table>

</center>
</body>
</html>