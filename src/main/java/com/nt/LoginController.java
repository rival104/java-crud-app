package com.nt;



import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet{
	private static boolean loggedIn = false;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {
		String username = req.getParameter("user");
		String password = req.getParameter("pass");
		try {
			if(username.equals(password)) {
				Cookie ck = new Cookie("login",username);
				req.getSession().setAttribute("user", username);
				req.getSession().setAttribute("isLoggedIn", true);
				res.addCookie(ck);
				
				loggedIn = true;
				
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				rd.forward(req, res);
			}else{
				RequestDispatcher rd = req.getRequestDispatcher("login.html");
				rd.forward(req, res);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static boolean getLoggedIn() {
		return loggedIn;
	}
	
	public static void setLoggedIn(boolean log) {
		loggedIn = log;
	}

}
