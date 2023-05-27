import java.util.*;
class setExample1
{
	public static void main(String[] args)
	{
		//creating LinkedHashSet using the Set
		Set<String> data=new LinkedHashSet<String>();
		data.add("dnyaneshwar");
		data.add("mayuri");
		data.add("mahesh");
		data.add("mahesh");

		System.out.println(data);
	}
}
