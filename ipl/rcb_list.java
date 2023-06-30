package com.rcb_players;
import com.rcb.*;
import java.util.*;
public class rcb_list
{
	public static void main(String[] args)
	{
		LinkedList<rcb> list = new LinkedList<rcb>();

		System.out.println(list);

		rcb ref = new rcb("vijay_mallya","virat","bangar");

		list.add(ref);
		System.out.println(list);
		for( rcb x: list)
		{
			System.out.println(x);
			System.out.println(x.owner+" "+ x.captain+" "+x.coach);
		}
	}
}
