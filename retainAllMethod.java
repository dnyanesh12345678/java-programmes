import java.io.*;
import java.util.*;
class retainAllMethod
{
	public static void main(String[] args)
	{
		Set<Integer>data=new LinkedHashSet<Integer>();
		data.add(20);
		data.add(30);
		data.add(50);
		System.out.println("data:" + " "+data);
		ArrayList<Integer>newdata=new ArrayList<Integer>();
		newdata.add(20);
		newdata.add(100);
		newdata.add(200);

		System.out.println("newdata:"+ " "+ newdata);


		data.retainAll(newdata);
		System.out.println("data after retaining newdata elements" +" "+ data);
	}
}
