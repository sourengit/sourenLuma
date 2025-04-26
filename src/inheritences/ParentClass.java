package inheritences;

public class ParentClass extends GrandParentClass {
	public static void main(String[] args)
	{
		ParentClass pc=new ParentClass();
//		pc.land();
//		pc.money();
		pc.FinalConcept();
		
	}
	public void land()
	{
		System.out.println("Farm Land");
	}
	public void money()
	{
		System.out.println("10,000");
	}
	
	public static void FinalConcept()
	{
		System.out.println("this is parent method");
	}

}
