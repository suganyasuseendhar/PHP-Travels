package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form {

	@Test
	public void selen() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/StudentRegistration.html");

		WebElement element = driver.findElement(By.id("firstname"));
		element.sendKeys("suganya");

		element = driver.findElement(By.id("lastname"));
		element.sendKeys("suseendhar");

	}
}
