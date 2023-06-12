class A
{
	int a;
	A b;
}
class B
{
	A head;
	void add(int data)
	{
		A ref = new A();
		System.out.println(ref);
		ref.a=data;
	}
}
class c
{
	public static void main(String[] args)
	{
		B start = new B();
		start.add(10);
		start.add(20);
		start.add(30);
	}
}
