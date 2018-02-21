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
	%>
<body>

<form method='post' action="MyServlet">
	<h1> Resultat de l'identification</h1>
<% Enumeration<String> pars =request.getParameterNames();
		while (pars.hasMoreElements()) {
			String key =pars.nextElement();
			String value = request.getParameter(key);
		%>
		<%=key%> : <%=value%>
		<%}%>
		
		
</form>
</body>
</html>