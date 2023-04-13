package waits;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class WaitExampleProgram {

	public class Waits {

		WebDriver driver = null;

		@BeforeMethod
		public void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		
		
	@Test	
	public void implictWait() {
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("selenium \n");
		driver.close();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("java \n");
		driver.close();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("linux \n");
		driver.close();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("windows \n");
		driver.close();
	
	
	
	}
	
	@Test
	
	public void implicitWaitAmazon() {
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("selenium \n");
		driver.close();
	}
	
	
	
	
	@Test
	public void explictWait() {
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("q")));
		driver.findElement(By.name("q1")).sendKeys("windows \n");
		driver.findElement(By.name("q")).sendKeys("windows \n");
		driver.findElement(By.name("q2")).sendKeys("windows \n");
		
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		
	}
	
	
	@Test
	public void explictWaiVisibilityt() {
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		//wait.until(ExpectedConditions.visibilityOfAllElements(By.xpath("//input[@name='btnI']]"));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='btnI']]")));
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
	
@Test
public void fluentAmazon() {
	
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(2));
	w.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
	driver.findElement(By.name("q")).sendKeys("Selenium Guvi \n");
	
}
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
}


}
}


