package crossbrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

  public class CrossBrowserTesting {
	
	  WebDriver driver;
		
	  @BeforeMethod
	  @Parameters({"browser"})
		
		public void launchBrowser(String browserName)
		{
			if(browserName.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
			}
		}
		
		
		@Test
		public void verifyTitle()
		{
			
			driver.get("https://www.google.com");
			String expectedTitle="Google";
			Assert.assertEquals(driver.getTitle(), expectedTitle);
			driver.findElement(By.name("q")).sendKeys("guvi Learning");
		}
		
		@AfterMethod
		public void closeBrowser()
		{
			//driver.quit();
		}
		

	}
