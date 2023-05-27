// Java program to Demonstrate asList() method
// of Arrays class for a string value

// Importing utility classes
import java.util.*;

// Main class
class asList_method_string {

	// Main driver method
	public static void main(String[] argv) 
	{

		// Try block to check for exceptions
		try {

			// Creating Arrays of String type
			String a[]
				= new String[] { "A", "B", "C", "D" };

			// Getting the list view of Array
			List<String> list = Arrays.asList(a);
		

			// Printing all the elements in list object
			System.out.println("The list is: " + list);
		}

		// Catch block to handle exceptions
		catch (Exception e) {

			// Print statement
			System.out.println("Exception thrown : " + e);
		}
	}
}

