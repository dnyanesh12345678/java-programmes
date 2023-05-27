import java.io.*;
import java.util.*;
class sizeMethod
{
	public static void main(String[] args)
	{
		Set<Integer> data = new LinkedHashSet<Integer>();
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(40);
		data.add(50);
		data.add(10);
		data.add(20);
		System.out.println("data:" + " "+data);

		System.out.println("data:" + " "+ data.size());
	}
}
