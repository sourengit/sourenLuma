package datatypes;

import java.util.Scanner;

public class GettingInput {
	public static void main(String[] args) {
		Scanner var=new Scanner(System.in);
		System.out.println("Enter Name: ");
		
		
		String name=var.nextLine();
		System.out.println("Name is "+name);
		
		//getting integer input
		System.out.println("Enter ID: ");
		int id=var.nextInt();
		System.out.println(name+" is given id-no: "+id);
		
		// Getting a double input
        System.out.println("Enter Salary: ");
        double salary = var.nextDouble();
        System.out.println(name + " has a salary of INR" + salary);
        
        // Getting a float input
        System.out.println("Enter Rating (out of 5): ");
        float rating = var.nextFloat();
        System.out.println(name + " has a rating of " + rating + " out of 5");

        // Getting a boolean input
        System.out.println("Are you employed? (true/false): ");
        boolean isEmployed = var.nextBoolean();
        System.out.println(name + " is currently employed: " + isEmployed);
        
        //getting a char input
        System.out.println("Enter Gender: ");
        char gen=var.next().charAt(0);
        System.out.println(name + " is : " + gen);
        
        democlass();
 
	}
	
	public static void democlass()
	{
		System.out.println("this is an inherited method");
	}
}
