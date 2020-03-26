package in.yadav.programs;
/* 
 * 10.Write a Java Program to count the number of words in a string using HashMap." 
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  25-03-2020
 * */
import java.util.HashMap;
import java.util.Map;

public class CountNumberOfWordsUsingHashMap {

	static void characterCount(String inputString) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		char[] strArray = inputString.toCharArray();

		// checking each char of strArray
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		// Printing the charCountMap
		for (Map.Entry entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		String str = "Ritesh Yadav";
		characterCount(str);
	}
}