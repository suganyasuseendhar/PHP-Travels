package overridding;



public class MainMethod {

	
	
		public static void main(String[] args) {
			
			ScientificCalculator sc1 = new ScientificCalculator();
			
			int addOfResult=sc1.add(50,80,90);
			
			sc1.add(50,80,90);
			//System.out.println("this is overridding maethod :" + addOfResult);
			System.out.println("this is overridding maethod :" + sc1.add(50,80,90));
			
}
}