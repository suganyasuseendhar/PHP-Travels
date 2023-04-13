package seleniumlearning;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindowLearning {
	@Test
	public void switchWindowLearn() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"D:\\learning workspace\\UIFrameworkLearning\\src\\test\\java\\seleniumlearning\\html files\\loginpage.html");

		WebElement name = driver.findElement(By.name("uname"));
		name.sendKeys("Priya");

		WebElement pass = driver.findElement(By.name("psw"));
		pass.sendKeys("abc123");

		String pwindow = driver.getWindowHandle();
		WebElement elementClick = driver.findElement(By.linkText("Reset Password"));
		elementClick.click();

		Set<String> handles = driver.getWindowHandles();
		for (String adr : handles) {

			if (!(pwindow.contentEquals(adr))) {
				driver.switchTo().window(adr);
			}
			System.out.println(adr);
		}

		// getWindowHandle() > address of the current opened window
		// getWindowHandles() > set of all the opened window address

		System.out.println(driver.getWindowHandle());

		WebElement newUsername = driver.findElement(By.name("funame"));
		newUsername.sendKeys("Priya");
		WebElement pswd = driver.findElement(By.name("psw"));
		pswd.sendKeys("1233456");
		
		

		driver.close();
		driver.switchTo().window(pwindow);
		name = driver.findElement(By.name("uname"));
		pass.sendKeys("RamaPriya");

	}

	@Test

	public void windowsSwitchLearning() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"D:\\learning workspace\\UIFrameworkLearning\\src\\test\\java\\seleniumlearning\\html files\\loginpage.html");

		WebElement username = driver.findElement(By.name("uname"));
		username.sendKeys("suganya");

		WebElement element = driver.findElement(By.name("psw"));
		element.sendKeys("1234567");

		String ParentWindow = driver.getWindowHandle();
		element = driver.findElement(By.linkText("Reset Password"));
		element.click();

		System.out.println("the parent window is : "+ ParentWindow);

		Set<String> newhandles = driver.getWindowHandles();
		for (String address : newhandles) {

			if (!(ParentWindow.contentEquals(address))) {

				driver.switchTo().window(address);

			}

			System.out.println("The new addresss is : " + address);

		}

		System.out.println(driver.getWindowHandles());

		WebElement newUserName = driver.findElement(By.name("funame"));
		newUserName.sendKeys("suganya");

		WebElement newpassword = driver.findElement(By.name("psw"));
		newpassword.sendKeys("1234567");

		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(ParentWindow);

		username = driver.findElement(By.name("uname"));
		username.sendKeys("suganya suseendhar");

		element = driver.findElement(By.name("psw"));
		element.sendKeys("098765432");
	}
}