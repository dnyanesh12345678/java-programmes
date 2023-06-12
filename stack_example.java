import java.util.Stack;
class football_players
{
	public static void main(String[] args) 
	{
		Stack<String> football_players = new Stack<String>();
		football_players.add("neymar");
		football_players.add("CR7");
		football_players.add("messi");
		football_players.add("haland");
		football_players.add("de bruyne");
		football_players.add("kyilane mbappe");

		System.out.println(football_players);
		System.out.println(football_players.pop()); //will delete latest element from stack i.e one type of array
		System.out.println(football_players);
		System.out.println(football_players.peek()); //will show top element in our stack
		System.out.println(football_players);
		System.out.println("in this stack is kyilane mbappe include "+football_players.contains("kyilane mbappe"));
		System.out.println("in this is stack meesi include "+football_players.contains("messi"));
		System.out.println( football_players.empty());
		System.out.println( football_players.get(4));
	//	System.out.println(  "at 5th index player is "+football_players.get(5));
		System.out.println(football_players.size());
		if ( football_players.contains("messi"))
		{
				System.out.println("messi is found at index "+football_players.indexOf("messi"));
				System.out.println("so,messi now will replace");
				int b = football_players.indexOf("messi");
				football_players.set(b,"vini jr");
		}
		else
		{
				System.out.println("messi not found so will not be replaced");
		}

		System.out.println(football_players);
		System.out.println(football_players.size());
	}
}

