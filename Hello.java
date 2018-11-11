import java.io.*;

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
		System.out.println("Hello world!");
	}

}
