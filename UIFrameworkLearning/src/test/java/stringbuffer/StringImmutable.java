package stringbuffer;

import org.testng.annotations.Test;

public class StringImmutable {
@Test
	public void tc1() 
	{
		String str= "learning";
		str.concat("java");
		//String str1=str.concat("java");
		
		
		System.out.println("The value of str is "+str);
		//System.out.println("The value of str is "+str1);
		//System.out.println(str +"Learning");

		
	}

@Test
	public void tc2() 
	{
	  String str = "selenium ";
	  String str1 = str.concat("with Java");
	  
	  System.out.println("The  value of str is : " + str);
	  System.out.println("The value of str1 is :" +  " "  +str1);
		
		
	}
}
