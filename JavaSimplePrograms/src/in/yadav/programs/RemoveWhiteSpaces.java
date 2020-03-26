package in.yadav.programs;
/* 
 *6. Write a Java Program to remove all white spaces from a string without using replace().
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  25-03-2020
 * */

public class RemoveWhiteSpaces {
	static int removeSpaces(char[] str) {
		int count = 0;
		for (int i = 0; i < str.length; i++)
			if (str[i] != ' ')
				str[count++] = str[i];
		return count;
	}

	public static void main(String[] args) {
		char str[] = "Ritesh Yadav From Bhopal".toCharArray();
		int result = removeSpaces(str);
		System.out.println(String.valueOf(str).subSequence(0, result));
	}
}