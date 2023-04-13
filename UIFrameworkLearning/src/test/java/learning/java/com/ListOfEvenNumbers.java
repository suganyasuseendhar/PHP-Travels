package learning.java.com;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;


public class ListOfEvenNumbers {


	
	int i=0;
	
@Test
public void evenNum() {
	
	String[] numbers = new String[3];
	Scanner sc = new Scanner(System.in);

	{

	for( i=0; i<=numbers.length-1; i++)
	{
		System.out.println("Enter the numbers " + i + " value :" );
		numbers[i]=sc.nextLine();
		
		}

	System.out.println("Enter the car numbers are :" );

	for  (i=0; i<=numbers.length-1; i++)
		
	{
		 
		System.out.println(" Enter the numbers " + i + " value is :" + numbers[i] );
		 
		 
		 
	}
	
/*for  (i=0; i<=numbers.length-1; i++) {
	
	
	if( numbers[i]% 2 ==0)
	{
		System.out.println(" Enter the even numbers " + i + " value is :" + numbers[i] );

		
	
		 
		 
	}*/
	
	
	
	}


	}
		

}
