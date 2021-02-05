package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Implenetation.DonnateurImpl;
import DAO.interfaces.IDonnateur;
import Models.Donnateur;

@WebServlet(name = "auth_dona", urlPatterns = {"*.auth_dona"})
public class auth_dona_Servlet extends HttpServlet {
	
	//1)Injection des dépendences
	private IDonnateur donaLogin_Dao;
	@Override
	public void init() throws ServletException {
		donaLogin_Dao=new DonnateurImpl();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("auth_dona.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1)Lire les données
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Donnateur donnateur=new Donnateur();
		donnateur.setDona_email(email);
		donnateur.setDona_password(password);
		boolean flag=donaLogin_Dao.Check_login_dona(donnateur);
		if(flag) {
			HttpSession session=request.getSession();
			session.setAttribute("dona_email", donnateur.getDona_email());
			session.setAttribute("dona_fname",donnateur.getDona_fname());
			session.setAttribute("dona_id", donnateur.getDona_id());
			request.getRequestDispatcher("acceuil_dona.jsp").forward(request, response);
			
		}
		else {
			request.getRequestDispatcher("auth_dona.jsp").forward(request, response);
		}
	}
}
