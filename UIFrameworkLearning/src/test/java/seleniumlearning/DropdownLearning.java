package seleniumlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownLearning {
	@Test
	public void dropDown() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/dropdown.html");

		WebElement element = driver.findElement(By.id("department_name"));
		Select dd = new Select(element);

		dd.selectByIndex(1);
		dd.selectByVisibleText("MECH");
		dd.selectByValue("ece");

		Thread.sleep(3000);

		List<WebElement> list = dd.getOptions();
		for (WebElement options : list) {
			System.out.println();
			//System.out.println(options.getText()+" " + options.isSelected());

		}

	}

	@Test
	public void dropDown1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/dropdown.html");

		WebElement element = driver.findElement(By.id("deg"));
		Select dd = new Select(element);

		dd.selectByIndex(1);
		dd.selectByVisibleText("PG");
		dd.selectByValue("msc");

		//Thread.sleep(3000);

		List<WebElement> list = dd.getOptions();
		
		for (WebElement options : list) {
			System.out.println(options.getText()+" " + options.isSelected());

		}

	}
	
	
	
	
}
