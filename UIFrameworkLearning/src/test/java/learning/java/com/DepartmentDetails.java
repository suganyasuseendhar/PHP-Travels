package learning.java.com;

import org.testng.annotations.Test;

public class DepartmentDetails {
	String name;
	int rollnumber;
	int regno;
	int year;
	int batch;
	static String collegeName = "muthayammal Engg College";


public DepartmentDetails(String name, int rollnumber, int regno, int year, int batch)
	{
		
this.name=name;
this.rollnumber=rollnumber;
this.regno=regno;
this.year=year;
this.batch=batch;
}
@Test	
	public void showValues()
	{
	System.out.println(name);	
	System.out.println(rollnumber);
	System.out.println(regno);
	System.out.println(year);
	System.out.println(batch);
	System.out.println(collegeName);
		
}	


}

