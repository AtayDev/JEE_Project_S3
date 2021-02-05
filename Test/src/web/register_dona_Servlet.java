package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Implenetation.DonnateurImpl;
import DAO.interfaces.IDonnateur;
import Models.Donnateur;

@WebServlet(name = "register_dona", urlPatterns = {"*.register_dona"})
public class register_dona_Servlet extends HttpServlet
{
	//1)Injection des dépendences
	private IDonnateur donaDao;

	@Override
	public void init() throws ServletException {
		
		donaDao=new DonnateurImpl();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("register_dona.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String password=request.getParameter("password");
		String telephone=request.getParameter("telephone");
		///////////////////////////////////////////////////////
		
		Donnateur donnateur=donaDao.insertDonnateur(new Donnateur(email,fname,lname,password,telephone));
		request.setAttribute("donnateur", donnateur);
		request.getRequestDispatcher("ConfirmationDONNA.jsp").forward(request, response);
	}
}
