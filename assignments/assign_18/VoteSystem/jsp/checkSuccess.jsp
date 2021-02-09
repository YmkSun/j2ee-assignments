<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Check Success</title>
</head>
<body>

<center>
<h3><s:text name="label.checktitle" /></h3>

<h4>Check Voter Success...</h4>

<s:form action="checkToIndex" method="post" theme="simple">
<table>
<tr><td align="right"><b><s:text name="label.vname" /></b>:&nbsp;</td><td><s:property value="votr.name" /></td></tr>
<tr><td align="right"><b><s:text name="label.age" /></b>:&nbsp;</td><td><s:property value="votr.age" /></td></tr>
<tr><td align="right"><b><s:text name="label.gender" /></b>:&nbsp;</td><td><s:property value="votr.gender" /></td></tr>
<tr><td align="right"><b><s:text name="label.religion" /></b>:&nbsp;</td><td><s:property value="votr.religion" /></td></tr>
<tr><td align="right"><b><s:text name="label.nrc" /></b>:&nbsp;</td><td><s:property value="votr.vdetail.nrc" /></td></tr>
<tr><td align="right"><b><s:text name="label.tsh" /></b>:&nbsp;</td><td><s:property value="votr.vdetail.township" /></td></tr>
<tr><td align="right"><b><s:text name="label.city" /></b>:&nbsp;</td><td><s:property value="votr.vdetail.city" /></td></tr>
<tr><td align="right"><b><s:text name="label.phone" /></b>:&nbsp;</td><td><s:property value="votr.vdetail.phoneno" /></td></tr>
</table><b>Party voted by Voter</b><table>
<tr><td align="right"><b><s:text name="label.pid" /></b>:&nbsp;</td><td><s:property value="votr.pty.pid" /></td></tr>
<tr><td align="right"><b><s:text name="label.pname" /></b>:&nbsp;</td><td><s:property value="votr.pty.partyname" /></td></tr>
<tr><td align="right"><b><s:text name="label.acronym" /></b>:&nbsp;</td><td><s:property value="votr.pty.acronym" /></td></tr>
</table>
<s:submit key="label.back" />
</s:form>

</center>

</body>
</html>