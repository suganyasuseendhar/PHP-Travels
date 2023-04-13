package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsHandling {

	@Test
	public void alert() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/alerts.html");
		// WebElement element = driver.findElement(By.id(""));

	}

	@Test
	public void infoAlertHandling() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/alerts.html");

		// WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		// element.sendKeys("java/n");
		// WebElement element =
		// driver.findElements(By.xpath("//button[@onclick='alertFunction()']"));

		WebElement element = driver.findElement(By.xpath("//button[@onclick='alertFunction()']"));
		element.click();
		Thread.sleep(3000);

		driver.switchTo().alert().accept();
		driver.quit();
	}

	@Test
	public void dessionMakingAlert() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/alerts.html");

		WebElement element = driver.findElement(By.xpath("//button[@onclick='confirmFunction()']"));
		element.click();
		Thread.sleep(3000);
		String text = driver.switchTo().alert().getText();
		System.out.println("Alert text is : " + text);
		driver.switchTo().alert().dismiss();
		String actualResult = driver.findElement(By.xpath("//p[@id='confirmdemo']")).getText();
		System.out.println("the actual result is : " + actualResult);
		String exceptedResult = "You Clicked on OK!";
		/*
		 * if(actualResult.equals(exceptedResult)) {
		 * 
		 * System.out.println("your teat case is passed");} else
		 * 
		 * {System.out.println("your teat case is failes"); }
		 */
		Assert.assertEquals(actualResult, exceptedResult);

		/*
		 * Assert.assertTrue(element.isDisplayed());
		 * Assert.assertFalse(element.isEnabled());
		 */
		driver.quit();
	}

	@Test
	public void promptBoxAlert() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/alerts.html");

		WebElement element = driver.findElement(By.xpath("//button[@onclick='promptFunction()']"));
		element.click();
		Thread.sleep(6000);
		String text = driver.switchTo().alert().getText();
		System.out.println("Alert text is : " + text);
		Thread.sleep(6000);
		driver.switchTo().alert().sendKeys("suganya");
		driver.switchTo().alert().accept();
		String actualResult = driver.findElement(By.xpath("//p[@id='promptdemo']")).getText();
		System.out.println("the actual result is : " + actualResult);
		String exceptedResult = "****Hello suganya! Welcome to Excel ITac****";
		/*
		 * if(actualResult.equals(exceptedResult)) {
		 * 
		 * System.out.println("your teatcase is passed");} else
		 * 
		 * { System.out.println("your teatcase is failes"); driver.quit();
		 * 
		 * 
		 * 
		 * }
		 */
		Assert.assertEquals(actualResult, exceptedResult);
	}



	@Test

	public void assertEquals() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/alerts.html");

		WebElement element = driver.findElement(By.xpath("//button[@onclick='promptFunction()']"));
		element.click();

		driver.switchTo().alert().accept();

		String expectedText = "Click on me";
		Assert.assertEquals(expectedText, element.getText());
		System.out.println(element.getText());
		System.out.println("expected text is : passed ");

		Thread.sleep(3000);
		driver.quit();
	}
	
	
	@Test
	public void isDispalyed() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/alerts.html");

		WebElement element = driver.findElement(By.xpath("//button[@onclick='promptFunction()']"));

		Assert.assertTrue(element.isDisplayed());
		Assert.assertTrue(element.isEnabled());

		System.out.println("Click on me buttton is displayed - Assert Passed");

		Thread.sleep(3000);
		driver.quit();
	}
@Test	
	public void isSelected() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/alerts.html");

		WebElement element = driver.findElement(By.xpath("//button[text()='Click on me']"));
		element.click();
		//Assert.assertEquals(true, element.isSelected());
		Assert.assertEquals(true, element.isSelected());
		System.out.println("Submit button is selected");

		Thread.sleep(3000);
		driver.quit();
	}


@Test
public void isEnable() throws Exception {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get(
			"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/alerts.html");

	WebElement element = driver.findElement(By.xpath("//button[text()='Click on me']"));
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

}
