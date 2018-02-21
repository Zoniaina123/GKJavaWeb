package com.formation.tools;

import java.io.IOException;
import java.util.Enumeration;

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
@WebServlet("/MyServlet")
public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	faire(request,response);
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		faire(request,response);
	}*/

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
		System.out.println("parameter> "+key + " : "+ request.getParameter(key));
	}
	HttpSession maSession=request.getSession(true);
	
	maSession.setAttribute("nom", nom);
	maSession.setAttribute("prenom", prenom);
	maSession.setAttribute("email", email);
	maSession.setAttribute("login", login);
	
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
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("http://www.google.com");
		faire(request,response);
	}
}
