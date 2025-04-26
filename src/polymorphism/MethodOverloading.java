package polymorphism;

public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading MOl=new MethodOverloading();
		MOl.add(20, 40);
		MOl.add(20, 40,60);
		MOl.add(20, 40, 60,80);
		
	}
	
	public void add(int num1, int num2)
	{
		int newValue=num1+num2;
		System.out.println("new value with 2 parameters: "+newValue);
	}
	
	public void add(int num1, int num2, int num3)
	{
		int newValue=num1+num2+num3;
		System.out.println("new value with 3 parameters: "+newValue);
	}
	
	public void add(int num1, int num2, int num3, int num4)
	{
		int newValue=num1+num2+num3+num4;
		System.out.println("new value with 4 parameters: "+newValue);
	}

}
