public class variable_demo  {
   
    public static String classVariable = "I am associated with the class";
    public String instanceVariable = "I am associated with the instance";
    
    public void setText(String string){
        this.instanceVariable = string;
    }
    
    public static void setClassText(String string){
        classVariable = string;
    }
    
    public static void main(String[] args) {
        variable_demo test1 = new variable_demo();
        variable_demo test2 = new variable_demo();
        
        // Change test1's instance variable
        test1.setText("Changed");
        System.out.println(test1.instanceVariable); // Prints "Changed"
        // test2 is unaffected
        System.out.println(test2.instanceVariable); // Prints "I am associated with the instance"
        
        // Change class variable (associated with the class itself)
        variable_demo.setClassText("Changed class text");
        System.out.println(variable_demo.classVariable); // Prints "Changed class text"
	test1.setClassText("dnyaneshwar's testing");
        
        // Can access static fields through an instance, but there still is only one
        // (not best practice to access static variables through instance)
        System.out.println(test1.classVariable); // Prints "Changed class text"
        System.out.println(test2.classVariable); // Prints "Changed class text"
	System.out.println(variable_demo.classVariable);
    }
}
