package datatypes;

public class ConditionalStatements {
 
	//class_7th_feb_35
		//conditional statements
	
	public static void main(String[] args) {
		
		//if else statement
		
		System.out.println("if else statement example:");
		
		int value=2;
		
		System.out.println("Current value:"+value);
		
//		//syntax:    if(condition){	}else{}
		
		if (value<5) {
			
			System.out.println("value greater than 5");
			
		} else {
			
			System.out.println("value smaller than 5");
		}
		
		
		//if else assignment 
		System.out.println("Example for if else statement with marks");

		int marks =101;
		
		//syntax   if(condition){}else if(condition){}else
		
		if(marks>=30 & marks<50)	//false
		{
			System.out.println("B Grade");

		} else if(marks>=50 & marks<70)
		{
			System.out.println("B+ Grade");

		}else if(marks>=70 & marks<90)
		{
			System.out.println("A Grade");

		} else if(marks>=90 & marks<=100)
		{
			System.out.println("A+ Grade");

		}else
		{
			System.out.println("fail");
		}
		
		
		
		
		
		//nested if else statement
		System.out.println("nested if else statement example:");
		
		//Syntax if(condition1){if(cindition2){}else{}}else{} 
		
		int age=45;
		
		System.out.println("Age Of Person :"+age);
		
		if (age>=18) {
			
			if(age>=50) {
		
				System.out.println("Person is a senior citizen");
			}
			else {
				
				System.out.println("Person is an adult");
			}
		}
		else {
			System.out.println("Person is not an adult");
		}
		
		
		//switch case example
		System.out.println("switch case example");
		
		int day=3;
		
		switch (day) {
		case 1: {
			
			System.out.println("Sunday");
			break;
		}
		case 2: {
			
			System.out.println("Monday");
			break;
		}
		case 3: {
			
			System.out.println("Tuesday");
			break;
		}
		case 4: {
	
			System.out.println("Wednesday");
			break;
		}
		case 5: {
	
			System.out.println("Thrusday");
			break;
		}
		case 6: {
	
			System.out.println("Friday");
			break;
		}
		case 7: {
	
			System.out.println("Saturday");
			break;
		}
		default:
			System.out.println("invalid input");
		}
		
		
		//for statement 		
		System.out.println("for statement example:");
		
		//Syntax: for(initialize;condition;increment/decrement){}
		
		//1st ex= i=0 -> 0<5 ->0 -> i=1
		//2nd ex= i=1 -> 1<5 ->1 -> i=2
		//3rd ex= i=2 -> 2<5 ->2 -> i=3
		//4th ex= i=3 -> 3<5 ->3 -> i=4
		//5th ex= i=4 -> 4<5 ->4 -> i=5
		//6th ex=i=5 -> 5<5 ->exit the loop
		
		
		
		//0,2,4,6,8
		
		//
		
		for(int i=0 ; (i+2)<10 ; i++)
		
		{
			
			System.out.println(i);
			
		
		}
		
		//for statement with decrement operator		
				System.out.println("for statement example with decrement operator:");
				for(int j=5;j>0;j--)
				{
					System.out.println(j);
				}
		
		//class ends
				
		//class 8th February 2025
		
		
		
		
		
		
		
		
		
		//class ends
		}
		
	}


