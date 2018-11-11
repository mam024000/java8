import java.io.*;

/*
 * A simple program to show the initialization process in a Java8 program.
 * A new Hello object is instantiated.  The constructor is called first.
 * The constructor prints a message.  It then makes a call to the method
 * printMessage() which prints another message.  The control is returned
 * to main() which prints the last message.
 * @author Mark
 */

public class Hello{

	public Hello(){
		System.out.println("Hello world from the constructor!");
		printMessage();
	}

	public void printMessage(){
		System.out.println("Hello world from call to printMessage()!");
	}

	public static void main(String[] args){
		Hello app = new Hello();
		System.out.println("Hello world from main!");
	}

}
