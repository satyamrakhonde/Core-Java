package com.zensar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.zensar.JDBCCRUD;
import com.zensar.entity.Student;

public class StudentDAO {
	
	private static Connection conn;
	private static Statement stmt;
	private static ResultSet rs;
	private static PreparedStatement prs;
	
	private static final String JDBC_URL ="jdbc:mysql://localhost:3306/zensar";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String DRIVER_URL ="com.mysql.cj.jdbc.Driver";
	
	public static void connect() {
		try {
		Class.forName(DRIVER_URL);
		conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static int create(Student student) {
		connect();
		int status = 0;
		String query = "insert into student(roll_no,name,email,father_name) values(?,?,?,?)";
		try {
			prs = conn.prepareStatement(query);
			prs.setInt(1, student.getRoll_no());
			prs.setString(2, student.getName());
			prs.setString(3, student.getEmail());
			prs.setString(4, student.getFather_name());
			status = prs.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static int update(int roll_no,Student student) {
		connect();
		int status = 0;
		String query = "update student set name=?,email=?,father_name=? where roll_no=?";
		try {
			prs = conn.prepareStatement(query);
			prs.setString(1, student.getName());
			prs.setString(2, student.getEmail());
			prs.setString(3, student.getFather_name());
			prs.setInt(4, roll_no);
			status = prs.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static int delete(int roll_no) {
		connect();
		int status = 0;
		String query ="delete from student where roll_no=" +roll_no;
		try {
			stmt = conn.createStatement();
			status = stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static void readAll() {
		connect();
		String query = "select * from student";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println("ROLLNO  NAME \t EMAIL \t FATHER NAME");
			while(rs.next()) {
				System.out.println(rs.getInt("roll_no") + "  \t" + rs.getString("name")+" \t"+ rs.getString("email")+"\t" +rs.getString("father_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void readOne(int roll_no) {
		connect();
		String query = "select * from student where roll_no=" +roll_no;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println("ROLLNO  NAME \t EMAIL \t FATHER NAME");
			while(rs.next()) {
				System.out.println(rs.getInt("roll_no") + "  \t" + rs.getString("name")+" \t"+ rs.getString("email")+"\t" +rs.getString("father_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close() {
		try {
			if(rs!= null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
