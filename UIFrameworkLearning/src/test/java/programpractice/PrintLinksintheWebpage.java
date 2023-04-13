package programpractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintLinksintheWebpage {
	
	@Test
	public void case1() {
		
		/*
		 * Author: Ramapriya
		 * Printing all the links in the Google search results page for the keyword "Selenium Learning"
		 */
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium Learning \n");
		
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links: "+allLinks.size());
		
		for (WebElement eachLink:allLinks)
		{
			System.out.println(eachLink.getAttribute("href"));
		}
		
		
		
		
		
	}

}