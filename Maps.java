import java.util.HashMap;
public class Maps
{
	public static void main(String[] args)
	{
		HashMap<String,Integer> empIds = new HashMap<>();
		empIds.put("dnyaneshwar", 45);
		empIds.put("kunal", 12345);
		empIds.put("dnyaneshwar",12);
		empIds.replace("dnyaneshwar",22);
		System.out.println(empIds);
		System.out.println(empIds.get("dnyaneshwar"));
		System.out.println(empIds.containsKey("raj"));
		System.out.println(empIds.containsValue(12));
		System.out.println(empIds.containsValue(45));
		
	}
}
