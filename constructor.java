class mayuri
{
	mayuri()
	{
		System.out.println("mayuri mahesh shinde");
	}
	mayuri(String address)
	{
		System.out.println("mayuri mahesh shinde" + " " + address);
	}
}
class megha extends mayuri
{
	megha()
	{
		super("amalner");
		System.out.println("megha mahesh shinde");
		
	}
}
class mahesh extends megha
{
	mahesh()
	{
		System.out.println("mahesh vinayak shinde");
	}
}
class dnyaneshwar extends mahesh
{
	dnyaneshwar()
	{
		System.out.println("dnyaneshwar mahesh shinde");
	}
}
class fullnames
{
	public static void main(String[] args)
	{
		dnyaneshwar a = new dnyaneshwar();
	}
}
