<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Voter Success</title>
</head>
<body>

<center>
<h3><s:text name="label.searchtitle" /></h3>

<h4>Voter Search Success...</h4>

<s:form action="searchToIndex" method="post" theme="simple">
<table>
<tr><td align="right"><b><s:text name="label.pname" /></b>:&nbsp;</td><td><s:property value="prty.partyname" /></td></tr>
<tr><td align="right"><b><s:text name="label.acronym" /></b>:&nbsp;</td><td><s:property value="prty.acronym" /></td></tr>
</table>

<s:if test="%{prty.vrt.size()>0}">
<b>Voter voted to this Party</b>
<table>
<s:iterator value="prty.vrt">
<tr><td align="right"><b><s:text name="label.vname" /></b>:&nbsp;</td><td><s:property value="name" /></td></tr>
<tr><td align="right"><b><s:text name="label.age" /></b>:&nbsp;</td><td><s:property value="age" /></td></tr>
<tr><td align="right"><b><s:text name="label.gender" /></b>:&nbsp;</td><td><s:property value="gender" /></td></tr>
<tr><td align="right"><b><s:text name="label.religion" /></b>:&nbsp;</td><td><s:property value="religion" /></td></tr>
<tr><td align="right"><b><s:text name="label.nrc" /></b>:&nbsp;</td><td><s:property value="vdetail.nrc" /></td></tr>
<tr><td align="right"><b><s:text name="label.tsh" /></b>:&nbsp;</td><td><s:property value="vdetail.township" /></td></tr>
<tr><td align="right"><b><s:text name="label.city" /></b>:&nbsp;</td><td><s:property value="vdetail.city" /></td></tr>
<tr><td align="right"><b><s:text name="label.phone" /></b>:&nbsp;</td><td><s:property value="vdetail.phoneno" /></td></tr>
<tr><td>&emsp;</td><td></td></tr>
</s:iterator>
</table>
</s:if>
<s:else><br>No Item in This Order</s:else>

<s:submit key="label.back" />
</s:form>

</center>

</body>
</html>