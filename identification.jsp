<%@page import="com.formation.tools.DataUtil"%>
<%@page import="com.formation.tools.IdentificationBean"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulaire</title>
<h2 align="center"><font color="darkblue">FORMULAIRE</font></h2>
</head>
	<%
		HttpSession maSession = request.getSession(false);	
		IdentificationBean personne = (IdentificationBean) maSession.getAttribute("personne");	
	%>

<body>

<form method='post' action="MyServlet">

<p align="center">Bonjour, nous sommes le <i><font color="blue"> <%= new DataUtil()%></font></i></p>
<TABLE align="center">
	<tr>
		<td><b>Nom :</b></td>
 		<td><input type="text" name="nom" size="30"></td>
	</tr>

	<tr>
		<td><b>Prenom :</b> </td>
		<td><input type="text" name="prenom" size="30"></td>
	</tr>

	<tr>
		<td><label><b>E-mail :</b></label> </td>
		<td><input type="text" name="email" size="30"></td>
	</tr>

	<tr>
		<td><b>Login : </b></td>
		<td><input type="text" name="login" value="<%=personne.getLogin()%>" size="30"></td>
	</tr>

	<tr>
		<td><b>Mot de passe :</b> </td>
		<td><input type="password" name="mdp" value="<%=personne.getMdp()%>" size="30"></td>
	</tr>

	<tr>
		<td><input type="submit" value="OK"></td>
		<td><input type="reset" value="RESET"></td>
	</tr>
	
</table>

</form>

</body>
</html>