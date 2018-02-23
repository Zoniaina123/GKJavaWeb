<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>

</head>
<body>

<h1 align="center"><font color="darkblue">Bibliothèque en ligne</font></h1>
<form method="post" action="CtlLogin">
 
 <div>
<TABLE align="center">
	<tr>
		<td><b>Nom :</b></td>
 		<td><input type="text" name="nom" size="30"></td>
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

</form>
</body>
</html>