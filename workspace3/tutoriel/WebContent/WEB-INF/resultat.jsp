<%@page import="com.formation.tools.IdentificationBean"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultat de l'identification</title>
</head>
	<%
		HttpSession maSession = request.getSession(false);
		
		String nom = (String) maSession.getAttribute("nom");
		String prenom = (String) maSession.getAttribute("prenom");
		String email = (String) maSession.getAttribute("email");
		String login = (String) maSession.getAttribute("login");
		
		Enumeration<String> pars =request.getAttributeNames();
		while (pars.hasMoreElements()) {
			String key =pars.nextElement();
			System.out.println("parameter> "+key + " : "+ request.getAttribute(key));
		}
		
		
		
	%>
<body>
<form method='post' action="MyServlet">
	<h1> Resultat de l'identification</h1>
	<table>
		<tr>
			<td>nom: <%=nom %></td>
		</tr>
		<tr>
			<td>prenom: <%=prenom %></td>
		</tr>
		<tr>
			<td>email: <%=email %></td>
		</tr>
		<tr>
			<td>login: <%=login %></td>
		</tr>
	</table>
</form>
</body>
</html>