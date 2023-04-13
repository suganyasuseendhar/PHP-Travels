package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathCollegeForm {
	@Test
	public void form() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/xpathcollegeform.html");
		/* driver.get("https://www.facebook.com/login/identify?ctx=recover\""); */
		WebElement element = driver.findElement(By.xpath("//input[@id='firstname']"));
		element.sendKeys("suganya");

		element = driver.findElement(By.xpath("//input[@type='text' and @name='lname']"));
		element.sendKeys("suseendhar");
		
		element = driver.findElement(By.xpath("//input[@id='lastname']//following::input[1]"));
		element.sendKeys("hosur");
		
		

		element = driver.findElement(By.xpath("//label[text()='Days cholar']"));
		element.click();
		/*
		 * Assert.assertEquals(true, element.isDisplayed());
		 * 
		 * System.out.println("Click on me buttton is displayed - Assert Passed");
		 */

		element = driver.findElement(By.xpath("//input[contains(@name,'girl')]"));
		element.click();

		element = driver.findElement(By.xpath("//*[contains(@id,department_name) and @name='department' ]"));
		Select dd = new Select(element);
		dd.selectByVisibleText("MECH");
		/*
		 * Assert.assertEquals(true, element.isSelected());
		 * System.out.println("Submit button is selected");
		 */

		element = driver.findElement(By.xpath("//textarea[starts-with(@name,'message')]"));
		element.sendKeys("welcome to our college");

		element = driver.findElement(By.xpath("//input[@type='button' or @name='sub']"));
		element.click();
		Thread.sleep(3000);

		driver.switchTo().alert().accept();

		element = driver.findElement(By.xpath("//a[text()='Visit Us!']"));
		element.click();

		/*
		 * String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
		 * System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe"); element
		 * =
		 * driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click(
		 * );
		 */

	}

	@Test
	public void isDispalyed() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/xpathcollegeform.html");

		WebElement element = driver.findElement(By.xpath("//input[contains(@name,'girl')]"));
		element.click();

		Assert.assertEquals(true, element.isDisplayed());

		System.out.println("days scholar  buttton is displayed - Assert Passed");

		Thread.sleep(3000);
		driver.quit();

	}

	@Test
	public void isSelected() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/xpathcollegeform.html");

		WebElement element = driver.findElement(By.xpath("//*[contains(@id,department_name) and @name='department' ]"));
		Select dd = new Select(element);
		dd.selectByVisibleText("EEE");
		
		 Assert.assertEquals(true, element.isSelected());
		 System.out.println("Submit button is selected");
		  
		  Thread.sleep(3000); driver.quit();
		 
	}

	
	@Test
	public void isEnable() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/xpathcollegeform.html");

		WebElement element = driver.findElement(By.xpath("//input[@type='button' or @name='sub']"));
		element.click();
		String text = driver.switchTo().alert().getText();
		System.out.println("Alert text is : " + text);
		Thread.sleep(6000);
		//Assert.assertEquals(true, element.isSelected());
		Assert.assertEquals(true, element.isEnabled());
		System.out.println("Submit button is Enabled");

		Thread.sleep(3000);
		driver.quit();
	}

@Test	
	public void form1() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/xpathcollegeform.html");
		/* driver.get("https://www.facebook.com/login/identify?ctx=recover\""); */
		WebElement element = driver.findElement(By.xpath("//input[@type='text' and @name='lname']"));
		
		
		Assert.assertTrue(element.isDisplayed());
		Assert.assertTrue(element.isEnabled());

}
}