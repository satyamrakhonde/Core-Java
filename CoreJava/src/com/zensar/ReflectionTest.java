package com.zensar;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

class House{
	private String city="Pune";
	public void foo() {
		System.out.println("Inside foo()");
	}
}
public class ReflectionTest {

	public static void main(String[] args) throws Exception{

		String className = args[0];
		Class c = Class.forName(className);
		Constructor con[] = c.getDeclaredConstructors();
		Field f[] = c.getDeclaredFields();
		Method m[] = c.getDeclaredMethods();	
		
		for(int i =0; i<con.length;i++)
			System.out.println(con[i]);
		for(int i =0; i<f.length;i++)
			System.out.println(f[i]);
		for(int i =0; i<m.length;i++)
			System.out.println(m[i]);
		
		
		int modifiers = classHouse.getModifiers();
		System.out.println("Is Abstract class?:" + Modifiers.isAbstract(modifiers));
		System.out.println("Is Final class?:" + Modifiers.isFinal(modifiers));

		Field cityField =classHouse.getDeclaredField("city");
		cityField.setAccessible(true);
		System.out.println("Private city Field"+cityField.get(new House()));
	}

}
