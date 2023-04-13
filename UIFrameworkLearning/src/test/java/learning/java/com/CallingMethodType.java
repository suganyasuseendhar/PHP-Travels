package learning.java.com;

import org.testng.annotations.Test;

public class CallingMethodType {
	
	int a =50; int b= 60; int g;
	
	
@Test
public void add()
	{
		
	
	System.out.println("value of a and b is = " + (a+b));
	}

public int sub()
{
	
 
System.out.println("value of subraction is = " + (a-b));
return (a-b);
}


public void mul(int c, int d)
{
	
 
System.out.println("value of multiplication of c*d is = " + (g = c * d));
System.out.println("value of g is =  " + g);

}

public int div (int e, int f)
{
	

System.out.println("value of multiplication of e/f is = " + (e/f));
return (e/f);

}

public class MainMethod
{

	@Test
public void doingoperation()
{
	
	CallingMethodType object= new CallingMethodType();
	
	object.add();
int subractionresult	= object.sub();
object.mul(55 , 56);
int divisionresult = object.div(20, 2);
System.out.println("value of addition result := " + (a+b));
System.out.println("value of subraction result := " + subractionresult );

//System.out.println("value of multiplication result := " + g );
System.out.println("value of division result := " + divisionresult );

}
}																																

}

