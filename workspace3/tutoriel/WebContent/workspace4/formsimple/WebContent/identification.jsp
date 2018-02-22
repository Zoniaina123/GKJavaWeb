<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulaire d'identification</title>
</head>
<body>
	<h2>Formation JSP : Veuillez vous identifier</h2>
	<form name="formlogin" method="post" action="ValiderForm">
		<table border="0">
			<tr>
				<td>Nom :</td>
				<td><input type="text" name="nom" value="Jean" /></td>
			</tr>
			<tr>
				<td>Prénom :</td>
				<td><input type="text" name="prenom" value="Dupond" /></td>
			</tr>
			<tr>
				<td>E-mail :</td>
				<td><input type="text" name="email"
					value="jean.dupond@softlsoengineering.fr" /></td>
			</tr>
			<tr>
				<td>Login :</td>
				<td><input type="text" name="login" value="jdupond68" /></td>
			</tr>
			<tr>
				<td>Mot de passe :</td>
				<td><input type="password" name="mdp" value="********" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td colspan="2"><input type="submit" value="Valider" /></td>
			</tr>
		</table>

	</form>
	<img src="images/logo.jpg">
</body>
</html>