import java.io.*;
import java.util.*;
class removeAllMethod 
{
	public static void main(String[] args)
	{
		Set<Integer>data=new LinkedHashSet<Integer>();
		data.add(10);
		data.add(10);
		data.add(10);
		data.add(20);
		data.add(20);
		System.out.println("data: "+data);


		ArrayList<Integer>newData=new ArrayList<Integer>();
		newData.add(10);
		newData.add(20);
		newData.add(20);

		System.out.println("newdata: " + newData);


		System.out.println(data.removeAll(newData));

		System.out.println("data after removing Newdata elements : " + data);
	}
}


