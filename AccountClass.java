package com.example.BankAccount;
import java.util.Scanner;
public class AccountClass {
	private double balance;
	private String accountNo,name,accountOpenDate;
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
		balance+=de;
		System.out.println("Remaining balance="+balance);
		
	}
	public void withdraw(double w)
	{
		balance=balance-w;
		System.out.println("Remaining balance="+balance);
		
	}
	
	
	
	public static void main(String args[])
	{
		AccountClass b=new AccountClass();
		Scanner s= new Scanner(System.in);
		
		System.out.println("Deposit amount");
		double d=s.nextDouble();
		b.deposit(d);
		System.out.println("Withdraw amount");
		double w=s.nextDouble();
		b.withdraw(w);
		
		
		b.setaccountno("123567555");
		b.setname("kochy");
		b.setbalance(667.89);
		//b.setaccountOpenDate("12/04/2023");
		
		System.out.println("Account no : "+b.getaccountno());
		System.out.println("Name : "+b.getname());
		System.out.println("Balance : "+b.getbalance());
		//System.out.println("Balance : "+b.getaccountOpenDate());
		
		
	}


}
