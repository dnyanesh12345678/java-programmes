abstract class rohan
{
	rohan()
	{
		System.out.println("rohan hobby is bgmi");
	}
	abstract void kd();
	void gun()
	{
		System.out.println("rohan faviourate gun is uzi");
	}
}
class ajay extends rohan
{
	ajay()
	{
		System.out.println("ajay hobby is watching movie");
	}
	void kd()
	{
		System.out.println("rohan k.d is 1");
	}
	void movie()
	{
		System.out.println("ajay favourite movie is harry potter");
	}
}
class umesh extends ajay
{
	umesh()
	{
		System.out.println("umesh hobby is gulugulu");
	}

	public static void main(String[] args)
	{
		umesh ref = new umesh();
		ref.movie();
		ref.kd();
		ref.gun();
	}
}



