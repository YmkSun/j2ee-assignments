<%@ page import="profile.Profile" %>
<%@ page import="database.DB"%>
<%@ page errorPage="ErrorProfile.jsp" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Registration</title>
</head>
<body>

<%
String userID=request.getParameter("userid");
String userName=request.getParameter("username");
String password=request.getParameter("password");
String email=request.getParameter("email");
String address=request.getParameter("address");

if(userID.equals("") || userName.equals("") || password.equals("") || email.equals("") || address.equals("")){
	%>
	<center>
	<h3>Fill the Inputs first!!!</h3>
		<form action="ProfileIndex.jsp">
		<input type="submit" name="backIndex" value="Back">
		</form>
	</center>
	<%
}
else{
	try{
		Profile p=new Profile(userID, userName, password, email, address);
		new DB().insertDB(p);
			%>
		<h3>User Profile Info.</h3><br>
		<form action="ProfileIndex.jsp">
		<table>
			<tr><td>User ID:</td><td><%=userID%></td></tr>
			<tr><td>User Name:</td><td><%=userName%></td></tr>
			<tr><td>Password:</td><td><%=password%></td></tr>
			<tr><td>Email:</td><td><%=email%></td></tr>
			<tr><td>Address:</td><td><%=address%></td></tr>
			<tr><td></td><td><input type="submit" name="backIndex" value="Back"></td></tr>
		</table>
		</form>
		<%
	}catch(Exception e){
		throw e;
	}
}


%>

</body>
</html>