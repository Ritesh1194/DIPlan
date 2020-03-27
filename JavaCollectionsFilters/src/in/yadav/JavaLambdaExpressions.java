package in.yadav;

/* 
 * Write the following methods that return a lambda expression performing a specified action:
1. PerformOperation isOdd(): The lambda expression must return  if a number is odd or  if it is even.
2. PerformOperation isPrime(): The lambda expression must return  if a number is prime or  if it is composite.
3. PerformOperation isPalindrome(): The lambda Expression must return  if a number is a palindrome or  if it is not.
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  26-03-2020
 * */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface performOperation {
	int check(int number);
}

class Math {
	public static int checker(performOperation perform, int num) {
		return perform.check(num);
	}

	performOperation checkEvenOdd() {
		performOperation perform = (number) -> {
			return number % 2;
		};

		return perform;
	}

	performOperation checkPrime() {
		performOperation perform = (number) -> {
			if (number == 1)
				return 1;
			for (int i = 2; i < number / 2 + 1; i++) {
				if ((number % i) == 0)
					return 1;
			}
			return 0;
		};
		return perform;
	}

	performOperation checkPalindrome() {
		performOperation perform = (number) -> {
			String word = "" + number;
			boolean isPalindrome = true;
			for (int i = 0; i < (int) word.length() / 2; i++) {
				if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
					isPalindrome = false;
					break;

				}
			}
			return isPalindrome ? 0 : 1;
		};
		return perform;
	}
}

public class JavaLambdaExpressions {

	public static void main(String[] args) throws IOException {
		Math object = new Math();
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		
		int value = Integer.parseInt(bufferedreader.readLine());
		performOperation operationPerform;
		int result = 0;
		String ans = null;
		while (value-- > 0) {
			String string = bufferedreader.readLine().trim();
			StringTokenizer st = new StringTokenizer(string);
			int choice = Integer.parseInt(st.nextToken());
			int number = Integer.parseInt(st.nextToken());
			if (choice == 1) {
				operationPerform = object.checkEvenOdd();
				result = object.checker(operationPerform, number);
				ans = (result == 0) ? "EVEN" : "ODD";
			} else if (choice == 2) {
				operationPerform = object.checkPrime();
				result = object.checker(operationPerform, number);
				ans = (result == 0) ? "PRIME" : "COMPOSITE";
			} else if (choice == 3) {
				operationPerform = object.checkPalindrome();
				result = object.checker(operationPerform, number);
				ans = (result == 0) ? "PALINDROME" : "NOT PALINDROME";
			}
			System.out.println(ans);
		}
	}
}