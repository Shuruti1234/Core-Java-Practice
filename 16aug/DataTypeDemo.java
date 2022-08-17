/*
Program: Data types in java
@author:Shuruti Singhal
@Date: 16 august 2022
*/

class DataTypeDemo
{
	public static void main(String args[])
	{
		int num1= Integer.parseInt(args[0]); // converting string to int
		int num2= Integer.parseInt(args[1]);
		System.out.println("The result  is:"+ (num1/num2)); // runtime exception
		
		// float
		float f1= 7.9f;
		float f2= 0f;
		System.out.println("The result of float is:"+ (f1/f2));// infinity
		
		//byte
		byte b1= 15;
		System.out.println(b1);
		
		//char
		// ascii value of 
		char c1='A';
		int num = c1;
		System.out.println("The ASCII value of "+ c1 +" is :"+ num);
		
		

		
	}
	
}
