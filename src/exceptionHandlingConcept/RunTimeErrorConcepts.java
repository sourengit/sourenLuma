package exceptionHandlingConcept;

import java.util.Scanner;

public class RunTimeErrorConcepts {
	public static void main(String[] args) {
		//arthmtc();
		//indexout();
		//numberFormatError();
		inputMismatchError();
		
	}
	
	public static void arthmtc()
	{
		System.out.println("arithematic exception:");
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		
	}
	
	public static void indexout()
	{
		//int[] litaray= {1,2,3,4};
		//System.out.println(litaray[4]);
		
		String s=null;
		System.out.println(s.length());
	}
	
	public static void numberFormatError()
	{
		String val="300rs";
		int rs=Integer.parseInt(val);
		System.out.println(rs);
	}
	
	public static void inputMismatchError()
	{
		Scanner val1=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=val1.nextInt();
		System.out.println(age);
	}

}
