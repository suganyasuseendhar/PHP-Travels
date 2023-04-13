package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadingTryProgram {
	WebDriver driver = null;

	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void fileUpload() {
		try {
			driver.get("http://the-internet.herokuapp.com/upload");
			driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Admin\\Downloads.jpg");
			driver.findElement(By.id("file-submit")).click();
			
			if(driver.getPageSource().contains("File Uploaded)")) {
				
				System.out.println("file upload successfully");
				
				
				
			}
			else {
				
				System.out.println("file not upload ");
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}