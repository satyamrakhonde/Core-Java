import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StreamsDemo {
	 
	    public static void main(String[] args) throws IOException {
	        // TODO Auto-generated method stub
	        // Getting input from user using StreamReader
	        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	        String str;
	        System.out.print("Enter any Text :");
	        str = stdin.readLine();
	        System.out.println("Entered Text is : " + str);
	        int a;
	        System.out.print("Please Enter a number :");
	        a = stdin.read(); // 2 byte unicode character
	        System.out.println("Entered number is :" + (char) a);
	        
	        System.out.println("Enter your age:");
	        int age = Integer.parseInt(stdin.readLine());
	        System.out.println("Entered number is :" +age);
	        // Stream readers will store the data in ASCII format
	 
//	        Scanner scan = new Scanner(System.in);
//	        System.out.print("Enter any text :");
//	        str = scan.nextLine();
//	        System.out.println("Entered Text is : " + str);
//	        System.out.print("Please Enter a number :");
//	        a = scan.nextInt(); // 2 byte unicode character
//	        System.out.println("Entered number is :" + a);
//	 
	    }
	 
}


