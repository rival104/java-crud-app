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
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			int sal = Integer.parseInt(req.getParameter("sal"));
			boolean isAdded = EmpDao.add(id, name, sal);
			
			if(isAdded) {
				pw.write("<h2> Employee added successfully </h2>");
				pw.write("<a class=\"btn btn-primary\" href=\"register.html\" role=\"button\">Go Back</a>");
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		pw.write("<h2 style='color:red;'>Error adding employees!!</h2>");
		pw.write("<a class=\"btn btn-primary\" href=\"register.html\" role=\"button\">Go Back</a>");
		
		pw.close();

	}
	

}
