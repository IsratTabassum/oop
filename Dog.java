package com.example.Lab_3;

public class Dog {
	String name,breed;
	Dog(String n, String b){
		name=n;
		breed=b;
	}
	void set(String n, String b)
	{
		name=n;
		breed=b;
	}
	
	public static void main(String args[])
	{
		Dog d1 = new Dog("kiki","Golden retriver");
		Dog d2 = new Dog("gigi","labrador");
		System.out.println("Name :"+d1.name+" breed: "+d1.breed);
		System.out.println("Name :"+d2.name+" breed: "+d2.breed);
		d1.set("shita","German Shepard");
		d2.set("saski","Pitbull");
		System.out.println("Name :"+d1.name+" breed: "+d1.breed);
		System.out.println("Name :"+d2.name+" breed: "+d2.breed);
		
	}

}
