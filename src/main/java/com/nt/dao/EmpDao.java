package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.nt.entity.Employee;
import com.nt.utility.ConnectionFactory;

public class EmpDao {
	
	public static List<Employee> selectAll() {
		try {
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM emp");
			ResultSet rs = ps.executeQuery();
			
			List<Employee> emp = new ArrayList<>();
			while(rs.next()) {
				emp.add(new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
			return emp;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Employee select(int id) {
		try {
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM emp WHERE eid = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static boolean add(int id, String name, int sal) {
		try {
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement("INSERT INTO employee.emp (eid, ename, esal) VALUES(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, sal);
			int result = ps.executeUpdate();
			if(result > 0)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean update(int id, int sal) {
		try {
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement("UPDATE emp SET esal=? WHERE eid=?");
			ps.setInt(1, sal);
			ps.setInt(2, id);
			int result = ps.executeUpdate();
			if(result > 0)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean delete(int id) {
		try {
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement ps = con.prepareStatement("DELETE from emp WHERE eid=?");
			ps.setInt(1, id);
			int result = ps.executeUpdate();
			if(result > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
