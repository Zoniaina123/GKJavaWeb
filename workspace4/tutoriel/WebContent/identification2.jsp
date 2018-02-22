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

<jsp:useBean id="todate" class="com.formation.tools.DataUtil"/>

<body>

	<div align="center">
		<%@include file="/header.jsp" %></td>
	</div>

<form method='post' action="MyServletIdentification2">

<p align="center">Bonjour, nous sommes le <i><font color="blue"> <jsp:getProperty property="d" name="todate" /></font></i></p>
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
		<td><input type="text" name="login" value='<jsp:getProperty property ="login" name="personne"/>'  size="30"></td>
	</tr>

	<tr>
		<td><b>Mot de passe :</b> </td>
		<td><input type="password" name="mdp" value='<jsp:getProperty property ="mdp" name="personne"/>' size="30"></td>
	</tr>

	<tr>
		<td> </td>
		<td><input type="submit" value="VALIDER"></td>
		<td><input type="reset" value="RESET"></td>
	</tr>
	
</table>

</form>
<div align="center">
		<%@include file="/footer.jsp" %></td>
	</div>
</body>
</html>