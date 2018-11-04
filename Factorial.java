import java.io.*;

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
