package com.example.Lab_3;

public class Person {
	
	String name;
	int age;
	Person(String n,int a)
	{
		name=n;
		age= a;
	
	}
	
	public static void main(String args[])
	{
		Person p1 = new Person("SHAYAN",1);
		System.out.println("Name :"+p1.name+" Age: "+p1.age);
		
	}

}
