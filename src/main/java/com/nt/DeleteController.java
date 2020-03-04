package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.EmpDao;

public class DeleteController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = null;
		try {
			pw = resp.getWriter();
			resp.setContentType("text/html");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			int id = Integer.parseInt(req.getParameter("id"));
			boolean isDeleted = EmpDao.delete(id);
			if(isDeleted) {
				pw.write("<h2>Employee deleted succesfully</h2>");
				pw.write("<a class='btn btn-primary' href='delete.html' role='button'>Go Back</a>");
				pw.close();
				return;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		pw.write("<h2 style='color:red;'>Error Deleting Employee</h2>");
		pw.write("<a class='btn btn-primary' href='delete.html' role='button'>Go Back</a>");
		pw.close();
	}

}
