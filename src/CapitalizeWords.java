/*Question 4: Capitalize Words
Write a program that accepts a string as input, capitalizes the first letter of each word in the 
string, and then returns the result string.
Examples: 
"hi"=> returns "Hi"
"i love programming"=> returns "I Love Programming"*/

import java.util.Scanner;

public class CapitalizeWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		scanner.close();
		
		String result = capitalizeFirstLetter(input);
		System.out.println(result);
	}
	
	public static String capitalizeFirstLetter(String str) {
		StringBuilder sb = new StringBuilder();
		//splitting the input string into words using space as delimiter and stores them in word array
		String[] words = str.split(" ");
		//use a for loop to iterate through each word in the word array
		for (String word : words) {
			//capitalize the first letter for each word
			String capitalizeWord = word.substring(0, 1).toUpperCase() + word.substring(1);
			//appending the capitalized word to the result string
			sb.append(capitalizeWord).append(" ");
		}
		//removing the extra space at the end and return the result string
		return sb.toString().trim();
		
	}

}
