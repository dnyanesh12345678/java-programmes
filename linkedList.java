import java.util.*;
class linkedList
{
	public static void main(String[] args)
	{
		LinkedList<Integer> linky = new LinkedList<Integer>();
		linky.add(6);
		linky.add(10);
		linky.add(12);
		linky.add(12);
		linky.add(12);
		Iterator it = linky.iterator();
		int c = 0;
		while(it.hasNext())
		{ 
			
			if((int) it.next() == 12)
			{
				c++;
				System.out.println("we found 12");
			}
		}
		System.out.println("we found 12"+":"+" "+ c +" "+"number of times");
	}
}
