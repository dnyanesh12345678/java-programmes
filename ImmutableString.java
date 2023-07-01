public class ImmutableString{    
    public static void main(String args[]){    
        String NewString = "Hello";    
        NewString.concat("World");  
        System.out.println(NewString);    
    }    
}   

/*In the string constant pool, the Hello remains unchanged, and a new string object is created with HelloWorld. It shows that the strings are immutable. The reference variable points to the Hello not to the HelloWorld.

If we want that it refers to the HelloWorld, we have to explicitly assign it to that variable. For example:
*/
class ImmutableString1
{
    public static void main(String args[])
    {
        String NewString = "Hello";
        NewString = NewString.concat("World");
        System.out.println(NewString);
    }
}
