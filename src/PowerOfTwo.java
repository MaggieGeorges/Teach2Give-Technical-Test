/*Write a program that takes an integer as input and returns true if the input is a power of two.
Examples: 
8=> returns true
6=> returns false*/

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter an integer: ");
		int num = scanner.nextInt();
		scanner.close();
		
		//We now check if input the number is a power of 2
		System.out.println(num + "=>" + isPowerOfTwo(num));
		}

//function to check if the number is a power of 2
public static boolean isPowerOfTwo(int num) {
	if (num <= 0) {
		return false; //if number is less than or equal to 0 it can't be a power of 2
	}
	//we then use the bitwise and AND operator to check if the number is a power of 2
	//if result is 0 it's a power of 2 else it's not a power of 2.
	return (num & (num-1)) == 0;
}
}

