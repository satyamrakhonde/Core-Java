public class ComplexNumber {

double real,imaginary;

	ComplexNumber(double r, double i){
		real = r;
		imaginary = i;
	}
	ComplexNumber(){

	}	

	static ComplexNumber add(ComplexNumber n1, ComplexNumber n2){
		ComplexNumber temp = new ComplexNumber();
		temp.real = n1.real + n2.real;
		temp.imaginary = n1.imaginary + n2.imaginary;
		return temp;
	}

	static ComplexNumber sub(ComplexNumber n1, ComplexNumber n2){
		ComplexNumber temp2 = new ComplexNumber();
		temp2.real = n1.real - n2.real;
		temp2.imaginary = n1.imaginary - n2.imaginary;
		return temp2;
	}

	static ComplexNumber mul(ComplexNumber n1, ComplexNumber n2){
		ComplexNumber temp3 = new ComplexNumber();
		temp3.real = n1.real * n2.real;
		temp3.imaginary = n1.imaginary * n2.imaginary;
		return temp3;
	}

	void printComplexNum() {
		System.out.println("Complex Number"+real+"+"+imaginary+"i");
	}

public static void main(String[] args) {
	ComplexNumber c1 = new ComplexNumber(10.0,10.0);
	ComplexNumber c2 = new ComplexNumber(4.5,5.5);
	ComplexNumber c3 = new ComplexNumber(102.3,501.4);
	ComplexNumber temp = add(c1,c2);
	temp.printComplexNum();

	ComplexNumber temp2 = sub(c1,c2);
	temp2.printComplexNum();

	ComplexNumber temp3 = mul(c1,c2);
	temp3.printComplexNum();

}

}