enum COLOR
{
	RED,
	GREEN,
	BLUE;
	private COLOR()
	{
		System.out.println("constructor called for: "+this.toString());
		/*toString() method is overridden in java.lang.Enum class, which returns enum constant name.*/
	}
	public void colour_info()
	{
		System.out.println("universal colour");
	}
}
class enam_constructor
{
	public static void main(String[] args)
	{
		COLOR c;
		c=COLOR.RED;//now constructor will also called
		System.out.println(c);
		c.colour_info();

	}
}

