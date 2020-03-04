package com.nt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.EmpDao;

public class UpdateController extends HttpServlet{
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
			int sal = Integer.parseInt(req.getParameter("sal"));
			boolean isUpdated = EmpDao.update(id, sal);
			if(isUpdated) {
				pw.write("<h2>Employee updated succesfully</h2>");
				pw.write("<a class='btn btn-primary' href='update.html' role='button'>Go Back</a>");
				pw.close();
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		pw.write("<h2 style='color:red;'>Employee didn't Update</h2>");
		pw.write("<a class='btn btn-primary' href='update.html' role='button'>Go Back</a>");
		pw.close();
		
	}
}
