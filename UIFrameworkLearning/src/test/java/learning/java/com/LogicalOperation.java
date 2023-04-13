package learning.java.com;

import org.testng.annotations.Test;

public class LogicalOperation {
	
	int a =30;
	int b = 40;
	int c = 40;
	
@Test
	public void logicoperand()

	{
	if(a<b && b==c)
	{
		int d = a+b+c;
		int e= a*b*c;
		System.out.println("condition valid and result of d is" + d);
		System.out.println("condition valid and result of e is" + e);
		
	}
	else {
		
		System.out.println("condition not vaild");
		
	}	
		
	}
@Test
public void logicoperor()


{
	
   if(a<b || b==c)
	{
	
	System.out.println("condition valid");
	
}
else {
	
	System.out.println("condition not vaild");
	
}	
	
}

@Test
public void logicopernot()


{
	
   if(!(a<b && b==c))
	{//condition is true display false statement
	   //condition if false display true statement
	
	System.out.println("condition valid display false");
	
}
else {
	
	System.out.println("condition not vaild display true");
	
}	
	
}
}
