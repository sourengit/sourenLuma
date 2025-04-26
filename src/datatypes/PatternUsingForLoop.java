package datatypes;

public class PatternUsingForLoop {

	public static void main(String[] args)
	{
		System.out.println("Pattern using for loop:");
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("ascending pattern using for loop:");
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
