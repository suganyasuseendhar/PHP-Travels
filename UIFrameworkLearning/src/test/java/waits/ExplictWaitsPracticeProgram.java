package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplictWaitsPracticeProgram {
	//doubt why here declare WebDriver driver = null;
	WebDriver driver = null;
	
	
	@BeforeMethod(alwaysRun = true)
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	
	@Test
	public void visibilityOfElement() throws InterruptedException {

		// guru 99 example for presence of element
		// driver.get("https://www.amazon.com/");
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 20);
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//input[@id='twotabsearchtextbox']")));
		 * driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).
		 * sendKeys("kids cloths \n"); // example for element clickable
		 */
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver, 20);
		 * wait1.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//a[@class='nav-link btn btn-primary text-white px-4']")));
		 * driver.findElement((By.
		 * xpath("//a[@class='nav-link btn btn-primary text-white px-4']"))).click();
		 * //example for element to be selected
		 */
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Resources ')]")));
		WebElement element = driver.findElement((By.xpath("//*[contains(text(),'Resources ')]")));
		element.click();
		
		driver.findElement(By.linkText("Referral")).click();
		Thread.sleep(3000);
		
		//*[contains(text(),'Resources ')]
		
}
	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		
		//driver.quit();
		
	}
	
	
	
}
