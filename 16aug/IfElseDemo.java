
class IfElseDemo
{
	public static void main(String args[])
	{
		int num1= Integer.parseInt(args[0]);
		if(num1>50)
		{
		  num1= num1+10;
		  System.out.println("success");
		}
		else
		{
			System.out.println("Failure");
		    System.out.println(num1);		
        }
	
      //
	  int x=5;
	  int y=10;
	  if(x>y)
		  System.out.println("x is bigger");	
      else 
          System.out.println("y is bigger");		


// trenary operator
	  
     int res= (x>y)? x:y;
	  System.out.println(res);
	
	}
	
}
