package mapConcept;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {
	public static void main(String[] args) {
		TreeMapMthd();
	}
	
	public static void TreeMapMthd()
	{
		Map<Integer,String> treemp=new TreeMap<Integer,String>();
		treemp.put(100,"Grape");
		treemp.put(200,"Banana");
		treemp.put(300,"Apple");
		treemp.put(400,"Orange");
		treemp.put(500,"Kiwi");
		treemp.put(600,"Melon");
		treemp.put(700,"Guava");
		treemp.put(800,"Papaya");
		treemp.put(900,"Pineapple");
		treemp.put(1000,"Mango");		
		treemp.put(650,"null");

		
		System.out.println(treemp);
		
		int size=treemp.size();
		System.out.println("size of the tree map is: "+size);
		
		System.out.println("using get method: "+treemp.get(600));
		
		Set<Integer> keySet=treemp.keySet();
		System.out.println(keySet);
		
		Collection<String> value=treemp.values();
		System.out.println("Values of the map are: "+value);
		
		boolean containsKey=treemp.containsKey(700);
		System.out.println("Does the map has key 700: "+containsKey);
		
		Set<Entry<Integer,String>> entrySet=treemp.entrySet();			//type casting?
		System.out.println(entrySet);
		
		Iterator<Entry<Integer,String>> ite=entrySet.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
		
		Map<Integer,String> treemp2=new TreeMap<Integer,String>();		//creating another tree map
		treemp2.put(500,"Audi");
		treemp2.put(1500,"BMW");
		treemp2.put(800,"Ferrari");
		treemp2.put(1800,"BYD");
		
		treemp.putAll(treemp2);
		System.out.println(treemp);
		 
	}
	

}
