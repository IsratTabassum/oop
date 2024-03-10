package com.example.BankAccount;

import java.util.Scanner;

public class Account2 {
	private double balance;
	private String accountNo,name,accountOpenDate;
	public void setaccountno(String a)
	{
		accountNo=a;
	
	}
	
	public void setname(String n)
	{
		name=n;
	
	}
	public void setaccountOpenDate(String accop)
	{
		accountOpenDate=accop;
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
	public String getaccountOpenDate()
	{
	
		return accountOpenDate ;
	}
	public void deposit(double de)
	{
		balance=balance+de;
		
	}
	public void withdraw(double w)
	{
		balance=balance-w;
		
		
	}
	

	public static void main(String args[])
	{
		Account2 b=new Account2();
		
		

		
		
		b.setaccountno("123567555");
		b.setname("kochy");
		b.setaccountOpenDate("12/04/2023");
		
		System.out.println("Account no : "+b.getaccountno());
		System.out.println("Name : "+b.getname());
		b.deposit(500.0);
		b.withdraw(200.00);
		b.withdraw(10);
		System.out.println("Account Opening Date : "+b.getaccountOpenDate());
		System.out.println("Balance : "+b.getbalance());
		
		
		
		
		
		
	}


}
