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
 * Servlet implementation class CtlLivre
 */
@WebServlet("/CtlLivre")
public class CtlLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CtlLivre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		faire(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		faire(request,response);
	}

	
	private void faire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//recuperation des paramètres de la requete
		String titre=request.getParameter("titre");
		String categorie =request.getParameter("categorie");
		
		// Sauvegarde des paramètres d'identification dans un bean Utilisateur
		Livre liv1 = new Livre(titre, categorie);
		liv1.setTitre(titre);
		liv1.setCategorie(categorie);
		
		// Creation de la session pour une premiere fois
		HttpSession maSession = request.getSession(false);
		// Enregistrement dans la session de l'utilisateur
		maSession.setAttribute("livre", liv1);
		
		//redirection vers le controleur en direction de la reservation:
		//recuperation du contexte d'exécution
		
		RequestDispatcher rd = request.getRequestDispatcher("/affichage.jsp");
		rd.forward(request, response);
		
	
	}
	
	}
	
	
