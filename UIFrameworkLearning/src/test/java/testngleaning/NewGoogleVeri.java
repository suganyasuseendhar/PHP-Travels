package testngleaning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewGoogleVeri {

	WebDriver driver;

	@BeforeMethod
	public void start() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/?gfe_rd=cr&ei=G_bFVrzmIeOK8QeRrr2wDg&gws_rd=cr&fg=1");

	}

	@Test
	public void testCase1() {

		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("selenium\n");

	}

	@Test
	public void testCase2() {

		// WebElement element = driver.findElement(By.linkText("Images")).click();
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("java\n");
	}

	@Test
	public void testCase3() {

		// WebElement element = driver.findElement(By.linkText("News")).click();
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Html\n");
	}

	@AfterMethod
	public void close() {

		driver.quit();

	}
}
