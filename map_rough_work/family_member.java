package com.family_member;
import com.family.*;
import java.util.*;
public class family_member
{
	public static void main(String[] args)
	{
		family a = new family("mayuri","kunal","megha","mahesh");
		family b = new family("rashu","vickey","mai","aaba");
		Map<String,family> ref1 = new HashMap<String,family>();
		ref1.put("shinde_family",a);
                ref1.put("sonawane_family",b);

		for( Map.Entry<String,family> ref2: ref1.entrySet())
		{
		String group = ref2.getKey();
		family ref3 = ref2.getValue();
		System.out.println(group + " members are = ");
		System.out.println(ref3.a+ " "+ ref3.b + " " + ref3.c );
		}
	}
}
