package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SeleniumFirstProgram {
	@Test
	public void sele() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		/*
		 * WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		 * element.sendKeys("java /n");
		 */
		
		/*driver.findElement(By.name("q")).sendKeys("java \n");*/
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Hello \n");
		
		
		
		 element = driver.findElement(By.linkText("Images"));
		element.click();
		
	}


@Test	
public void selen() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/StudentRegistration.html");
		
		
		
		//WebElement element = driver.findElement(By.id("firstname"));
		//element.sendKeys("suganya");
		
		//element = driver.findElement(By.id("lastname"));
		//element.sendKeys("suseendhar");
		
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("java/n");
		
		//driver.findElement(By.linkText("Images")).click();
		
		
	}
	

@Test
public void saucedemo() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");


	WebElement element = driver.findElement(By.id("user-name"));
	element.sendKeys("standard_user");

	element = driver.findElement(By.id("password"));
	element.sendKeys("secret_sauce");
	
	
	element = driver.findElement(By.id("login-button"));
	element.click();
	
	element = driver.findElement(By.name("inventory_item_name"));
	element.click();
	
	//element = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	//element.click();
	
	element = driver.findElement(By.xpath("//button [contains(text(),'Add')]"));
	element.click();
}

}