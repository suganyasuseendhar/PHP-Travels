package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnggCollegeForm {
	
@Test	
	
public void muthayammal() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/MuthayammalEnggCollege.html");
	
	
	
	WebElement element = driver.findElement(By.id("firstname"));
	element.sendKeys("suganya");
	
	element = driver.findElement(By.id("lastname"));
	element.sendKeys("suseendhar");
	
	element = driver.findElement(By.id("women"));
	//element.sendKeys("suseendhar");
	element.click();
	
	
	
	/*
	 * element = driver.findElement(By.id("003")); element.click();
	 */
	
	
	
	 element = driver.findElement(By.xpath("//select[@id='department_name']"));
	 Select dd = new Select(element); 
	 dd.selectByIndex(1);

	
	
		/*
		 * element = driver.findElement(By.xpath("button[text()=''EEE\"]")); Select dd =
		 * new Select(element); dd.selectByValue("ece");
		 */
	/*
	 * element = driver.findElement(By.id("department_name")); Select dd = new
	 * Select(element); dd.selectByIndex(2);
	 */
	
	
	element = driver.findElement(By.name("message"));
	element.sendKeys("welcome to our college");
	
	element = driver.findElement(By.name("submit"));
	element.click();
	
	//element = driver.findElement(By.partialLinkText("href"));
	//element.click();
	
	
	
}
}
