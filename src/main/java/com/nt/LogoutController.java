package com.nt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie ck = new Cookie("login",null);
		res.addCookie(ck);
		req.getSession().invalidate();
		LoginController.setLoggedIn(false);
		
//		//get a particular cookie
//		Cookie[] ck = req.getCookies();
//		String loginCookie = null;
//		for(Cookie c: ck) {
//			if(c.getName().equals("login")) {
//				c.setMaxAge(0);
//				System.out.println("Triggered!");
//				res.addCookie(c);
//				req.getSession().invalidate();
//			}
//		}
		
		RequestDispatcher rd = req.getRequestDispatcher("login.html");
		rd.include(req, res);
		
	}

}
