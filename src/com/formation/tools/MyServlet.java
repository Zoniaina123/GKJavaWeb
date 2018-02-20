package com.formation.tools;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
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
		faire(request,response);
	}

	private void faire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String nom=request.getParameter("nom");
	String prenom=request.getParameter("prenom");
	String email=request.getParameter("email");
	String login=request.getParameter("login");

	/*System.out.println("nom: "+ nom);
	System.out.println("prenom: "+prenom);
	System.out.println("email : " + email);
	System.out.println("login : " + login);
	
	ou alors:*/
	
	Enumeration<String> params =request.getParameterNames();
	System.out.println("\nprocessing getParameterNames\n");
	while (params.hasMoreElements()) {
		String key =params.nextElement();
		System.out.println("parameter> "+key + " :  "+ request.getParameter(key));	
	}
	

	//creation de bean Personne
	
	Personne personne = new Personne();
	personne.setNom(nom);
	personne.setPrenom(prenom);
	personne.setEmail(email);
	personne.setLogin(login);
	personne.setMdp(null);
	
	//creation de la session
	HttpSession maSession=request.getSession(true);
	
	//enregistrement de la session de la personne
	maSession.setAttribute("nom", nom);
	maSession.setAttribute("prenom", prenom);
	maSession.setAttribute("email", email);
	maSession.setAttribute("login", login);
	
	}
	
	
}
