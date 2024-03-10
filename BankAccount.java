package com.example.BankAccount;

public class BankAccount {
	
	private double balance;
	private String accountNo,name;
	public void setaccountno(String a)
	{
		accountNo=a;
	
	}
	public void setbalance(double b)
	{
		balance=b;
	
	}
	public void setname(String n)
	{
		name=n;
	
	}
	public String getaccountno()
	{
		
		return accountNo;
	}
	public double getbalance()
	{
	
		return balance;
	}
	public String getname()
	{
	
		return name;
	}
	
	
	
	
	public static void main(String args[])
	{
		BankAccount b=new BankAccount();
		b.setaccountno("123567555");
		b.setname("kochy");
		b.setbalance(67.89);
		System.out.println("Account no : "+b.getaccountno());
		System.out.println("Name : "+b.getname());
		System.out.println("Balance : "+b.getbalance());
		
		
	}

}
