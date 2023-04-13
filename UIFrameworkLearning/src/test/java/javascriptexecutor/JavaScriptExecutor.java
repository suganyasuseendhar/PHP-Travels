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

public class JavaScriptExecutor {
	WebDriver driver = null;

	@BeforeMethod(alwaysRun = true)
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void javascriptExecutor() {
		try {
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;

			//Passing text to a text field without using sendkeys()
			WebElement ele = driver.findElement(By.name("q"));
			js.executeScript("arguments[0].value='guvi';", ele);
			
			Thread.sleep(3000);
			
			// reload a page
			//js.executeScript("location.reload()");
			
			//click on gmail link
			WebElement gmail= driver.findElement(By.linkText("Gmail"));
			js.executeScript("arguments[0].click();", gmail);
			
			
			//Printing a title
			System.out.println(js.executeScript("return document.title").toString());
			
			//vertical scroll - scroll down
			js.executeScript("window.scrollBy(0,600)");
			
			Thread.sleep(3000);
			
			//scroll up
			js.executeScript("window.scrollBy(0,-500)");
			
			//hortizontal scroll
			js.executeScript("window.scrollBy(300,0)");
			
			//Scroll into view of web element
			WebElement helpCentre = driver.findElement(By.linkText("Help Center"));
			js.executeScript("arguments[0].scrollIntoView(true);", helpCentre);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		// driver.quit();
	}

	

	

	



	

}
