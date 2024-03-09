/*Question 5: Reverse Integer
Write a program that takes an integer as input and returns an integer with reversed digit 
ordering.
Examples:
For input 500, the program should return 5.
For input -56, the program should return -65.
For input -90, the program should return -9.
For input 91, the program should return 19.*/


import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		//reads input from user and stores it in a variable num
		int num = scanner.nextInt();
		scanner.close();
		
		//to reverse the digits of the input number
		System.out.println(reverseDigits(num));
	}
	public static int reverseDigits(int num) {
		int rev_num = 0;
		//using a while loop to iterate
		while (num != 0 ) {
			rev_num = rev_num * 10 + num % 10;
			num = num/10 ;
		}
		return rev_num;
	}

}
