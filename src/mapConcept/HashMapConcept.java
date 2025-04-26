package mapConcept;

import java.util.Map;
import java.util.HashMap;

public class HashMapConcept {
	public static void main(String[] args) {
		HashMapMthd();
	}
	
	public static void HashMapMthd()
	{
		Map<Integer,String> hashmp=new HashMap<Integer,String>();
		hashmp.put(100,"Grape");
		hashmp.put(200,"Banana");
		hashmp.put(300,"Apple");
		hashmp.put(400,"Orange");
		hashmp.put(500,"Kiwi");
		hashmp.put(600,"Melon");
		hashmp.put(700,"Guava");
		hashmp.put(800,"Papaya");
		hashmp.put(900,"Pineapple");
		hashmp.put(1000,"Mango");
		hashmp.put(null,"Grape");
		hashmp.put(650,"null");
		hashmp.put(750,"Grape");
		
		System.out.println(hashmp);
		
	}
	

}
