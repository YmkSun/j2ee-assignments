<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enquiry JSP</title>
</head>
<body>

<%
String mail=request.getParameter("email");

if(mail!=null && !mail.equals("")){
	session.setAttribute("mail", mail);
	response.sendRedirect("./personServlet");
}

%>

<center>
<form action="enquiry.jsp">
<table>
<tr><td>Enter Mail:</td><td><input type="text" name="email" size="20"></td></tr>
<tr><td></td><td><input type="submit" name="submit" value="Search">&emsp;<input type="reset" name="reset" value="Reset"></td></tr>
</table>
</form>

</center>

</body>
</html>