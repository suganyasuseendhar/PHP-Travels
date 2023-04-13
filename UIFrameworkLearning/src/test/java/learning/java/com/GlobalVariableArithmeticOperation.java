package learning.java.com;

import org.testng.annotations.Test;

public class GlobalVariableArithmeticOperation {
int a=50;
int b=40;
int c=90;
int d=67;
@Test
public void total(){
int a = 95;
int b = 78;
int c = 98;
System.out.println ("The sum of total  addition is = " +( a+b+c ));
System.out.println ("The sum of total  subraction is = " +( a-b-c ));
System.out.println ("The sum of total multiplication is = " +( a*b*c ));
System.out.println ("The sum of total  division is = " +( a/b/c ));

}

@Test
public  void sum() {
	
	int d=78;
	int e=90;
	int a=67;
	a=55;
	
	
 System.out.println ("The sum of total is = " +( a+b+c ));
 System.out.println ("The sum of total multiplication is = " +  d*e*a);
 System.out.println ("The sum of subraction = " +( c-a ));
 System.out.println ("The sum of division is = " +(d/e ));
 System.out.println ("The sum of modulodivision is = " + d % a);
 
}

}

