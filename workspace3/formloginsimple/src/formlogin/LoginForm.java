package formlogin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import formlogin.metier.User;

/**
 * Servlet implementation class LoginForm
 */
//@WebServlet(description = "LoginForm", urlPatterns = { "/LoginForm" })
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginForm() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		traitement(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void traitement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Etape 1 : R�cup�ration des param�tres de la requ�te
		
		String login = request.getParameter("loginuser");
		String pwd = request.getParameter("mdpuser");
		
		// Etape 2 : Soumettre les param�tres de la requ�te � la couche service et r�cup�rer r�sultat
		
		User user = new User(login, pwd);	
		HttpSession maSession = request.getSession();		
		maSession.setAttribute("utilisateur", user);	
		
		// Etape 3 : R�ponse � l'utilisateur
		RequestDispatcher   dispatcher = request.getRequestDispatcher("resultatLogin.jsp");
		dispatcher.forward(request, response);
		
		}

}
