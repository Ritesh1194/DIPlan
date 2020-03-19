package in.yadav.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
	// Adding The Elements
	Map<Integer, String> map = new HashMap<>();
	
	map.put(1, "Ritesh");
	map.put(2, "Raja");
	map.put(3, "Ravi");
	
	System.out.println("Map Elements Are : = "+map);
	
	//Size Of Map Elements
	System.out.println(map.size());
	
	//Itarate Elements Using For Loop
	
	 Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
	    while (iterator.hasNext()) {
	        Entry<Integer, String> entry = iterator.next();
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
	}
}