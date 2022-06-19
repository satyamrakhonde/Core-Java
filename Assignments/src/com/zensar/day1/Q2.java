package com.zensar.day1;

public class Q2 {

	public static void main(String[] args) {
		ComplexNumber obj1 = new ComplexNumber(5,8.78);
		System.out.println(obj1);
		ComplexNumber obj2 = new ComplexNumber(3,7.81);
		System.out.println(obj2);
		
		System.out.println(ComplexNumber.add(obj1,obj2));
	}
	
public Q2() {
		super();
		// TODO Auto-generated constructor stub
	}

class ComplexNumber{
	private double real;
	private double imaginary;
	
	public ComplexNumber(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

	@Override
	public String toString() {
		String value = null;
		if(imaginary < 0) {
			value = real +"-i"+imaginary;
		}
		else {
			value = real +"i"+imaginary;
		}
	
		return value;
	}
	
	public ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber temp = new ComplexNumber();
		temp.real = c1.getReal() + c2.getReal();
		temp.imaginary = c1.getImaginary() + c2.getImaginary();
		return temp;
	}
	
	public ComplexNumber sub(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber temp = new ComplexNumber();
		temp.real = c1.getReal() - c2.getReal();
		temp.imaginary = c1.getImaginary() - c2.getImaginary();
		return temp;
	}
	
	public ComplexNumber mul(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber temp = new ComplexNumber();
		temp.real = c1.getReal() * c2.getReal();
		temp.imaginary = c1.getImaginary() * c2.getImaginary();
		return temp;
	}
}
}
