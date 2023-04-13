package learning.java.com;

import org.testng.annotations.Test;

public class DebugProgramLearnng {
	
	
	String name = "Sukanya";
	int m1 = 100;
	int m2=89;
	int m3 = 87;
	
	
	
	@Test
	public void report() {
		
		System.out.println("Report Card !!!!");
		int total = sum(m1,m2,m3);
		char grade = calGrade(total);
		
		System.out.println("Grade is  Card !!!!" + grade);

		
	}



	private char calGrade(int total) {
		// TODO Auto-generated method stub
		
		if (total > 75)
			return 'A';
		else
			return 'c';
					
	}



	private int sum(int m1 , int m2, int m3) {
		// TODO Auto-generated method stub
		return m1+m2+m3;
	}
	

}
