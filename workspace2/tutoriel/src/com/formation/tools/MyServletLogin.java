package com.formation.tools;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServletLogin")
public class MyServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServletLogin() {
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
	
	String login=request.getParameter("login");
	String mdp =request.getParameter("mdp");

	

	//recuperation des paramètres de la requete
	
	//creation de bean Personne
	
	IdentificationBean personne = new IdentificationBean(login, mdp);
	personne.setLogin(login);
	personne.setMdp(mdp);
	
	//creation de la session
	HttpSession maSession=request.getSession(true);
	
	//enregistrement de la session de la personne
	maSession.setAttribute("personne", personne);
	
	//dispatcher
	RequestDispatcher disp= request.getRequestDispatcher("/identification.jsp");
	disp.forward(request, response);
	
	
	
	}
	
	
}