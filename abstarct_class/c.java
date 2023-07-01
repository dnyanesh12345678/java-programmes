interface india
{
	void maharashtra();
	void gujrat();

}
abstract class a implements india
{
        public 	void maharashtra()
	{
		System.out.println("capital is mumbai");
	}
}
class b extends a
{
	public void gujrat()
	{
		System.out.println("capital is ahmadabad");
	}
}

public class c
{
	public static void main(String[] args)
	{
		india r = new b();
		r.maharashtra();
		r.gujrat();
	}
}

