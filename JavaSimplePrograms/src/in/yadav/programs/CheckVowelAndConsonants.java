package in.yadav.programs;

/* 
 * 1. Java Program to count vowels and consonants in String.
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  25-03-2020
 * */
import java.util.Scanner;

public class CheckVowelAndConsonants {
	Scanner scanner = new Scanner(System.in);

	// Creating The Method
	public void checkVowelAndConsonants() {
		char character;

		// Input
		System.out.println("Enter The String ");
		character = scanner.next().charAt(0);

		// Condition
		if (character == 'A' || character == 'a') {
			System.out.println("Alphabet Is Vowel");
		} else if (character == 'E' || character == 'e') {
			System.out.println("Alphabet Is Vowel");
		} else if (character == 'I' || character == 'i') {
			System.out.println("Alphabet Is Vowel");
		} else if (character == 'I' || character == 'i') {
			System.out.println("Alphabet Is Vowel");
		} else if (character == 'U' || character == 'u') {
			System.out.println("Alphabet Is Vowel");
		} else {
			System.out.println("Aphabet Is Consonants");
		}
	}

	public static void main(String[] args) {
		// Creating The Object
		CheckVowelAndConsonants check = new CheckVowelAndConsonants();
		// Calling The Method
		check.checkVowelAndConsonants();
	}
}