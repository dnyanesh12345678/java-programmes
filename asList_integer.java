import java.util.*;
class asList_integer
{
	public static void main(String[] args)
	{
		try
		{
			Integer a[]=new Integer[] {10,10,20,20,30,40,5};
			List<Integer> list = Arrays.asList(a);
			System.out.println(list);
		}
		catch (Exception e)
		{
			System.out.println("exception thrown" + e);
		}
	}
}


