package testngleaning;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterLearning {

	@Test
	@Parameters({"suganya", "suseendhar", "shibin"})
	 public void parameterLearning(String hi, String hello, String howareu) {
		 
		System.out.println(hi); 
		System.out.println(hello); 
		System.out.println(howareu); 
		 
		 
		 
	 }
}
