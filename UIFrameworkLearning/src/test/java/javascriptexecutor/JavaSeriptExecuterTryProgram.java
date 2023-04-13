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

public class JavaSeriptExecuterTryProgram {

	WebDriver driver = null;
	
	@BeforeMethod(alwaysRun = true)
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	
	@Test
	public void guvi() {
		
		try {
			driver.get("https://www.guvi.in/");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			
			
			
			WebElement signUp= driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary text-white px-4']"));
			((JavascriptExecutor) jse).executeScript("arguments[0].click();", signUp);
			
			//jSE.executeScript("arguments[0].click();", signUp);
			
			WebElement learnMore = driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary learn-more']"));
			((JavascriptExecutor) jse).executeScript("arguments[0].scrollIntoView(true);",learnMore);
			
			//WebElement helpCentre = driver.findElement(By.linkText("Help Center"));
			//js.executeScript("arguments[0].scrollIntoView(true);", helpCentre);
			
			//get page title
			
			
			System.out.println(jse.executeScript("return document.title").toString());
			//System.out.println(jse.executeScript("return document.title").toString());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		// driver.quit();
	}	
	
}
