<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<html>
<head>
<title>Validation de l'identification</title>
</head>
<body>
<h1>Validation de l'identification</h1>

<ul>
<li>Nom : <c:out value="${nom}"/></li>
<li>Prénom : <c:out value="${prenom}"/></li>
<li>Email : <c:out value="${email}"/></li>
<li>Login : <c:out value="${login}"/></li>
<li>Mot de Passe : <c:out value="${mdp}"/></li>
</ul>

<a href="<c:out value="${pageContext.request.requestURI}"/>">Bienvenue dans la formation JSP !</a>
<a href="<c:out value="${pageContext.request.contextPath}"/>">Retour à l'accueil....</a>
<p>
<img src="images/logo-01.jpg">

</body>
</html>