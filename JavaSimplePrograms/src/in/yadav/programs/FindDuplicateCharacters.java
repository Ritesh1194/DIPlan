package in.yadav.programs;

/*
 * 3.Write a Java Program to find the duplicate characters in a string.
* 
* @author  :  Ritesh Yadav
*  @version :  1.0
*  @since   :  25-03-2020
* */
public class FindDuplicateCharacters {

	public static void main(String[] args) {
		String str = "Ritesh Yadav Ri";

		int count = 0;
		char[] inp = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (inp[i] == inp[j]) {
					System.out.println("Duplicate Characters Are : =" + inp[j]);
					count++;
					break;
				}
			}
		}
	}
}