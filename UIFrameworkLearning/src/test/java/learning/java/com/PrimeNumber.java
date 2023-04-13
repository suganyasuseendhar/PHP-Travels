package learning.java.com;

import org.testng.annotations.Test;

public class PrimeNumber {
@Test
	public void main() {
		
	
	int m = 0,flag = 0; 
	int n=12;
	m = n/2;
	for(int i=2;i<m;i++)
	{
		if(n%2==0) {
			
			System.out.println(n + " it is not a prime number");
			flag=1;
			break;
			
			
		}
		if(flag == 0 && !(n==0 || n==1)) {
			
			
			System.out.println(n + " is a prime number");
			break;
		}
		
	}
	
	}
}
	
	

