package learning.java.com;

import java.util.Scanner;

import org.testng.annotations.Test;

public class EvenNumber {
	
	
	
	
	
	/*
	 * 
	 * 5
	 * 2 4
	 * 
	 * 10
	 * 2 4 6 8 10
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
@Test
	
public void even()
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number is :  ");
		int number = sc.nextInt();
		int i=20;
		
		while (i<=number){
			
			
			if(i % 2 ==0) {
				
			
			System.out.println (i);
			
			
		}
	
			i++;	
		
		
		
	}
	
}
	
}
