package errorHandlingConcept;

public class TryCatchConcept {
	public static void main(String[] args) throws Exception {
		trytest();
		trytest2();
	}
	public static void trytest()
	{
		int a=100;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("exception occured catch");
		}
		finally
		{
			System.out.println("handled exception finally");
		}
	}
	public static void trytest2() throws Exception
	{
		int d=20;
		int c=10;
		int res=d/c;
		System.out.println("result is: "+res);
		throw new Exception();
	}
}
