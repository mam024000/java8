import java.io.*;

public class Prime{

	public Prime(int n){

		System.out.println("Answer: " + isPrime(n));

	}//end Constructor

	public boolean isPrime(int n){

		for(int x = 2; x * x <= n; x++){

			if(n % x == 0){
				System.out.print("x = " + x);
				System.out.print(" | x * x = " + x*x);
				System.out.print(" | n Mod x = " + n % x );
				System.out.println(" | n is: " + n);
				return false;
			}//end if
		}//end for
		return true;
	}

	public static void main(String[] args){

		int number = 37;

		Prime app = new Prime(number);
		
	}//end main

}//end class
