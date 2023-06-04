class variable
{
	String name="dnyaneshwar";
	String yourname(String name){
		this.name="kunal";
		
		System.out.println(this.name);

		return name;
		
	}
}
class variable1 extends variable
{
	public static void main(String[] args)
	{
		variable1 a=new variable1();
	System.out.println(a.name);
	String answer=a.yourname("dnyaneshwar mahesh shinde");
	System.out.println(answer);
	}
}


