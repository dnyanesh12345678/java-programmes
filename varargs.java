class varargs
{
	static void fun2(String str,int ...a)
	{
		System.out.println("String: "+str);
		System.out.println("Number of argument is: "+a.length);
		for (int i: a)
		{
			System.out.print(i+" ");
			System.out.println();
		}
	}
		public static void main(String args[])
		{
			fun2("geeksforGeeks",100,200,300,400);
			fun2("CSPortal",1,2,3,4,5,6,7,8,9,11,23);
			fun2("forGeeks");
		}
}

