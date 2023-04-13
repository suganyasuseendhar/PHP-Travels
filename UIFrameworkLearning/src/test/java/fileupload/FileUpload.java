package fileupload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FileUpload {
	WebDriver driver = null;

	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void fileUpload() {

		try {
			driver.get("https://the-internet.herokuapp.com/upload");

			driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\pc\\Downloads\\SikuliXSetupLog.txt");

			driver.findElement(By.id("file-submit")).click();

			if (driver.getPageSource().contains("File Uploaded")) {
				System.out.println("File Uploaded successfully");
			} else {
				System.out.println("Problem  in uploading File");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	
	

	
	
	
	
}
