package testngleaning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationExecution {
	 @Test 
	
	  public void f() {
	  
	  
	  System.out.println("main method"); }
	 
  @Test
public void testCase1() {
	  
	  
	  System.out.println("testCase1");
  }
  
  @Test
public void testCase2() {
	  
	  
	  System.out.println("testCase2");
}
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("beforeMethod method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeMethod method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("beforeMethod method");
  }

}
