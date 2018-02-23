<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Validation de l'identification</title>
</head>
<body>
<h1>Validation identification via EL</h1>
<ul>
	<li>Nom: ${personne.nom}</li>
	<li>Prénom: ${personne.prenom}</li>
	<li>Email: ${personne.email}</li>
	<li>Login: ${personne.login}</li>
	<li>Mot de Passe: ${personne.mdp}</li>
</ul>
</body>
</html>