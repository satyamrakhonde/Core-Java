

public class PrintAll {


			void printAll(Object obj,Object obj1) {
				System.out.println("Circle object created at location"+obj);
				System.out.println("Circle object created at location"+obj1);
			
			}

			public static void main(String args[]) {
			
				Printable obj = new Circle();
				obj.print();
				
				Printable obj1 = new Employee();
				obj1.print();
				
				PrintAll a = new PrintAll();
				a.printAll(obj, obj1);
			}
		}

