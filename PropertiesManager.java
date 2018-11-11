import java.io.*;
import java.util.Properties;

public class PropertiesManager{

	public PropertiesManager(){

	}

	public static void main(String[] args){

		//get the system properties
		Properties props = System.getProperties();

		//create and set a new property of our own
		props.setProperty("new_property2","new_value2");

		if(args.length == 0){
			System.out.println("Usage: java PropertiesManager [-list_all]");
			System.out.println("	   java PropertiesManager [-list_prop <property name>]");
		}
		//if the only argument is -list_all
		else if(args[0].equals("-list_all")){

			//list all system properties
			props.list(System.out);
		}
		//if the first argument is -list_prop
		else if (args[0].equals("-list_prop")){

			//get and print the property we asked to see
			System.out.println(props.getProperty(args[1]));
		}
		//all other cases
		else{
			System.out.println("Usage: java PropertiesManager [-list_all]");
			System.out.println("	   java PropertiesManager [-list_prop <property name>]");
		}	
	}
}
