//package com.MI_details;
//import com.MI.*;
import java.util.*;
public class MI_details
{
	public static void main(String[] args)
	{
		LinkedList<MI> details = new LinkedList<MI>();

		MI provide = new MI("nita_ambani","ST","RS");

		details.add(provide);
		System.out.println(details);

		for (MI a: details)
		{
			System.out.println(a.owner+" "+a.coach+" "+a.captain);
		}
	}
}
