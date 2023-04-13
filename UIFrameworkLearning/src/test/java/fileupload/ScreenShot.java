package fileupload;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ScreenShot {

WebDriver driver = null;
	
	@BeforeMethod
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	
	@Test
	public void takeScreenshot()
	{
		try {
			driver.get("https://www.google.com");
			
			//take screenshot and return as a file
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			//Destination path for the file to get stored
			File dest= new File("C:\\Users\\ramap\\OneDrive\\Desktop\\screenshots\\google.png");
			
			//copying the file from source to destination
			FileUtils.copyFile(source, dest);
			
			
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
	
	@Test
	public void MytakeScreenshot()
	{
		try {
			driver.get("https://www.guru99.com/");
			
			//take screenshot and return as a file
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			//Destination path for the file to get stored
			File dest= new File("D:\\guvi automation testing\\screenshots\\google1.png");
			
			//copying the file from source to destination
			FileUtils.copyFile(source, dest);
			
			
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
	
	
	@Test
	public void MytakeScreenshot1()
	{
		try {
			driver.get("https://www.guvi.com");
			
			File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("D:\\guvi automation testing\\screenshots\\google2.png");
			FileUtils.copyFile(Source, dest);
			
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

	
}
