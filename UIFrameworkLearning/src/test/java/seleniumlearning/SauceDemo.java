package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemo {
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
		
		//element = driver.findElement(By.name("inventory_item_name"));
		//element.click();
		
		element = driver.findElement(By.id("item_1_title_link"));
		element.click();
		
		element = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
		element.click();
		
		
		element = driver.findElement(By.name("shopping_cart_badge"));
		element.click();
		
		element = driver.findElement(By.id("continue-shopping"));
		element.click();
		
		element = driver.findElement(By.id("checkout"));
		element.click();
		
		
		element = driver.findElement(By.id("first-name"));
		element.sendKeys("suganya");

		element = driver.findElement(By.id("last-name"));
		element.sendKeys("suseendhar");
		
		element = driver.findElement(By.id("postal-code"));
		element.sendKeys("635126");
		
		element = driver.findElement(By.id("continue"));
		element.click();
		
		element = driver.findElement(By.id("finish"));
		element.click();
		//element = driver.findElement(By.xpath("//button [contains(text(),'Add')]"));
		//element.click();
	}
}
