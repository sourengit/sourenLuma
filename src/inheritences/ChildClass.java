package inheritences;

public class ChildClass extends ParentClass {
	public static void main(String[] args)
	{
		ChildClass cc=new ChildClass();
		cc.car();
		cc.flats();
		cc.land();
		cc.money();
		cc.complex();
	}
	public void car()
	{
		System.out.println("Bentley");
	}
	
	public void flats()
	{
		System.out.println("CasaGrand");
	}
	

}
