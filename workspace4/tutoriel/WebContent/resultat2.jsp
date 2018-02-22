<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Validation de l'identification</title>
</head>
<body>

	<h1>Resultat de l'identification</h1>

	<p>
		nom:
		<jsp:getProperty property="nom" name="personne" />
	</p>

	<p>
		nom:
		<jsp:getProperty property="prenom" name="personne" />
	</p>

	<p>
		email:
		<jsp:getProperty property="email" name="personne" />
	</p>

	<p>
		login:
		<jsp:getProperty property="login" name="personne" />
	</p>
	<p>
		mot de passe:
		<jsp:getProperty property="mdp" name="personne" />
	</p>
</body>
</html>