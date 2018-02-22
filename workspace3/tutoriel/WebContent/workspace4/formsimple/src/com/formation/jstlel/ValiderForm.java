package com.formation.jstlel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class ValiderForm
 */
public class ValiderForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValiderForm() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		// 1. Récupération paramètre de requête
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String login = request.getParameter("login");
		String mdp = request.getParameter("mdp");
		
		// 2. Création Session Http à partir de l'Objet Request
		HttpSession session = request.getSession();

		//3. Mise en attribut de session des paramètres de requête
		session.setAttribute("nom", nom);
		session.setAttribute("prenom", prenom);
		session.setAttribute("email", email);
		session.setAttribute("login", login);
		session.setAttribute("mdp", mdp);
		
		//4. Redirection vers JSP
		RequestDispatcher dispatcher =null;		
		dispatcher = request.getRequestDispatcher("/validation.jsp");
		
		dispatcher.forward(request, response);
		
	}

}
