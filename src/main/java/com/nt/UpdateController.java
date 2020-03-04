package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.EmpDao;

public class UpdateController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			int sal = Integer.parseInt(req.getParameter("sal"));
			boolean isUpdated = EmpDao.update(id, sal);
			if(isUpdated) {
				RequestDispatcher rd = req.getRequestDispatcher("update.jsp");
				req.setAttribute("isUpdated", isUpdated);
				rd.forward(req, res);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("update.jsp");
		req.setAttribute("hasError", true);
		rd.forward(req, res);
		
	}
}
