package learning.java.com;

import org.testng.annotations.Test;


public class debugPro {
	
	int tamil = 90;
	int english= 89;
	int maths = 78;
	int science=78;
	int social=95;
	int total =  sum (tamil,english,maths,science,social);
	int  avg = total /5;
	char grade ='a' ;
	



@Test
private char calculategrade() {



	
	
	
	if (avg>75 ) {
		grade='A';
	}

	else if(avg>50) {
		grade='B';
	}
	else 
		grade='C';
		
	return grade;
	// TODO Auto-generated method stub

	}
	
private int sum(int tamil, int english, int maths, int science, int social) {
return (tamil + +english + maths + science + social);
}
	
}


/*package learningjava;

import org.testng.annotations.Test;

public class Iterations {
	
	
	
	@Test
	public void debugLearning() {
		
		int mark1 = 100;
		int mark2  = 56;
		int mark3 = 76;
		
	int	total = sum (mark1,mark2,mark3);
	
	double avg = total /3;
	char grade = calculategrade(avg);
		
		System.out.println("student grade is " +grade);
		
		
		
		
	}
	
	// method with return type and without arguments
	private  char calculategrade(double avg) {
		
		char grade;
		if (avg>75 ) {
			grade='a';
		}
		
		else if(avg>50) {
			grade='b';
		}
		else 
			grade='c';
			
		return grade;
		// TODO Auto-generated method stub
		
	}

// method with return type with arguments
	private int sum(int mark1, int mark2, int mark3) {
		return mark1+mark2+mark3;
	}
*/