import java.util.*;
class map_example
{
	String player;
	int score;
	int ball;
	public map_example( String player, int score, int ball )
	{
		this.player=player;
		this.score=score;
		this.ball=ball;
	}
}
class map_output
{
	public static void main(String[] args)
	{
		Map<String,map_example> a = new HashMap<String,map_example>();
		map_example player1 = new map_example("virat",120,160);
		map_example player2 = new map_example("rohit",110,150);
		map_example player3 = new map_example("gill",120,160);
		map_example player4 = new map_example("pant",120,160);
		a.put("list1",player1);
		a.put("list2",player2);
		a.put("lit3",player3);
		a.put("list4",player4);

	       for(Map.Entry<String,map_example> ref : a.entrySet())
	       {
		       String details=ref.getKey();
		       map_example b =ref.getValue();
		       System.out.println("player details: "+ details);
		       System.out.println(b.player+" "+b.score+" "+b.ball);
	       }
	}
}

