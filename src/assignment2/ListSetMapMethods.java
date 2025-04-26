package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListSetMapMethods {

	public static void main(String[] args) {
		
		listMethods();
		treeSet();
	}
	
	public static void listMethods()
	{
		System.out.println("Array List Methods:");
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(10);		//using the add method to add values to the list
		lst.add(20);
		lst.add(10);
		lst.add(40);
		lst.add(null);
		lst.add(60);
		System.out.println(lst);		//printing the entire list
		System.out.println("The size of the array list is: "+lst.size());	//for list instead of length, size method is used to get the size.
		
		lst.set(2,1000);		//2nd method
		System.out.println(lst);
		
		System.out.println("getting the 4th index value"+lst.get(4)); //3rd method
		
		lst.remove(2);	//4th method
		System.out.println("array list after using remove method: "+lst);
		
		boolean contains = lst.contains(60); //5th method
		System.out.println("the list contains value 60: "+contains);
		
		System.out.println("Sublist from index 3 to 5: "+lst.subList(3, 5));	//6th method
		
	}
	
	public static void treeSet() {
		System.out.println("Tree Set Methods");
		Set<Integer> ts = new TreeSet<>(); // TreeSet maintains sorted order

        ts.add(6);		//1st method
        ts.add(8);
        ts.add(6); // Duplicate, won't be added
        ts.add(8); // Duplicate, won't be added
        ts.add(2);
        ts.add(5);

        System.out.println("Size of TreeSet: " + ts.size());
        System.out.println("TreeSet: " + ts); // Elements will be sorted
        
        int fstvalue=((TreeSet<Integer>) ts).first();
        System.out.println("First: "+  fstvalue);
        
        boolean filled=ts.isEmpty();
        System.out.println("the set is empty: "+filled);
        
      
	}
	
	
}
