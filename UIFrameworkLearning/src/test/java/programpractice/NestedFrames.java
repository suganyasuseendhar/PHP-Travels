package programpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {
@Test
	public void frames() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement element= driver.findElement(By.id("frame1"));
		driver.switchTo().frame("frame1");
		
		
		
		WebElement frame3= driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame("frame3");
		
		
		
		WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		if(! checkbox.isSelected()){
			checkbox.click();
		}
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//b[@id='topic']//following::input")).sendKeys("selenium");
		
		driver.switchTo().parentFrame();
	String parentFrame = driver.findElement(By.xpath("//label/span")).getText();
	System.out.println(parentFrame);
	
	
		WebElement frame2= driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame("frame2");
		
WebElement dropDown		= driver.findElement(By.xpath("//select[@id='animals']"));
		Select sel = new Select (dropDown);
		sel.selectByVisibleText("Avatar");
		
		
		
	}
	
@Test
public void frames1() {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
driver.manage().window().maximize();



driver.get("https://chercher.tech/practice/frames");
// store the text value
String textValue = driver.findElement(By.xpath("//label/span")).getText();
System.out.println(textValue);
// switch to frame1
driver.switchTo().frame("frame1");
// set the value of the textbar to the value stored
driver.findElement(By.xpath("//b[@id='topic']//following::input")).sendKeys("selenium");

WebElement frame3= driver.findElement(By.xpath("//iframe[@id='frame3']"));
driver.switchTo().frame("frame3");



WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));

if(! checkbox.isSelected()){
	checkbox.click();
}

driver.switchTo().parentFrame();
WebElement frame2= driver.findElement(By.xpath("//iframe[@id='frame2']"));
driver.switchTo().frame("frame2");

WebElement dropDown		= driver.findElement(By.xpath("//select[@id='animals']"));
Select sel = new Select (dropDown);
sel.selectByVisibleText("Avatar");
}


}