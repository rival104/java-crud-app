package com.nt;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HomeFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		boolean loggedIn = false;
		try {
			loggedIn = LoginController.getLoggedIn();
			System.out.println("filter log state: " + loggedIn);
		} catch (Exception e) {
			System.out.println("filter log state: NULL");
		}
		
		try {
			if(loggedIn) {
				chain.doFilter(req, res);
			}else {
				RequestDispatcher rd = req.getRequestDispatcher("login.html");
				rd.forward(req, res);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
