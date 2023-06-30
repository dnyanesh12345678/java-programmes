import java.util.*;
public class entryset
{
	public static void main(String[] args)
	{
		Map map = new HashMap();
		map.put(1,"Amit");
		map.put(5,"Rahul");
		map.put(2,"jai");
		map.put(6,"amit");

		Set set=map.entrySet();
	//	System.out.println(set);
//will give outpuutlike this		[1=Amit, 2=jai, 5=Rahul, 6=amit]
                 Iterator itr=set.iterator();
		 Map.Entry entry=(Map.Entry)itr.next(); 
		 //will give output like 1=Amit
		 System.out.println(entry.getKey()+" "+entry.getValue());
		 //will give output like 1 Amit
		 while(itr.hasNext())
		 {
			 Map.Entry entry1=(Map.Entry)itr.next();
			 System.out.println(entry1.getKey()+" "+ entry1.getValue());
		 }

	}
}
