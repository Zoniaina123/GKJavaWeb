<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultat identification</title>
</head>
<body>
<ul>
<li>Login: <c:out value="${utilisateur.login}"/></li>
<li>Pwd: <c:out value="${utilisateur.pwd}"/></li>
</ul>
<br/>
<a href="<c:out value="${pageContext.request.contextPath}/"/>">Lien vers page accueil</a> 
</body>
</html>