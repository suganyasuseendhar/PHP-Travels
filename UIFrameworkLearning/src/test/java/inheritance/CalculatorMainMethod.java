package inheritance;

public class CalculatorMainMethod {
	public static void main(String[] args) {
		
		ScientificCalculator sc = new ScientificCalculator();
		
		int addResult = sc.add(80, 90);
		sc.sin();
		int divResult =sc.div(90, 56, 2);
		int subResult= sc.sub(67, 45);
		int subResult1 = sc.sub(77, 48, 45, 78);
		
		
		System.out.println(addResult);
		System.out.println(divResult);
		System.out.println(subResult);
		System.out.println(subResult1);
		
		int addOfResult=sc.add(50,80,90);
		System.out.println("this is overridding maethod :" + addOfResult);
		System.out.println("this is overridding maethod :" + sc.add(50,80,90));
		
	}

}
