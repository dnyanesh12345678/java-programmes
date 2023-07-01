interface family
{
	void mayuri();
	void megha();
	void kunal();
	void mahesh();
	void  vimalbai();
	public static final String FAMILY="SHINDE FAMILY MEMBER";
}
abstract class  mayuri implements family
{
	public void mayuri()
	{
		System.out.println("mayuri mahesh shinde");
	}
}
abstract class megha extends mayuri
{
	public void megha()
	{
		System.out.println("megha mahesh shinde");
	}
}
abstract class kunal extends megha
{
	public void kunal()
	{
		System.out.println("kunal mahesh shinde");
	}
}
abstract class mahesh extends kunal
{
	public void mahesh()
	{
		System.out.println("mahesh vinayak shinde");
	}
}
class vimalbai extends mahesh
{
	public void vimalbai()
	{
		System.out.println("vimalbai vinayak shinde");
	}
	public static void main(String[] args)
	{
		vimalbai v = new vimalbai();
		System.out.println(family.FAMILY + " = ");
		v.vimalbai();
		v.mahesh();
		v.mayuri();
		v.kunal();
		v.megha();
	}
}

