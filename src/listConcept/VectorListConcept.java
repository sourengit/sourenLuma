package listConcept;
//class on 25th feb
import java.util.Vector;

public class VectorListConcept {
	public static void main(String[] args) {
		VctrList();
	} 
	
	public static void VctrList()
	{
		Vector<String> VLVar=new Vector<String>();
		VLVar.add("Apple");
		VLVar.add("Null");
		VLVar.add("Orange");
		VLVar.add("Guava");
		VLVar.add("Mango");
		VLVar.add("Grape");
		VLVar.add("Melon");
		System.out.println("1st Vector list: "+VLVar);
		
		System.out.println("Size of 1st vector list: "+VLVar.size());
		System.out.println("Using foreach loop");
		
		for(String SVal:VLVar)
			System.out.println(SVal);
		
		
		
		
		
		
	}

}
