import java.util.*;
class number
{
	public static void main(String[] args)
	{
		List<Integer> values=new ArrayList<Integer>();
		values.add(200);
		values.add(300);
		values.add(400);
		values.add(500);
		values.add(200);

		Collections.sort(values);
		

		for(Integer o : values)
		{
			System.out.println(o);
		}
	}
}
