class A
{  
        A()
	{  
            super();
            System.out.println("grandparent class constructor invoked");  
        }  
}  
class B2 extends A
{  
        B2()
	{  
            super();  
            System.out.println("parent class constructor invoked");  
        }
}
class B3 extends B2
{
       B3()
    {
       super();
       System.out.println("child class constructor invoked");
    }
       	       
{
	System.out.println("instance initializer block is invoked");
}  
  
public static void main(String args[])
{  
B3 b=new B3();  
} 
}
