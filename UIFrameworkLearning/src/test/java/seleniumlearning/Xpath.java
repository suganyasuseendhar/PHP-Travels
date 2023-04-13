package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
@Test
	public void muthayammal() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/MuthayammalEnggCollege.html");
		
		
		
		WebElement element = driver.findElement(By.xpath("//input[@name = 'fname']"));
		element.sendKeys("suganya");
		
		element = driver.findElement(By.xpath("//input[@name = 'lname']"));
		element.sendKeys("suseendhar");
		
		element = driver.findElement(By.id("women"));
		element.click();
		
}
}