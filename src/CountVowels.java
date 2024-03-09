/*Question 6: Count Vowels
Write a program that counts the number of vowels in a sentence.
eg " Hello World " => returns 2*/


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class CountVowels {

	public static void main(String[] args) {
		// creating a set called vowels to store vowels encountered
		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		//initializing a variable count to 0 to keep track of number of vowels
		int count = 0;
		System.out.println("Enter a sentence: ");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		//creating a loop to iterate each character in sentence
		for  (int i=0; i < sentence.length(); i++) {
			//converting the character into lower case if in upper case
			char ch = Character.toLowerCase(sentence.charAt(i));
			//checking if the vowel is a character
			if (vowels.contains(ch)) {
				count++;
				//to ensure vowel is counted only once
				vowels.remove(ch);
			}
		}
		System.out.println(count);
	}

}
