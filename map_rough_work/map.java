import java.util.*;  
class HashMap3
{
	public static void main(String args[])
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
                hm.put(100,"Amit");    
                hm.put(101,"Vijay");    
                hm.put(102,"Rahul");
                hm.replaceAll((x,y) -> "Ajay");  
                for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}  
	}  
}  

