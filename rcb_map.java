// Java Program to Demonstrate
// Working of Map interface

// Importing required classes
import java.util.*;

// Main class
class RCB {

	// Main driver method
	public static void main(String args[])
	{
		// Creating an empty HashMap
		Map<String, Integer> scores
			= new HashMap<String, Integer>();

		// Inserting pairs in above Map
		// using put() method
		scores.put("virat",  55);
		scores.put("faf", 35);
		scores.put("maxwell", 60);
		scores.put("bracewell", 25);
		scores.put("anuj",  0);
                scores.put("dk", 10);
                scores.put("harshal",5);
                scores.put("siraj", 10);
		scores.put("virat", 0);
		scores.remove("siraj");

		System.out.println(scores);
		System.out.println(scores.values());
		System.out.println(scores);


		System.out.println("keys are of RCB class is" + " "+scores.keySet());

		for ( String key: scores.keySet())
		{
			System.out.println(key+" : "+ scores.get(key));
		}

	}
}

//chages
