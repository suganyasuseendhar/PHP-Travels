package learning.java.com;

import org.testng.annotations.Test;

public class BreakVsContinue {
	
@Test	public void brecon()
	{		for(int i=1; i<=10; i++) {
			if(i==5) {
			
			System.out.println(i + "value is 5 so iterate the loop");
			continue;
			
		}
		
		
			System.out.println(i);
			
		
		
		
	}

}


}
