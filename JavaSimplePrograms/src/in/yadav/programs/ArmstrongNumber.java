package in.yadav.programs;

/* 
 * 4.Write a Java Program to check Armstrong number. (Armstrong number is the number).
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  25-03-2020
 * */
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, temp, cube = 0, reminder;

		System.out.println("Enter Any Number");
		number = scanner.nextInt();
		temp = number;
		while (number > 0) {
			reminder = number % 10;
			cube = cube + (reminder * reminder * reminder);
			number = number / 10;
		}

		if (temp == cube) {
			System.out.println("Number Is Armstrong Number");
		} else {
			System.out.println("Number Is Not Armstrong Number");
		}
	}
}