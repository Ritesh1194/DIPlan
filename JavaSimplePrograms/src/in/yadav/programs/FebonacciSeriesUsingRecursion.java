package in.yadav.programs;

/* 
 *  7. Java Program to print Fibonacci Series using Recursion
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  25-03-2020
 * */
import java.util.Scanner;

public class FebonacciSeriesUsingRecursion {

	static int number1 = 0, number2 = 1, number3 = 0;

	static void printFibonacci(int count) {
		if (count > 0) {
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
			System.out.print(" " + number3);
			printFibonacci(count - 1);
		}
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int count;
		
		System.out.println("Ënter Any Number ");
		count = scanner.nextInt();
		
		System.out.print(number1 + " " + number2);
		printFibonacci(count - 2);
	}
}