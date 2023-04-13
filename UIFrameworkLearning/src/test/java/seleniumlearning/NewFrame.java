package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import bank.main;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewFrame {
	
	@Test
	public void newF() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		//stwitching to frame
		driver.switchTo().frame("frame1");
		
        WebElement sampleText= driver.findElement(By.id("sampleHeading"));
		System.out.println("Sample Page Text "+sampleText.getText());
		//stwitch to website
		driver.switchTo().defaultContent();
		 WebElement content= driver.findElement(By.xpath("//div[@id='framesWrapper']/div[1]"));
		 System.out.println("Sample Page content "+content.getText());
	}
}
