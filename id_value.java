import java.util.*;
class id_value
{
	public static void main(String[] args)
	{
		Map<Integer,Integer> id = new HashMap<>();
		id.put(100,22);
		id.put(101,899);
		id.put(102,678);
		id.put(103,1987);
		id.put(104,877);
		id.put(105,870);
		id.put(100,00);

		System.out.println(id);
		System.out.println(id.get(101));
		System.out.println(id.containsKey(103));
		System.out.println(id.containsValue(870));
		id.putIfAbsent(106,871);
		System.out.println(id);
		System.out.println(id.size());
		System.out.println(id.getKey());
	}
}
