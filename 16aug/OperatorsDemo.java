
/*
Program: Different operators in java
@author:Shuruti Singhal
@Date: 16 august 2022
*/

class OperatorsDemo
{
	public static void main(String args[])
	{
		// increment and decrement 
		
		int x=10;
	
		System.out.println("The value of x is :" +  (x--)); // post increment -> use the value and then increment
		System.out.println("The value of x is :" +(--x)); // pre increment -> increment and then use
		
       int a=10;
	   int b = a++ + ++a;
	   System.out.println("The value of b is :" + (~b)); 
       
	   // negate 
	   
	   int y=0;
	    System.out.println("The value of y is :" + (~y)); 
	    // negate of 0 is -1
		
		boolean c = true;
		 System.out.println("The value of c is :" + (!c)); 
		 
		 //modulus
		 int num1=98;
		 int num2=4;
		 float q= (float)num1/num2;
		 int r= num1% num2;
		 System.out.println("The quotient is  :" + q); 
		  System.out.println("The remainder r :" + r); 
		  
		  // left shift 
		  
		  System.out.println(10<<2);  // 10*2^2= 40
		  System.out.println(20<<4); // 20*2^4 = 320

              // right shift
             System.out.println(20>>2); // 20/2^2= 5
			 
		  
		  //Logical operators
		  And &&
		  Or ||
		  
		  
		  x=x*y;
		  x*=y;
		  
		  
		  
		  
          10
		  
		  00001010 
		  00010100
		  00101000 = 32+8= 40
	}
	
}

 