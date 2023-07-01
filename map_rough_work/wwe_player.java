package com.wwe_player;
import java.util.*;
import com.wwe.*;
public class wwe_player
{
	public static void main(String[] args)
	{
		wwe ref = new wwe("Triple_H","JOHN_CINA","RANDY_ORTON");
		wwe ref1 = new wwe("UNDERTAKER","ROMAN_REIGNS","SETH_ROLLINS");
		Map<String,wwe> player = new HashMap<String,wwe>();
		player.put("team1",ref);
		player.put("team2",ref1);
		System.out.println(player.entrySet());
		System.out.println(player);
		for ( Map.Entry<String,wwe> entry : player.entrySet())
		{
			String a = entry.getKey();
			System.out.println(a + " = ");
			wwe b = entry.getValue();
			System.out.println(b.player1+" "+b.player2+" "+b.player3);
		}
	}
}


