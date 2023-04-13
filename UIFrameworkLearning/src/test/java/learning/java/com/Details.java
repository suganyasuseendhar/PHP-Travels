package learning.java.com;

import org.testng.annotations.Test;

public class Details {
	@Test
	public void operation()	{
		
		DepartmentDetails sugan = new DepartmentDetails ("suganya", 123456, 5654687, 4,2015);
		sugan.showValues();
		
		DepartmentDetails latha = new DepartmentDetails("latha", 123457, 8987899, 4,2016);
		sugan.showValues();
		
	}
	
	

}


