package datatypes;

public class Asignment extends Arrays {
	
	// Reverse the String-
	//Types of array with syntax
	//for loop and for each loop in multi dimensional array
	//Difference between string buffer and string builder
	//switch case to execute month-
	
	public static void main(String[] args)
	{
		StrRev();
		
		months();
		
		aray();
	}
	
	
	public static void StrRev()
	{
		System.out.println("reverse the string");
		String str = "Friday";
		System.out.println(str);
        int len=str.length();
        //System.out.println(len);
        for(int i=len-1;i>=0;i--)
        {
        	System.out.print(str.charAt(i));
        }
        
	}
	
	public static void months()
	{
		System.out.println();
		System.out.println("Months using switch case");
		
		int month=12;
		
		switch (month) {
		case 1: {
			
			System.out.println("January");
			break;
		}
		case 2: {
			
			System.out.println("February");
			break;
		}
		case 3: {
			
			System.out.println("March");
			break;
		}
		case 4: {
	
			System.out.println("April");
			break;
		}
		case 5: {
	
			System.out.println("May");
			break;
		}
		case 6: {
	
			System.out.println("June");
			break;
		}
		case 7: {
	
			System.out.println("July");
			break;
		}
		case 8: {
			
			System.out.println("August");
			break;
		}
		case 9: {
	
			System.out.println("September");
			break;
		}
		case 10: {
	
			System.out.println("October");
			break;
		}
		case 11: {
	
			System.out.println("November");
			break;
		}
		case 12: {
	
			System.out.println("December");
			break;
		}
	
		
		
		default:
			System.out.println("invalid input");
		}
	}
	
	public static void aray()
	{
		System.out.println("For loop using multi dimensional array");
		
		int[][] md_aray= {{1,2},{3,4}};
				
		for(int i=0; i<md_aray.length;i++)
		{
			for(int j=0; j<md_aray.length;j++)
			{
				System.out.print(md_aray[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("for each using mutidimensional array");
		for(int[] singleArray:md_aray)
		{
			for(int eachValue:singleArray)
			{
				System.out.print(eachValue+" ");
			}
			System.out.println();
		}
		
	}
	
}
