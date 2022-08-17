/*
Program: Data types in java
@author:Shuruti Singhal
@Date: 16 august 2022
*/

class DataTypeDemo2
{
	public static void main(String args[])
	{
		short a= 34;
		short b =18;
		a=(short)(a+b);
		System.out.println(a);
		
		float f1= 3.55f;
		double d1= 7.905;
		
		double ans= f1+d1;
		System.out.println(ans);
		
		// trenary operator : if else 
			
		//variable =(expression)? " true": "false"
		
     int x=2,y=5;
	 int min= (x>y)?y:x;
	 System.out.println("The min is :"+min );
	 
	 
	  int marks=Integer.parseInt(args[0]);
	  String status =(marks>60)? "pass":"fail";
	  System.out.println(status);
		
	}
	
}
