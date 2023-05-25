import java.util.*;

class map

{
	public static void main(String[] args)
	{
		Set<Integer> values = new HashSet<>();
		System.out.println(values.add(22));
		System.out.println(values.add(22));
		System.out.println(values.add(22));
		System.out.println(values.add(22));
		System.out.println(values.add(22));
		System.out.println(values.add(22));

		System.out.println(values);


		for(int i:values)
		{
			System.out.println(i);
		}
	}


}
