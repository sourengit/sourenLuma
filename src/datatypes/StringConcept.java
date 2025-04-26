package datatypes;
//class for 12th February 25
//string is a class as well


public class StringConcept {
	
	public static void main(String[] args)
	{
		Literal_immutable();
		Non_Literal_Mutable();
		Non_Literal_Mutable_StringBuilder();
		
	}
	
	public static void Literal_immutable() {
		System.out.println("Literal ImMutable");

		String str ="five";
		System.out.println(System.identityHashCode(str));
		String str1="five";
		System.out.println(System.identityHashCode(str1));
		String str2="star";
		System.out.println(str.concat(str2));

	}
	

	public static void Non_Literal_Mutable() {
		System.out.println("Non Literal Mutable");
		StringBuffer var=new StringBuffer("Jack");
		System.out.println(System.identityHashCode(var));
		StringBuffer var1=new StringBuffer("Jack");
		System.out.println(System.identityHashCode(var1));
		StringBuffer var2=new StringBuffer("Sparrow");
		var=var.append(var2);
		System.out.println(System.identityHashCode(var));
	}
	
	public static void Non_Literal_Mutable_StringBuilder() {
	    System.out.println("Non Literal Mutable with StringBuilder");

	    // Create a StringBuilder object
	    StringBuilder var = new StringBuilder("Jack");
	    System.out.println(System.identityHashCode(var)); // Print hash code of `var`

	    // Create another StringBuilder object
	    StringBuilder var1 = new StringBuilder("Jack");
	    System.out.println(System.identityHashCode(var1)); // Print hash code of `var1`

	    // Create a third StringBuilder object
	    StringBuilder var2 = new StringBuilder("Sparrow");

	    // Append var2 to var
	    var = var.append(var2);
	    System.out.println(System.identityHashCode(var)); // Print hash code of `var` after append
	}

	
	
	

}
