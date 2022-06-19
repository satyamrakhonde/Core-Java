package com.zensar;

class Line extends Shape{
	@Override
	void draw(){
		System.out.println("Draw a Line");
	}
}
class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("Draw a rectangle");
	}
}
class Cube extends Shape{
	@Override
	void draw() {
		System.out.println("Draw a cube");
	}
}

abstract class Shape {
	abstract void draw();
}

public class ShapeTest{
	public static void main(String[] args) {
		Shape s[] = new Shape[4];
		
		s[0] = new Line();
		s[1] = new Rectangle();
		s[2] = new Cube();
		
		s[0].draw();
		s[1].draw();
		s[2].draw();
	}
}
