/*In simpler language whenever we use a static keyword and associate it to a block then that block is referred to as a static block. Unlike C++, Java supports a special block, called a static block (also called static clause) that can be used for static initialization of a class. This code inside the static block is executed only once: the first time the class is loaded into memory. 

Calling of static block in java?

Now comes the point of how to call this static block. So in order to call any static block, there is no specified way as static block executes automatically when the class is loaded in memory


Can we print something on the console without creating main() method?

It is very important question from the interview’s perceptive point. The answer is yes we can print if we are using JDK version 1.6 or previous and if after that  it will throw an. error. 

*/

// Java Program to Illustrate How Static block is Called

// Class 1
// Helper class
class question1 {

	// Case 1: Static variable
	static int i;
	// Case 2: non-static variables
	int j;

	// Case 3: Static block
	// Start of static block
	static
	{
		i = 10;
		System.out.println("static block called ");
	}
	// End of static block
}

// Class 2
// Main class
class answer1 {

	// Main driver method
	public static void main(String args[])
	{

		// Although we don't have an object of Test, static
		// block is called because i is being accessed in
		// following statement.
		System.out.println(question1.i);
	}
	
}
// Java Program to Illustrate Execution of Static Block
// Before Constructors

// Class 1
// Helper class
class question2 {

	// Case 1: Static variable
	static int i;
	// Case 2: Non-static variable
	int j;

	// Case 3: Static blocks
	static
	{
		i = 10;
		System.out.println("static block called ");
	}

	// Constructor calling
	question2() { System.out.println("Constructor called"); }
}

// Class 2
// Main class
class answer2 {

	// Main driver method
	public static void main(String args[])
	{

		// Although we have two objects, static block is
		// executed only once.
		question2 t1 = new question2();
		question2 t2 = new question2();
	}
}




