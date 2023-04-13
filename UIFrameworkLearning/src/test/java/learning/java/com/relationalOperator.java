package learning.java.com;

import org.testng.annotations.Test;

public class relationalOperator {
	
	int a = 50;
	int b=50;
	int c=60;
	int d=75;
@Test
	public void relationoper() {
	
	if(a==b) {
		
		System.out.println("condition true a is equal to b " + (a+ b) );
		System.out.println("value of a is " + a);
	}
	
	else {
		
		System.out.println("condition false a is not equal to b");
	}
if(a!=c) {
		
		System.out.println("condition true a is not equal to c " + a);
	}
else {
	
	System.out.println("condition false a is smaller than c ");
}
	
if(a>c) {
	
	System.out.println("condition true a is greater than c");
}
else {
	
	System.out.println("condition false is smaller than c");
}

if(a<c) {
	
	System.out.println("condition true a is smaller than c");
}
else {
	
	System.out.println("condition false is bigger than c");
}
	
if(a>=c) {
	
	System.out.println("condition true a is greater than or equal to c");
}
else {
	
	System.out.println("condition false");
}


if(a<=d) {
	
	System.out.println("condition true a is smaller than or equal to d");
}
else {
	
	System.out.println("condition false");
}
}

}
