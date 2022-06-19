package com.zensar;

import java.util.Scanner;

import com.zensar.dao.StudentDAO;
import com.zensar.entity.Student;

public class CRUDUsingDAO {
	public static void showDesign() {
		for(int i = 0; i < 61; i++) {
			System.out.print("*");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int roll_no = 0;
		String name = null;
		String email = null;
		String father_name = null;
		int choice = 0;
		while(choice <= 5) {
			showDesign();
			showDesign();
			System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
			System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
			System.out.println("* \t\t\t\t\t Welcome to JDBC CRUD Operations \t\t\t\t\t\t    *");
			System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
			System.out.println("*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    *");
			showDesign();
			showDesign();
			System.out.println(" \n ");
			System.out.println("\t\t\t\t 1. Read Student Table.");
			System.out.println("\t\t\t\t 2. Insert a Student.");
			System.out.println("\t\t\t\t 3. Update a Student.");
			System.out.println("\t\t\t\t 4. Delete a Student.");
			System.out.println("\t\t\t\t 5. Exit.");
			System.out.print("Please Enter your Choice [1-5] : ");
			choice = input.nextInt();
			int status = 0;
			switch (choice) {
			case 1:
				StudentDAO.readAll();
				break;
			case 2:
				System.out.print("Enter Student Roll Number :");
				roll_no = input.nextInt();
				System.out.print("Enter Student Name :");
				name = input.next();
				System.out.println("Enter Email Address :");
//				input.nextLine();
				email = input.next();
				System.out.println("Enter Father Name :");
//				input.nextLine();
				father_name = input.next();
				Student student = new Student(roll_no, name, email, father_name);
				status = StudentDAO.create(student);
				if (status > 0)
					System.out.println("***************** Inserted Successfully *****************");
				break;
			case 3:
				System.out.print("Enter the roll_no of the student to update:");
				roll_no = input.nextInt();
				StudentDAO.readOne(roll_no);
				System.out.print("Enter Student Name to Update :");
				name = input.next();
				System.out.print("Enter Email to Update :");
//				input.nextLine();
				email = input.next();
				System.out.print("Enter Father Name to Update :");
//				input.nextLine();
				father_name = input.next();
				Student stu = new Student(roll_no, name, email, father_name);
				status = StudentDAO.update(roll_no, stu);
				if (status > 0) {
					System.out.println("***************** Updated Successfully *****************");
				}
				break;
			case 4:

				System.out.print("Enter the roll_no of the student to Delete:");
				roll_no = input.nextInt();
				status = StudentDAO.delete(roll_no);
				if (status > 0)
					System.out.println("***************** Deleted Successfully *****************");
				break;
			case 5:
				System.out.println("*********************** Thanks for Using our Application ***********************");
				StudentDAO.close();
				System.exit(0);
				break;
			default:
				System.out.println("Please Enter a whole number between 1 to 5 only");
				break;
			}
		}

	}
	
}
