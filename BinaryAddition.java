package com.example.Lab_3;

public class BinaryAddition {
	static String add(String a,String b)
	{
		int num1= Integer.parseInt(a,2);
		int num2= Integer.parseInt(b,2);
		int sum = num1+num2;
		String result =Integer.toBinaryString(sum);
		return result;
		
	}
	
	public static void main(String args[])
	{
		String x="011011",y="1010111";
		System.out.print(add(x,y));
		
	}


}
