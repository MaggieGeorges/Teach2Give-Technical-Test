/*Question 2: Fibonacci Sequence
Write a program to generate the Fibonacci sequence up to 100.*/


public class FibonacciSequence {
	public static void main(String[] args) {
		//Setting a to 0 as the first fibonacci number
		//Setting b and c to 0 and 1 respectively which are used to calculate the next fibonacci numbers
		int a = 0, b = 0, c = 1;
		System.out.print( "Fibonacci Sequence:");
		//implementing a for loop iterating from 1 to 100 generating the sequence up to the 100th number
		for (int i =1; i<=100; i++) {
			a = b;
			b = c;
			c = a + b ;
			//Printing the current Fibonacci number followed by a comma
			System.out.print(a + ", ");
		}
	}

}
