package seleniumlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class table {

	@Test
	public void tableHandling() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");

		WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
		List<WebElement> eachRow = table.findElements(By.tagName("tr"));
		System.out.println(eachRow.size());
		int i = 0;
		/*
		 * WebElement next = driver.findElement(By.xpath("//a[@id='example_next']"));
		 * while (next.isDisplayed()) { if (i != 1) { next.click(); }
		 */

			for (WebElement ele : eachRow) {

				if (i == 0) {
					List<WebElement> header = ele.findElements(By.tagName("th"));

					for (WebElement tabHeader : header) {
						System.out.print(tabHeader.getText() + "\t" + "\t");
					}
					System.out.println();
					i++;
				}
				if (i == 1) {

					List<WebElement> noOfCols = ele.findElements(By.tagName("td"));
					for (WebElement text : noOfCols) {
						System.out.print(text.getText() + "\t" + "\t");
					}
					System.out.println();
				}

			}
		}

	
	
	@Test
	public void tableDataReading() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");

		WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
		List<WebElement> eachRow = table.findElements(By.tagName("tr"));
	
		System.out.println(eachRow.size());
		int i = 0;
		
		for (WebElement ele : eachRow) {

			if (i == 0) {
				List<WebElement> header = ele.findElements(By.tagName("th"));

				for (WebElement tabHeader : header) {
					System.out.print(tabHeader.getText() + "\t" + "\t");
				}
				System.out.println();
				i++;
			}
			if (i == 1) {

				List<WebElement> noOfCols = ele.findElements(By.tagName("td"));
				for (WebElement text : noOfCols) {
					System.out.print(text.getText() + "\t" + "\t");
				}
				System.out.println();
			}

		}
	}
}

