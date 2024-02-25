package com.example.Lab_3;

public class Rectangle {
	int height,width;
	Rectangle(int h, int w){
		height=h;
		width=w;
	}
	int perimeter(int h, int w)
	{
		return 2*(h+w);
	}
	
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle(5,3);
		
		System.out.println("Height :"+r1.height+" Width: "+r1.width);

      
		
		System.out.println("Perimeter: "+r1.perimeter(5, 3));
	
	}


}
