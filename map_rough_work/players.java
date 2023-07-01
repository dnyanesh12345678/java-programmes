package com.player;
import com.indian_team.*;
import java.util.*;
class player
{
	public static void main(String[] args)
	{
		indian_team a= new indian_team("rohit","gill","virat","surya_yadav","hardik_pandya","ishan_kishan",
				"jadeja","kuldeep_yadav","shardul_thakur","shami","siraj");
		Map<String,indian_team> ref = new HashMap<String,indian_team>();
		ref.put("Indian_PLAYING XI",a);
		System.out.println(ref.entrySet());
		System.out.println(ref);

		for( Map.Entry<String,indian_team> ref1: ref.entrySet())
		{
			String x = ref1.getKey();

			indian_team y =ref1.getValue();

			System.out.println(x + "=");
			System.out.println(y.player1);
			System.out.println(y.player2);
			System.out.println(y.player3);
			System.out.println(y.player4);
			System.out.println(y.player5);
			System.out.println(y.player6);
			System.out.println(y.player7);
			System.out.println(y.player8);
			System.out.println(y.player9);
			System.out.println(y.player10);
			System.out.println(y.player11);
		}
	}
}
