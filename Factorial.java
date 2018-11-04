import java.io.*;

/*
 * A simple class that is used to calculate the facotiral
 * of a number.  To calculate the factorial of a given 
 * number n one must multiply n * n-1 * n-2....n*0.  In
 * example, factorial(5) = 5 * 4 * 3 * 2 * 1 which is
 * equal to 120.
 * @author Mark McRee
 */

public class Factorial{

	public Factorial(int n){
		System.out.println("n = " + n + ", Answer: " + factorial(n));

	}

	public int factorial(int n){

		if(n < 0){
			
			return -1;
		}
		else if (n == 0){
			
			return 1;
		}
		else{
			
			return n * factorial(n-1);
		}
	}

	public static void main(String args[]){

		Factorial app = new Factorial(6);
		

	}


}
