<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Job Insert</title>
</head>
<body>
<center>
<h3>Job Insert System</h3>

<s:form action="insert" method="post" theme="simple">
<table>
<tr><td><s:text name="label.jtitle" /></td><td><s:textfield name="j.jobTitle"></s:textfield></td></tr>
<tr><td><s:text name="label.jtype" /></td><td><s:select list="jobtype" name="selectedJob" headerKey="1" /></td></tr>
<tr><td><s:text name="label.jloc" /></td><td><s:textfield name="j.jobLocation"></s:textfield></td></tr>
</table>


<s:text name="label.degree" /><br>
<s:checkboxlist name="checkedDegree" list="degree" label="label.degree"></s:checkboxlist>

<br>
<table>
<tr><td><s:text name="label.company" /></td><td><s:textfield name="j.company_name"></s:textfield></td></tr>
</table>

<s:submit key="label.insert"/>

</s:form>
</center>
</body>
</html>