package listConcept;
//class on 25th feb

import java.util.LinkedList;
import java.util.List;

public class LinkedListConcept {
	public static void main(String[] args) {
		lnkdlst();
	}
	
	public static void lnkdlst()
	{
		List<Object> LLVar=new LinkedList<Object>();
		LLVar.add("Dave");
		LLVar.add("24");
		LLVar.add("Blue");
		LLVar.add("Shirt");
		LLVar.add("Chennai");
		
		System.out.println("1st Linked List: "+LLVar);
		System.out.println("Size of linked list is: "+LLVar.size());
		
		for(Object all:LLVar)
		{
			System.out.println(all);
		}
		
		LLVar.set(2, "Black");
		System.out.println("after using set method: "+LLVar);
		
		LLVar.remove(0);
		System.out.println("After removing the 1st value: "+LLVar);
		
		List<Integer> LLVar2=new LinkedList<Integer>();
		LLVar2.add(120);
		LLVar2.add(220);
		LLVar2.add(320);
		
		System.out.println("2nd LinkedList: "+LLVar2);
		LLVar.addAll(LLVar2);
		System.out.println("adding 2nd LL to 1st LL: "+LLVar);
		
		LLVar.removeAll(LLVar2);
		System.out.println("removing 2nd LL from 1st LL: "+LLVar);
		  
	}

}
