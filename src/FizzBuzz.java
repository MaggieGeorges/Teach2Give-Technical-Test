/*Question 1: FizzBuzz
Write a program that prints the numbers from 1 to 100. For multiples of 3, print "Fizz"; for 
multiples of 5, print "Buzz"; and for numbers that are multiples of both 3 and 5, print 
"FizzBuzz".*/


import java.util.ArrayList;
import java.util.List;


public class FizzBuzz {
	public static List<String> fizzBuzz(int n){
		//Declare a list of string to store the results
		List<String> result = new ArrayList<>();
		//loop from 1 to n (inclusive)
		for (int i=1; i<=n; ++i) {
			//check if i is divisible by both 3 and 5
			if (i % 3 == 0 && i % 5 == 0) {
				// Add FizzBuzz to the result list
				result.add("FizzBuzz");
			}
			//Check if i is divisible by 3
			else if (i % 3 == 0) {
				//Add fizz to the result list
				result.add("Fizz");
			}
			//Check if i is divisible by 5
			else if (i % 5 == 0) {
				//add Buzz to the result list
				result.add("Buzz");
			}
			else {
				//Add the current number as a string to the result list
				result.add(Integer.toString(i));
			}
		}
		//return result list
		return result;
	}

	public static void main(String[] args) {
		int n = 100;
		//calling the fizBuzz function to get the result
		List<String> result = fizzBuzz(n);
		
		//printing the results
		for (String s:result) {
			System.out.print(s + ",");
		}

	}

}
