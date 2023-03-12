import java.util.Arrays;


class copyofarray {

	
	public static void main(String[] args)
	{
		
		String a[] = {"dnyaneshwar","Gaurav","sagar","naeem"  };

		String b[] = Arrays.copyOfRange(a, 0, 4);

                 a[0]="kunal";
		System.out.println("Contents of a[] ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		// Iterating over array b[]
		System.out.println("\n\nContents of b[] ");
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
	}
}


