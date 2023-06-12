//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods  
class Account{  
int acc_no;  
String acc_name;  
float amount;  
//Method to initialize object  
void insert(int a,String n,float amt){  
acc_no=a;  
acc_name=n;  
amount=amt;  
}  
//deposit method  
void deposit(float amt){  
amount=amount+amt;  
System.out.println(amt+" deposited");  
}  
//withdraw method  
void withdraw(float amt){  
if(amount<amt){  
System.out.println("Insufficient Balance");  
}else{  
amount=amount-amt;  
System.out.println(amt+" withdrawn");  
}  
}  
//method to check the balance of the account  
void checkBalance(){System.out.println("Balance is: "+amount);}  
//method to display the values of an object  
void display(){System.out.println("account number for user "  + acc_name +" is "+acc_no+" his balance is "+amount);}  

void account_details()
{
	System.out.println("account user is " + acc_name );
	System.out.println("account number is " + acc_no );
	System.out.println("total balance is " + amount );
}
}
//Creating a test class to deposit and withdraw amount  
class banking{  
public static void main(String[] args){  
Account a1=new Account();  
a1.insert(832345,"Ankit",1000);  
a1.display();  
a1.checkBalance();  
a1.deposit(40000);  
a1.checkBalance();  
a1.withdraw(15000);  
a1.checkBalance();
System.out.println("account infromation for user "+ a1.acc_name );
a1.account_details();
}}   
