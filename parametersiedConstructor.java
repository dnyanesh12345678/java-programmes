import java.io.*;
class values {
	String name;
	int id;
	values(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
}
class answer {
	public static void main(String[] args)
	{
		// This would invoke the parameterized constructor.
		values geek1 = new values("dnyaneshwar mahesh shinde", 68);
		System.out.println("GeekName :" + geek1.name + " and GeekId :" + geek1.id);
	}
}

