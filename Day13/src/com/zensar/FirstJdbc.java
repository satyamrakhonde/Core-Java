package com.zensar;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbc {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		//Step 1: Load & Register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Step 2: Establish Connection
        String url = "jdbc:mysql://localhost:3306/zensar";
        Connection conn = DriverManager.getConnection(url, "root", "root");

        //Step 3: Creating and executing query
        String query = "select * from employee";
        Statement stmt = conn.createStatement();

        //step 4 : storing & processing result
        ResultSet rs = stmt.executeQuery(query);
        System.out.println("================Department Table Contents=====================");
        System.out.println("ID \t NAME \t SALARY");
        System.out.println("==============================================================");
        while(rs.next()) {
            System.out.println(rs.getInt("emp_id")+"\t "+rs.getString("emp_name")+"\t "+rs.getFloat("emp_sal"));
        }
 
        //step 5 : close resources
        if (rs!=null)
            rs.close();
        if (stmt !=null)
            stmt.close();
        if(conn!=null)
            conn.close();
	}

}
