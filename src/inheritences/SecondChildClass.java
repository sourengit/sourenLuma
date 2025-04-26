package inheritences;

public class SecondChildClass extends ParentClass {
	public static void main(String[] args)
	{
		SecondChildClass c2c=new SecondChildClass();
		c2c.land();
		c2c.car();
		c2c.money();
		c2c.complex();
	}
	
	public void car()
	{
		System.out.println("Jaguar");
	}

}
