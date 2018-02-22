<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>

</head>
<body>

	<div align="center">
		<%@include file="/header.jsp" %>
	</div>

<h2 align="center"><font color="darkblue">LOGIN</font></h2>
<form method="post" action="MyServletLogin2">
 
 <div>
<TABLE align="center">
	<tr>
		<td><b>Login :</b></td>
 		<td><input type="text" name="login" size="30"></td>
	</tr>

	<tr>
		<td><b>Mot de passe:</b> </td>
		<td><input type="password" name="mdp" size="30"></td>
	</tr>
	
	<tr>
		<td> </td>
		<td><input type="submit" value="IDENTIFICATION"></td>
	</tr>
</TABLE>
</div>

	<div align="center">
		<%@include file="/footer.jsp" %></td>
	</div>
</form>
</body>
</html>