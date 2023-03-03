 class method {


	private int number;
	private String name;

	
	public int getNumber() { return number; }

	public String getName() { return name; }

	
	public void setNumber(int number)
	{
		this.number = number;
	}

	public void setName(String name) { this.name = name; }


	public void printDetails()
	{
		System.out.println("Number: " + number);
		System.out.println("Name: " + name);
	}

public static void main(String[] args){
method example = new method();
example.setNumber(123);
example.setName("GFG Write");
example.printDetails();
}
}



/*
There are several advantages to using methods in Java, including:
Reusability: Methods allow you to write code once and use it many times, making your code more modular and easier to maintain.
Abstraction: Methods allow you to abstract away complex logic and provide a simple interface for others to use. This makes your code more readable and easier to understand.
Improved readability: By breaking up your code into smaller, well-named methods, you can make your code more readable and easier to understand.
Encapsulation: Methods allow you to encapsulate complex logic and data, making it easier to manage and maintain.
Separation of concerns: By using methods, you can separate different parts of your code and assign different responsibilities to different methods, improving the structure and organization of your code.
Improved modularity: Methods allow you to break up your code into smaller, more manageable units, improving the modularity of your code.
Improved testability: By breaking up your code into smaller, more manageable units, you can make it easier to test and debug your code.
Improved performance: By organizing your code into well-structured methods, you can improve performance by reducing the amount of code that needs to be executed and by making it easier to cache and optimize your code.
*/

