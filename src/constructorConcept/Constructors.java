package constructorConcept;

public class Constructors {
	
	public static void main(String[] args) {
		
		Constructors co=new Constructors(); 
		Constructors mo=new Constructors(23); 
		Constructors no=new Constructors("john"); 
		Constructors so=new Constructors("abhd","avadi"); 

		
	}
	
	public Constructors()
	{
		//this("MIT","Adyar");
		System.out.println("Default non parameter Constructor");
	}
	
	public Constructors(int roll_no)
	{
		//this("Danny");
		System.out.println("Student roll no is: "+roll_no);
	}
	
	public Constructors(String name)
	{
		System.out.println("Student name: "+name);
	}
	
	public Constructors(String clg, String loc)
	{
		//this(12);
		System.out.println("College name and location: "+clg+" "+loc);
	}
	

}
