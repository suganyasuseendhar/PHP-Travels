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

public class JavascriptExecutorRedo {
	WebDriver driver = null;

	@BeforeMethod(alwaysRun = true)
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	@Test
	public void jsExecutor() {
		
		
			try {
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				
				//add a value to a text box
				WebElement googleSearch= driver.findElement(By.name("q"));
				js.executeScript("arguments[0].value='javascriptexecutor';", googleSearch);
				
				//reload a page
				js.executeScript("location.reload()");
				
				//get title
				System.out.println(js.executeScript("return document.title").toString());
				
				//click
				WebElement gmail= driver.findElement(By.linkText("Gmail"));
				js.executeScript("arguments[0].click();",gmail);
				
				//scroll down (vertical scroll)
				js.executeScript("window.scrollBy(0,800)");
				
				Thread.sleep(3000);
				
				//scroll up
				//js.executeScript("window.scrollBy(0,-500)");
				
				WebElement forWork=driver.findElement(By.linkText("For work"));
				
				//scroll into view
				js.executeScript("arguments[0].scrollIntoView(true);", forWork);
				js.executeScript("arguments[0].click();",forWork);
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		// driver.quit();
	}
}
