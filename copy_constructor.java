class copy_constructor
{
	String a;
	int b;

	copy_constructor( String a,int b)
	{
		this.a=a;
		this.b=b;
	}
	copy_constructor(copy_constructor r)
	{
		a=r.a;
		b=r.b;
	}
	public static void main(String[] args)
	{
		copy_constructor ref = new copy_constructor("virat",20);
		copy_constructor ref1= new copy_constructor(ref);
		System.out.println(ref1.a+" "+"="+ref1.b);
	}
}
