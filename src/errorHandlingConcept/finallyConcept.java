package errorHandlingConcept;

public class finallyConcept {
	  public static void main(String[] args) {
	        try {
	            int result = 10 / 2; // This will throw ArithmeticException
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        } finally {
	            System.out.println("This block always executes.");
	        }
	    }

}







  
