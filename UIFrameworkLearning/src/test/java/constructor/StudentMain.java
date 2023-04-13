package constructor;

public class StudentMain {

public static void main(String[] args) {
	
	
	/*int rollnumber;
	String name;
	String clas;
	int mark;
	int average;*/
	
	Student suganya= new Student(1234,"suganya", "12th",450, 89);
	Student latha= new Student(1234,"latha", "12th",480, 89);
	Student maya= new Student(1234,"maya", "12th",450, 89);
	Student shreemathi= new Student(1234,"shreemathi", "12th",450, 89);
	Student lavanya= new Student(1234,"lavanya", "12th",450, 89);
	
	
	suganya.displayDetails();
	latha.displayDetails();
	maya.displayDetails();
	shreemathi.displayDetails();
	lavanya.displayDetails();
	
}



}
