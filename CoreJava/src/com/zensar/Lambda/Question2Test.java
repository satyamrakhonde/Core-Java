package com.zensar.Lambda;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Custom Annotation 
@Retention(RetentionPolicy.RUNTIME) 
@Target({ElementType.METHOD })
@interface Custom{	
}

//Creating classEmployee having fields id, name & salary. Add constructor, getter/setter & toString()
class Employee{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Custom
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Custom
	public void print() {
		
	}
}

public class Answer2 {

	public static void main(String[] args) throws Exception {
		Employee e=new Employee(14,"Jerry",1000.00);
		System.out.println("Employee = "+e);
		
		Class classEmp=Employee.class;
		Annotation ann[]=classEmp.getDeclaredAnnotations();
		Method method=classEmp.getDeclaredMethod("getName",null);
		ann =method.getDeclaredAnnotations();
		for(int i=0;i<ann.length;i++) {
			System.out.println(ann[i]);
		}
		
		//For method level annotation is found or not
		Method methods[]=classEmp.getDeclaredMethods();
		for(Method method1:methods) {
			Annotation annotations[] = method1.getAnnotations();
			for(Annotation annotation1: annotations) {
				if(annotation1.toString().contains("Department")) {
					//logic to confirm whether its legal to apply toString annotation for this method.
					String methodName = method1.getName();
					if(methodName.startsWith("get")) {
						String expetcedField = methodName.substring(3).toLowerCase();
						try {
							Field field = classEmp.getDeclaredField(expetcedField);
						}
						catch(NoSuchFieldException e1) {
							System.out.println("Its illegal to apply Custom annotation: " + methodName);
						}
					}
					else {
						System.out.println("Its illegal to apply Custom annotation: " + methodName);
					}
				}
			}
		}
	}

}