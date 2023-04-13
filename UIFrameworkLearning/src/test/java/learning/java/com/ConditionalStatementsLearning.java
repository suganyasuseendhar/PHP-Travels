package learning.java.com;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ConditionalStatementsLearning {
	
	@Test
	
	public void ifElseLearning() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your total Marks : ");
		int total = sc.nextInt();
		
	  // int total = 250;
		
		if(total>300) {
			System.out.println("grade is A");
		}
		else if(total >200) {
			System.out.println("grade is B");
		}
		else 
			System.out.println("Fail");
		
		
		
		
	}
	
	@Test
public void nestedIf() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your total Marks : ");
		int total = sc.nextInt();
		System.out.println("enter your days of attendance  : ");

		int attendeance = sc.nextInt();
		
	  // int total = 250;
		
		if(total>300) {
			if(attendeance >75) {
				System.out.println("grade is A+");
				
			}
			else if(attendeance>50) {
				System.out.println("grade is A");

			}
		}
		else if(total >200) {
			System.out.println("grade is B");
		}
		else 
			System.out.println("Fail");
		
		
		
		
	}
	

	
	

}