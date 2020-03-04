package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.EmpDao;

public class DeleteController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {	
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			boolean isDeleted = EmpDao.delete(id);
			if(isDeleted) {
				RequestDispatcher rd = req.getRequestDispatcher("delete.jsp");
				req.setAttribute("isDeleted", isDeleted);
				rd.forward(req, res);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = req.getRequestDispatcher("delete.jsp");
		req.setAttribute("hasError", true);
		rd.forward(req, res);
	}

}
