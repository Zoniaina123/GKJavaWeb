package com.formation.tools;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CtlLogin
 */
@WebServlet("/CtlLogin")
public class CtlLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CtlLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		faire(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		faire(request, response);
	}

private void faire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//recuperation des paramètres de la requete
		String nom=request.getParameter("nom");
		String mdp =request.getParameter("mdp");
		
		// Sauvegarde des paramètres d'identification dans un bean Utilisateur
		Utilisateur util1 = new Utilisateur(nom, mdp);
		util1.setNom(nom);
		util1.setMdp(mdp);
		
		// Creation de la session pour une premiere fois
		HttpSession maSession = request.getSession(true);
		// Enregistrement dans la session de l'utilisateur
		maSession.setAttribute("utilisateur", util1);
		
		//redirection vers le controleur en direction de la reservation:
		//recuperation du contexte d'exécution
		RequestDispatcher rd = request.getRequestDispatcher("/formLivre.jsp");
		rd.forward(request, response);
		
}
	
}
