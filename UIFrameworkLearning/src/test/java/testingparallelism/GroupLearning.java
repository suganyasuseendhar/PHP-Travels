package testingparallelism;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupLearning {
WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	
	@Test (groups= {"sanity"})
	public void guvi() {
		
		driver.get("https://www.guvi.in");
		
	}

	@Test (groups= {"regression"})
	public void javaTPoint()
	{
		driver.get("https://www.javatpoint.com/");
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeBrowser()
	{
		driver.quit();
	}
}