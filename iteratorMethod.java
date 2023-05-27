import java.io.*;
import java.util.*;
class iteratorMethod
{
	public static void main(String[] args)
	{
	Set<Integer> data = new LinkedHashSet<Integer>();
	data.add(20);
	data.add(20);
	data.add(30);
	data.add(25);
	data.add(35);
	data.add(10);
	System.out.println("data: " + data);
	
	Iterator newData = data.iterator();

	while(newData.hasNext())
	{
		System.out.println(newData.next());
	}
	}
}
