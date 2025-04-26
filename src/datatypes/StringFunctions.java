package datatypes;

public class StringFunctions {

	public static void main(String[] args)
	{
		StrFunctions();
	}
	
	public static void StrFunctions()
	{
		
		//1st method
			
		String str="Ferrari";		//inilizing a var-str
		
		System.out.println("length of string -"+str.length());		 
		
		//System.out.println();			
		
		
		//2nd method
		
		String str2="Ferrari";
		
		System.out.println("Checking if "+str+" is equal to "+str2+": "+str2.equals(str));
		
		//System.out.println();
		
		
		//3rd mehtod
		
		String str3="FERRARI";
		System.out.println("Checking Ignore Case function: "+str2+" with "+str3);
		System.out.println(str2.equalsIgnoreCase(str3));
		
		//4th method
		
		System.out.println("converting "+str+" to uppercase"+ str.toUpperCase());
		System.out.println();
		
		//5th method
		
		System.out.println("converting "+str+" to lowercase");
		System.out.println(str.toLowerCase());
		
		//6th method
		
		String me="theory";
		System.out.println("Checking if "+me+" starts with 'the'");
		System.out.println(me.startsWith("the"));
		
		//7th method
		
		
		System.out.println("checkin if "+str+" ends with 'Hour'");
		System.out.println(str.endsWith("Hour"));
		
		//8th method
		
		System.out.println("checking if "+str+" contains "+str2);
		System.out.println(str.contains(str2));
		
		//9th method
		System.out.println("printing index value of 'r' in"+str);	//ferrari		f-0 e-1 r-2 r-3 a-4 r-5 i-6
		System.out.println(str.indexOf("r"));
		
		System.out.println("checking last index of 'r' in "+str2);	//ferrari
		System.out.println(str2.lastIndexOf("r"));
		
		
		
		System.out.println("Getting value using charAt function for string"+str);
		System.out.println(str.charAt(1));
		
		
		
		System.out.println("Replacing character 'F' with 'S' in string "+str2);
		System.out.println(str2.replace("F", "S"));
		
		System.out.println("using substring frunction with single parameter for string: "+str2);	//ferrari		f-0 e-1 r-2 r-3 a-4 r-5 i-6
		System.out.println(str2.substring(1));
		
		System.out.println("substring function with 2 parmeters for string: "+str2);
		System.out.println(str2.substring(3,5));
		
		
		String go="";
		System.out.println("checking if the string is empty for: "+go);
		System.out.println(go.isEmpty());
		
		
		System.out.println("using concat function for string "+str2+" and "+str3);
		System.out.println(str2.concat(str3).concat(str));
		
		String str4="       J   Ac  k Spa  rrow          ";
		System.out.println("Using trim function for "+str4);
		System.out.println(str4.trim());
		
		
		String str5 = "AppleOr,ange,Banana,Grapes";
		System.out.println("Spit function for array:");
		 String[] fruits = str5.split(",");
		 
		 
		 System.out.println("Fruits list:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
		


	}

	
	// equalsIgnoreCase(), toUpperCase(), toLowerCase(), startsWith(), endsWith(), contains(), indexOf()
	// lastIndexOf(), charAt(), replace(), subString(), isEmpty(), split(), trim(), concat(),
	
}
