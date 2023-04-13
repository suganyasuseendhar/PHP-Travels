package learning.java.com;

import java.util.Scanner;

import org.testng.annotations.Test;

public class SwithCaseStudy {
	
	@Test
	public void switchLearn() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 :
			System.out.println("January");
			System.out.println("January has 31 days ");
			break;
		case 2 :
			System.out.println("February");
			System.out.println("February has 28 days ");
			break;	
		case 3 :
			System.out.println("March");
			System.out.println("March has 31 days ");
			break;
		case 4 :
			System.out.println("April");
			System.out.println("April has 30 days ");
			break;
		case 5 :
			System.out.println("May");
			System.out.println("May has 31 days ");
			break;
		case 6 :
			System.out.println("June");
			System.out.println("June has 30 days ");
			break;
		case 7 :
			System.out.println("July");
			System.out.println("July has 31 days ");
			break;
		case 8 :
			System.out.println("Augest");
			System.out.println("Augest has 31 days ");
			break;
		case 9 :
			System.out.println("September");
			System.out.println("September has 30 days");
			break;
		case 10 :
			System.out.println("October");
			System.out.println("October has 31 days");
			break;
		case 11 :
			System.out.println("November");
			System.out.println("November has 30 days");
			break;
		case 12 :
			System.out.println("December");
			System.out.println("December has 31 days");
			break;
		
		default :
			System.out.println("invalid value, value should be between 1 to 12");
		}
		
	}

}
