<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulaire de livre</title>
</head>

<body>
<form method="post" action="CtlLivre">
<h1>Bienvenue <font color="blue" >${utilisateur.nom}</font></h1>
Titre du livre: <input type ="text" name="titre" size="20">


<br>
Catégorie du livre
<select name="categorie">
							<option>Thriller</option>
							<option>Roman</option>
							<option>BD</option>
							<option>Histoire</option>
							
</select>
<br>


<input type="submit" name ="reserver" value="Reserver">

</form>
</body>
</html>