import java.util.*;
class iterator
{
	public static void main(String[] args)
	{
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(49);
		nums.add(104);
		nums.add(76);
		nums.add(-40);

		Iterator<Integer> it = nums.iterator();
		while(it.hasNext())
		{
			int i = it.next();
			if(i<50)
			{
				it.remove();
			}
		}
		System.out.println(nums);
	}
}
