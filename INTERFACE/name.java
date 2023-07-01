/*Java 8 Default Method in Interface
Since Java 8, we can have method body in interface. But we need to make it default method.

Since Java 8, we can have static method in interface.

 Interface fields are public, static and final by default, and the methods are public and abstract.


 */


interface dnyaneshwar
{
	default void name()
	{
		System.out.println("my name is dnyaneshwar shinde");
	}
	static void school()
	{
		System.out.println("sane guruji");
	}
	public static final String address="vidya vihar coloney mundada nagar";
	void hobby();
}
class dnyaneshwar_caller implements dnyaneshwar
{
	public void hobby()
	{
		System.out.println("learning");
	}
	public static void main(String[] args)
	{
		dnyaneshwar_caller r = new dnyaneshwar_caller();
		r.name();
		dnyaneshwar.school();
		r.hobby();
		System.out.println(r.address);
	}
}
