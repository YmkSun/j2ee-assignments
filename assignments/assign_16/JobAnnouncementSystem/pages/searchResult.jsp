<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Job Search Result</title>
</head>
<body>
<center>
<h3>Job Search Result by <s:property value="jid" /></h3>

<table>
<tr><td align="right"><s:text name="label.jid" />:</td><td><s:property value="mj.jobid" /></td></tr>
<tr><td align="right"><s:text name="label.jtitle" />:</td><td><s:property value="mj.jobTitle" /></td></tr>
<tr><td align="right"><s:text name="label.jtype" />:</td><td><s:property value="mj.jobType" /></td></tr>
<tr><td align="right"><s:text name="label.jloc" />:</td><td><s:property value="mj.jobLocation" /></td></tr>
<tr><td align="right"><s:text name="label.jdgre" />:</td><td><s:property value="mj.degree" /></td></tr>
<tr><td align="right"><s:text name="label.company" />:</td><td><s:property value="mj.company_name" /></td></tr>
</table>

<s:form action="searchToIndex">
<s:submit key="label.back" />
</s:form>

</center>

</body>
</html>