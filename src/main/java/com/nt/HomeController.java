package com.nt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) {
			String loginCookie = null;
			try {
				Cookie[] ck = req.getCookies();
				for(Cookie c: ck) {
					String key = c.getName();
					if(key.equals("login")) {
						loginCookie = c.getValue();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			try {
				if(loginCookie != null && !loginCookie.isEmpty()) {
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

}