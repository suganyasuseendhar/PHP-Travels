package seleniumlearning;

import java.util.Set;

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
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/loginpage.html");

		WebElement firstName = driver.findElement(By.name("uname"));

		firstName.sendKeys("suganya");

		WebElement repassword = driver.findElement(By.name("psw"));

		repassword.sendKeys("074573287");

		String pWindow = driver.getWindowHandle();
		WebElement resetPassword = driver.findElement(By.xpath("//a[text()='Reset Password']"));

		resetPassword.click();

		Set<String> newWindow = driver.getWindowHandles();

		for (String address : newWindow) {

			if (!pWindow.contentEquals(address)) {

				driver.switchTo().window(address);

			}

		}

		WebElement refirstName = driver.findElement(By.xpath("//input[@placeholder='Enter Username']"));

		refirstName.sendKeys("suganyasuseendhar");

		WebElement rePassword = driver.findElement(By.xpath("//input[@name='psw']"));
		rePassword.sendKeys("074573ouj");

		WebElement reSet = driver.findElement(By.xpath("//*[text()='Reset']"));

		reSet.click();

		int size = driver.getWindowHandles().size();
		System.out.println("the size of the total window is : " + size);
		driver.close();
		driver.switchTo().window(pWindow);
		driver.quit();

	}
}