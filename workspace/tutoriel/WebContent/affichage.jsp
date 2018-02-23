
<%@page import="com.formation.tools.Livre"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Affichage du livre reservé</title>
</head>
<body>
<form method="post" action="Deconnexion">
<h1>Liste des livres reservés</h1>
<ul>
	<li>Titre: ${livre.titre} </li>
	<li>categorie:  ${livre.categorie}</li>
</ul>
<input type="submit" value="Deconnexion">
</form>
</body>
</html>