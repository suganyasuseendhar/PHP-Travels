package testngleaning;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class GoogleValidation {
	
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void start() {
		WebDriverManager.chromedriver().setup();
		 new ChromeDriver();
		driver.get("https://www.google.com/?gfe_rd=cr&ei=G_bFVrzmIeOK8QeRrr2wDg&gws_rd=cr&fg=1");

	}
	
	@AfterMethod
	public void close() {
		
		driver.close();
		
	}
	
	
	@Test
	public void testCase1() {

	
		WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
		ele.sendKeys("selenium\n");
	}

	@Test
	public void testCase2() {

		driver.findElement(By.linkText("Images")).click();
}

	@Test
	public void testCase3() {

		driver.findElement(By.linkText("News")).click();
}

}
