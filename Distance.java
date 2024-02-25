package com.example.Lab_3;



public class Distance {
	
		
		
			int minDist(int arr[],int n, int x, int y)
			{
			int i,j;
			int mindist= Integer.MAX_VALUE;
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if((x==arr[i]&&y==arr[j]||y==arr[i]&& x==arr[j])&& mindist>Math.abs(i-j))
					{
						mindist=Math.abs(i-j);
					}
				}
			}
			if(mindist>n) {
			return -1;}
			else
				{return mindist;}
		}
		
	
	  public static void main(String args[])
	  {
		  
		  Distance min = new Distance();
		  int a[]= {3,6,5,7,6,3,6,7,8,6};
		  int s=a.length;
		  int x=3;
		  int y=6;
		  System.out.println("Distance between X and Y "+min.minDist(a,s,x,y));
		  
	  }
	}



 
