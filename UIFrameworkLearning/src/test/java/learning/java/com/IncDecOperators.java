package learning.java.com;

import org.testng.annotations.Test;

public class IncDecOperators {
	
	int a= 10; int b= 15;
@Test	
	public void increaseanddecrease()
	{
	
		int c = a++;
		int g = ++a;
		int d = ++a;
		int e = b--;
		int f = --b;
		
		
		
		System.out.println("the value of c is = " + c);
		System.out.println("the value of g is = " + g);
		System.out.println("the value of c is = " + c);
		System.out.println("the value of d is = " + d);
		System.out.println("the value of e is = " + e);
		System.out.println("the value of f is = " + f);
		
	}

}
