package calculator;

public class CallingTypesOfMethod {
	
	public static void main(String[] args) {
		
		TypesOfMethod addTwo = new TypesOfMethod();
		
		
		addTwo.add();
		int additionResult1	= addTwo.add1();
		addTwo.add2(20,45,60,70);
		int additionResult3	= addTwo.add3(45,23,58,69,78);
		
		
		System.out.println(additionResult1);
		System.out.println(additionResult3);
	}

}
