package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	@Test
	public void iframehandling(){
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://netbanking.hdfcbank.com/netbanking/");

		
		driver.manage().window().maximize();

driver.switchTo().frame("login_page");
WebElement element = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
element.sendKeys("3456789User");


}
	}
