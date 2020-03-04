package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.EmpDao;

public class RegisterController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {	
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			int sal = Integer.parseInt(req.getParameter("sal"));
			boolean isAdded = EmpDao.add(id, name, sal);
			if(isAdded) {
				RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
				req.setAttribute("isRegistered", isAdded);
				rd.forward(req, res);
			}
		} catch (Exception e) {
			System.out.println("Something went wrong: "+e.getMessage());
		}
	
		RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
		req.setAttribute("hasError", true);
		rd.forward(req, res);
	}
	

}
