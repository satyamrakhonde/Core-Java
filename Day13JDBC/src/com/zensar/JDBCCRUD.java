package com.zensar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCCRUD {
	
	private static Connection conn;
	private static Statement stmt;
	private static ResultSet rs;
	
	private static final String JDBC_URL ="jdbc:mysql://localhost:3306/zensar";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String DRIVER_URL ="com.mysql.cj.jdbc.Driver";
	
	public static void connect() {
		try {
		Class.forName(DRIVER_URL);
		JDBCCRUD.conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static int create() {
		JDBCCRUD.connect();
		int status = 0;
		String query = "insert into student(roll_no,name,email,father_name) values(102,'sample','sample@gmail.com','test')";
		try {
			JDBCCRUD.stmt = conn.createStatement();
			status = stmt.executeUpdate(query);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static int update() {
		JDBCCRUD.connect();
		int status = 0;
		String query = "update student set name='updated',email='update@gmail.com',father_name='test123' where roll_no=102";
		try {
			JDBCCRUD.stmt = conn.createStatement();
			status = stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static int delete() {
		JDBCCRUD.connect();
		int status = 0;
		String query ="delete from student where roll_no=102";
		try {
			JDBCCRUD.stmt = conn.createStatement();
			status = stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static void readAll() {
		JDBCCRUD.connect();
		String query = "select * from student";
		try {
			JDBCCRUD.stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println("ROLLNO  NAME \t EMAIL \t FATHER NAME");
			while(rs.next()) {
				System.out.println(rs.getInt("roll_no") + "  \t" + rs.getString("name")+" \t"+ rs.getString("email")+"\t" +rs.getString("father_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void readOne() {
		JDBCCRUD.connect();
		String query = "select * from student where roll_no=101";
		try {
			JDBCCRUD.stmt = conn.createStatement();
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
	
	public static void showDesign() {
		for(int i = 0; i <61; i++) {
			System.out.print("*");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int choice = 0;
		while (choice <= 5) {
			JDBCCRUD.showDesign();
			JDBCCRUD.showDesign();
			System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
			System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
			System.out.println("* \t\t\t\t\t Welcome to JDBC CRUD Operations \t\t\t\t\t\t    *");
			System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
			System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
			JDBCCRUD.showDesign();
			JDBCCRUD.showDesign();
			System.out.println(" \n ");
			System.out.println("\t\t\t\t 1. Read Student Table.");
			System.out.println("\t\t\t\t 2. Insert a Student.");
			System.out.println("\t\t\t\t 3. Update a Student.");
			System.out.println("\t\t\t\t 4. Delete a Student.");
			System.out.println("\t\t\t\t 5. Exit.");
			System.out.print("Please Enter your Choice [1-5] : ");
			choice = input.nextInt();
			int status =0;
			switch (choice) {
			case 1:
				JDBCCRUD.readAll();
				break;
			case 2:
				status = JDBCCRUD.create();
				if (status>0) 
					System.out.println("***************** Inserted Successfully *****************");
				break;
			case 3:
				status = update();
				if (status>0) {
					System.out.println("***************** Updated Successfully *****************");
				}
				break;
			case 4:
				status = delete();
				if (status>0) 
					System.out.println("***************** Deleted Successfully *****************");
				break;
			case 5:
				System.out.println("*********************** Thanks for Using our Application ***********************");
				close();
				System.exit(0);
				break;
			default:
				System.out.println("Please Enter a whole number between 1 to 5 only");
				break;
			}
		}
	}
}

