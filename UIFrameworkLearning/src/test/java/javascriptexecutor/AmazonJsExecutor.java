package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonJsExecutor {

	WebDriver driver = null;

	@BeforeMethod(alwaysRun = true)
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	
	@Test
	
	public void amazonJS() {
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement SignInSecurely= driver.findElement(By.linkText("Sign in securely"));
		js.executeScript("arguments[0].click();", SignInSecurely);
		
		//scrollintoview
		WebElement 
		
	}
	
	
	
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		// driver.quit();
	}
	
}
