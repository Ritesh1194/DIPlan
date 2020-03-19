package in.yadav.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		  Map<String, Integer> table = new Hashtable<>(); 
	        table.put("Pen", 10); 
	        table.put("Book", 500); 
	        table.put("Clothes", 400); 
	        table.put("Mobile", 5000); 
	  
	        // print map details 
	        System.out.println("hashTable: "
	                           + table.toString()); 
	  
	        // provide value for new key which is absent 
	        // using computeIfAbsent method 
	        table.computeIfAbsent("newPen", k -> 600); 
	        table.computeIfAbsent("newBook", k -> 800); 
	  
	        // print new mapping 
	        System.out.println("new hashTable: "
	                           + table); 
	}

}
