package assignment2;

public class StringRev {
	 public static void main(String[] args) {
		 
		 	String str="It is a beautiful day";
	        String reversed = "";
	        
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i);
	        }
	        System.out.println("Original: "+str);
	        System.out.println("Reversed: " + reversed);
	    }

}
