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

public class ExampleProgram {

	WebDriver driver = null;

	@BeforeMethod(alwaysRun = true)
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void guviSite() {

		try {
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement element = driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary text-white px-4']"));
			js.executeScript("arguments[0].Click();", element);

//Scroll into view of web element
			WebElement exploreCodeTaka = driver
					.findElement(By.xpath("//a[@class='btn btn-success btn-lg explore-codekata']"));
			js.executeScript("arguments[0].scrollIntoView(true);", exploreCodeTaka);

//System.out.println((JavascriptExecutor) js).executeScript("return document.title").toString();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		// driver.quit();
	}

}
