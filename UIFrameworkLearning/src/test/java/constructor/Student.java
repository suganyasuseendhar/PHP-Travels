package constructor;

public class Student {
	
	int rollnumber;
	String name;
	String clas;
	int mark;
	int average;
	
	
	public Student(int rollnumber,String name, String clas,int mark, int average ) {
		
		this.rollnumber= rollnumber;
		this.name= name;
		this.clas= clas;
		this.mark= mark;
		
		this.average= average;
		
		
		
	}
	
	public void displayDetails()
	{
		
	System.out.println(rollnumber);
	System.out.println(name);
	System.out.println(clas);
	System.out.println(mark);
	System.out.println(average);
	System.out.println(rollnumber);
		
		
		
	}
		
		
		
	}

