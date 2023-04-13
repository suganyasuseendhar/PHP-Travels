package waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	WebDriver driver = null;

	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	//@Test
	public void implicitWaitEx() {
		driver.get("https:\\www.google.com");
		//driver.manage().window().maximize();
		
		//Implicit wait is common for all the webelements for that particular driver instance

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit wait is applicable for a particular webelement and it will throw an expected until a certain condition is not met
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q1")));

		driver.findElement(By.name("q")).sendKeys("selenium \n");
		
		//click action will be put
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
	}
	
	@Test
	public void fluentWaitEx()
	{
		
		
		driver.get("https:\\www.google.com");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2));
		w.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		
		driver.findElement(By.name("q")).sendKeys("Selenium Guvi \n");
				
				
		
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}
///java script executer
}
