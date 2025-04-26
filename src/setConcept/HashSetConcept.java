package setConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {
	public static void main(String[] args) {
		hashSet();
	}
	
	public static void hashSet()
	{
		Set<Integer> st=new HashSet<Integer>();
		st.add(6);
		st.add(8);
		st.add(6);
		st.add(8);
		st.add(2);
		st.add(null);
		st.add(null);
		st.add(5);
		
		System.out.println("Size of 1st hashset: "+st.size());
		System.out.println("1st hashset: "+st);
		
		boolean contains=st.contains(5);
		System.out.println("the set constains 5: "+contains);
		
		st.remove(8);
		System.out.println("after removing value 8: "+st);
		
		Set<Integer> st2= new HashSet<Integer>();
		st2.add(100);
		st2.add(19);
		st2.add(8);
		st2.add(12);
		st2.add(2);
		
		st.addAll(st2);
		System.out.println("2nd set added to 1st set: "+st);
		
		System.out.println("1st set is empty: "+st.isEmpty());
		
		Iterator<Integer> iterator=st.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());		
	}

}
