public enum games

{
	game1("mario"),
	game2("contra"),
	game3("CS:GO");

	private final String constant;

	private games(String constant)
	{
		this.constant=constant;
		System.out.println(constant);
		
	}
	public static void main(String[] args)
	{
		for(games r:  games.values())
		{
			System.out.println(r);
		}
	}
}
