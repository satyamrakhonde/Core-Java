package com.zensar;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp[] = new Employee[4];
		
		emp[0] = new Manager(1,"Tom",10000,2000);
		emp[1] = new Manager(2,"Jerry",12000,3000);
		emp[2] = new Manager(3,"Ivan",5000,2000);
		emp[3] = new Manager(4,"Belly",6000,5000);
		
		double totalSalOfAllEmployees =getTotalSalOfAllEmployees(emp);
		System.out.println("totalSalOfAllEmployees ="+totalSalOfAllEmployees);
	}
	public static double getTotalSalOfAllEmployees(Employee e[]) {
		double totalSalOfAllEmployees = 0.0;
		for(int i=0;i<e.length;i++) {
			totalSalOfAllEmployees = totalSalOfAllEmployees +e[i].getSalary();
		}
		return totalSalOfAllEmployees;
	}
}
