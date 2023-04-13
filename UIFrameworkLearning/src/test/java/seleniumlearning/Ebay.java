package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Ebay {

	@Test
	public void ebayXpath() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		WebElement element = driver.findElement(By.xpath("//input[@name=\"_nkw\"]"));
		element.sendKeys("cloths");
		
		element = driver.findElement(By.xpath("//input[@id=\"gh-btn\"]"));
		element.click();
		
		
		element = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select dd = new Select(element);
		//dd.selectByIndex(2);
		dd.selectByVisibleText(" Books");
		
	}//input[@id="gh-btn"]
	
	
	
	
	
	
}
