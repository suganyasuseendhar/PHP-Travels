package windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindowHandlings {

	@Test
	 public void countofOpenWindow() {
		 
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("D:\\learning workspace\\UIFrameworkLearning\\src\\test\\java\\windowhandling\\loginpage.html");
		 
		 WebElement firstName = driver.findElement(By.name("uname"));
		 
		 firstName.sendKeys("suganya");
		 
         WebElement password = driver.findElement(By.name("psw"));
		 
		 firstName.sendKeys("074573287");
		 
	     String pWindow = driver.getWindowHandle();
         WebElement rePassword = driver.findElement(By.xpath("//a[text()='Reset Password']"));
		 
         rePassword.click();
         
         
		 
	 }
}
