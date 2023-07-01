package com.banking;
public class user_info
{
	private String account_user_name;
	private long account_number;
	private String IFSC_NUMBER;
	private long BANK_BALANCE;

	public void  passinfo( long account_number, long BANK_BALANCE, String IFSC_NUMBER,String account_user_name)
	{
		this.account_number=account_number;
		this.BANK_BALANCE= BANK_BALANCE;
		this.IFSC_NUMBER=IFSC_NUMBER;
		this.account_user_name=account_user_name;
	}
	public void info()
	{
		System.out.println(" account details " + " account_number= " + account_number + " account_user_name= " + account_user_name + " IFSC_NUMBER= " + IFSC_NUMBER + " BANK_BALANCE= " + BANK_BALANCE );
	}
}


