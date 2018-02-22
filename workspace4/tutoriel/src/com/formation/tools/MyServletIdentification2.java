package com.formation.tools;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServletIdentification2")
public class MyServletIdentification2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServletIdentification2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		faire(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//faire(request,response);
	}

	private void faire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String nom=request.getParameter("nom");
	String prenom=request.getParameter("prenom");
	String email=request.getParameter("email");
	String login=request.getParameter("login");
	String mdp=request.getParameter("mdp");

	/*System.out.println("nom: "+ nom);
	System.out.println("prenom: "+prenom);
	System.out.println("email : " + email);
	System.out.println("login : " + login);
	
	ou alors:*/
	
	Enumeration<String> params =request.getParameterNames();
	System.out.println("\nprocessing getParameterNames\n");
	while (params.hasMoreElements()) {
		String key =params.nextElement();
		System.out.println("parameters> "+key + " : "+ request.getParameter(key));
	}
	
	//methode avec le dispatcher
	//recuperer de la session en cours:
	HttpSession maSession=request.getSession(true);
	
	IdentificationBean personne = new IdentificationBean(nom, prenom,email,login,mdp);
	
	maSession.setAttribute("personne", personne);
	/*//mise en attribut  de session des param de requete
	maSession.setAttribute("nom", nom);
	maSession.setAttribute("prenom", prenom);
	maSession.setAttribute("email", email);
	maSession.setAttribute("login", login);*/
	
	
	//
	RequestDispatcher dispatcher = request.getRequestDispatcher("/resultat2.jsp");
	dispatcher.forward(request, response);
	
	}
	
	//redirection permanente vers google.com
	/*public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();
		String nouvelleURL = "http://www.google.com";
		response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
		response.setHeader("Location", nouvelleURL);
		out.println("<html><head><title>301 Moved Permanently</title></head>");
		out.println("<body>Document moved to <a href=" + nouvelleURL + "/");
		out.println("here</a>.<p></body></html>");
		out.close();*/
	
	//redirection temporaire vers google.com
	/*public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		faire(request,response);
		response.sendRedirect("http://www.google.com");*/
	
	
	}

