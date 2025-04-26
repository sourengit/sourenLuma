package datatypes;


//methods= set of executable statements which gets executed when the method is called.
public class Methods  {
//	boolean b=true;
//	
//	static int testvar=80;
//	
//	
//	//class 8th January 2025
//	
//	//syntax: returndatatype methodname(parameters){executable statements}
//	
//	int stay;
//	char s;
//	boolean t;
//	String quest="sun";
	
	
	public static void main(String[]args)
	{
		
//        democlass();
//
//		testvar=90;
//	
//		adding(2,6,9);
//		
		Methods add=new Methods();
//		//add.addition();
//		add.girrafe();
		
		
		add.subtraction();
		add.subtraction(5,6);
		add.subtraction("ferrari",14);
		
		add.subtraction('a',false,"running on");
		
		
		
//		int calledfn=add.dupeSub();
//		System.out.println("output with int return type: "+calledfn);
//		
//		String d=add.sup();
//		System.out.println(d);

	}
	
	
	//meth0d 1
//	 static void girrafe()
//	{ 
//		 testvar=100;
//		 System.out.println(testvar);
//		int num1 =10;
//		int num2=20;
//		System.out.println(num1+num2);
//		
//	}
	 
//	 //methid with args
//	 static void adding(int n,int m,int k)
//	 {
//		 int sum=n+m+k;
//		 System.out.println(sum);
//	 }
	
	 
	 //method 2
	void subtraction()
	{
//		testvar=900;
		int num4=60;
		int num5=20;
		int res=num4-num5;
		System.out.println("optput with void: "+ res);
	}			//output as  40
	
	
	
	void subtraction(int a, int b)
	{
//		testvar=900;
		 a=60;
		 b=10;
		int res=a-b;
		System.out.println("optput with void: "+ res);
	}
	
	

	void subtraction(String s, int j)
	{
		System.out.println("polymorphism string "+s);
		System.out.println("polymorphism integer "+j);

	}
	
	

	void subtraction(char firstchar, boolean b, String m)
	{
		
		System.out.println(firstchar);
		System.out.println(b);

		System.out.println(m);

	}
	
	
	
	
	//method3
//	Integer dupeSub()
//	{
//		testvar=89;
//		int num6=40;
//		int num7=20;
//		int answer=num6-num7;
//		return answer;
//		
//	
//	}
//	
//	String sup()
//	{
//		String s="hello";
//		String t="world";
//		String r=s+t;
//		return r;
//
//	}
	
	

}
