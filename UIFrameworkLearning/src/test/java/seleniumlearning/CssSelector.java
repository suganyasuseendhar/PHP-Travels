package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	WebDriver driver = null;
	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void cssSelectorFacebook() {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector(""))
		
		
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
}
