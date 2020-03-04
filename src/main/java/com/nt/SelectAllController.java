package com.nt;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.EmpDao;
import com.nt.entity.Employee;

public class SelectAllController  extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Employee> e = EmpDao.selectAll();
		req.setAttribute("empList", e);
		
		RequestDispatcher rd = req.getRequestDispatcher("displayAll.jsp");
		rd.forward(req, resp);
	}
}
