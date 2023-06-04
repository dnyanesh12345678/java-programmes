class StaticBlock
{
	StaticBlock(){
		System.out.println("constructor is called");
	}
	 static
    {
        System.out.println(1);
    }
         static
    {
        System.out.println(2);
    }

         static
    {
        System.out.println(3);
    }
         static
    {   
        System.out.println(4);
    }

         static
    {   
        System.out.println(5);
    }

         static
    {   
        System.out.println(6);
    }
    public static void main(String[] args)
    {  
	StaticBlock a= new StaticBlock(); 
	new StaticBlock();
        System.out.println(7);
    }
} 









