package learning.java.com;

import org.testng.annotations.Test;

public class AssignmentOperator {
int a=50;
int b=40;
int c=90;
int d=67;
int e=a+b;
int f=b-c;
int g=a*b;
int h=a/b;
int i=d%b;
@Test
public void total(){
	
	int a=76;
	int b=49;
	int c=52;
	int d=67;
	int e=90;
	
	a=a+b;
	b=b-c;
	c=d*e;
	d=a/b;
	e=d%e;

System.out.println ("The addition operation is: = " +  (e));
System.out.println ("The subration operation is: = " +  (f));
System.out.println ("The multiplication operation is: = " +  (g));
System.out.println ("The division operation is: = " +  (h));
System.out.println ("The modulo addition operation is: = " +  (a));
System.out.println ("The addition operation is: = " +  (b));
System.out.println ("The subration operation is: = " +  (c));
System.out.println ("The multiplication operation is: = " +  (d));
System.out.println ("The multiplication operation is: = " +  (e));
System.out.println (a);
System.out.println (b);
System.out.println (c);
System.out.println (d);
System.out.println (e);

}



}

