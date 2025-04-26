package listConcept;
//class on 25th feb

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {
	public static void main(String[] args) {
		listMethods();
	}
	public static void listMethods()
	{
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(10);		//using the add method to add values to the list
		lst.add(20);
		lst.add(10);
		lst.add(40);
		lst.add(null);
		lst.add(60);
		System.out.println(lst);		//printing the entire list
		System.out.println("The size of the array list is: "+lst.size());	//for list instead of length, size method is used to get the size.
		
		for(int i=0; i<lst.size();i++)		//using for loop to display the values
			System.out.println(lst.get(i));
		
		lst.set(2,100);		//using set method to replace an existing value, it can't be used to add a new value!
		System.out.println(lst);
		
		lst.remove(2);	//using remove method to remove a value using index.
		System.out.println("array list after using remove method: "+lst);
		
		//lst.clear();  //used to clear the array list of all values, the output for this is an 'empty array list'
		//System.out.println("After using clear method: "+lst);
		
		
		List<Integer> lst2=new ArrayList<Integer>();		//creating another array list
		lst2.add(1);
		lst2.add(2);
		lst2.add(3);
		
		lst.addAll(lst2);		//using addAll method to add lst2 value to lst
		System.out.println("adding 2nd array list to 1st array list : "+lst);
		
		lst.removeAll(lst2);
		System.out.println("removing the values of lst2 from lst :"+lst);
		
		
	}

}
