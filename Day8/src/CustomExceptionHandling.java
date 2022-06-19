
public class CustomExceptionHandling {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        int age = 12;
	 
	        if (age < 18) {
	            try {
	                System.out.println("before throwing exception");
	                throw new InvalidAgeException();
	            } catch (InvalidAgeException e) {
	                System.out.println(e.getMessage());
	            }
	        } else {
	            System.out.println("Else Block");
	        }
	 
	        System.out.println("Program Ends Here");
	    }
	}

