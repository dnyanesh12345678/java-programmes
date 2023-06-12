/*The java.util.HashMap.entrySet() method in Java is used to create a set out of the same elements contained in the hash map. It basically returns a set view of the hash map or we can create a new set and store the map elements into them.

Syntax:

hash_map.entrySet()
Parameters: The method does not take any parameter.

Return Value: The method returns a set having same elements as the hash map.



// Java code to illustrate the entrySet() method*/
import java.util.*;

class entryset_method {
	public static void main(String[] args)
	{

		// Creating an empty HashMap
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		// Mapping string values to int keys
		hash_map.put(10, "Geeks");
		hash_map.put(15, "4");
		hash_map.put(20, "Geeks");
		hash_map.put(25, "Welcomes");
		hash_map.put(30, "You");

		// Displaying the HashMap
		System.out.println("Initial Mappings are: " + hash_map);

		// Using entrySet() to get the set view
		System.out.println("The set is: " + hash_map.entrySet());
	}
}

