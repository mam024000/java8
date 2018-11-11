import java.io.*;

public class Permutation{

	public Permutation(String s){
		perm(s);
	}

	public void perm(String str){

		perm(str,"");

	}

	public void perm(String str, String pre){

		System.out.println("str = " + str + " pre = " + pre);
		if(str.length() == 0){

			System.out.println("Pre: " + pre);
		}
		else {
			for (int i = 0; i < str.length(); i++){

				String rem = str.substring(0,i) + str.substring(i+1);
				System.out.println("str.substring(0," + i + ") = " + str.substring(0,i));
				System.out.println("str.substring(" + (i+1) + ") = " + str.substring(i+1));
				System.out.println("rem = " + rem);
				System.out.println("----------");
				
				perm(rem, pre + str.charAt(i));
				//System.out.println("rem: " + rem);
				System.out.println("pre + str.charAt(i) = " + pre + str.charAt(i));
			}
		}
	}

	public static void main(String args[]){

		Permutation app = new Permutation("dog");

	}

}
