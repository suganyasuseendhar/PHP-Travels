package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	@Test
	public void dragHandling() {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get(
			"https://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	
	WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(source, dest).build().perform();
	}

	
	
@Test
public void  MouseOver() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://rightstartmath.com/");	
		driver.manage().window().maximize();
		
   WebElement mouse = driver.findElement(By.xpath("//span[contains(text(), 'Curriculum')]"));
  
   Actions act = new Actions(driver);
	act.moveToElement(mouse).build().perform();	
	
	Thread.sleep(3000);
	
	 WebElement res = driver.findElement(By.xpath("//span[contains(text(), 'Research')]"));
	 res.click();
}

@Test
public void  horizonalSlider() {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get(
			"https://jqueryui.com/slider/");	
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
	 Actions act = new Actions(driver);
	 act.dragAndDropBy(slider, 500, 0).build().perform();

}

@Test
public void  verticalSlider() {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get(
			"https://jqueryui.com/slider/#slider-vertical");	
	//driver.manage().window().maximize();
	driver.switchTo().frame(0);
	WebElement slider = driver.findElement(By.xpath("//div[@id='slider-vertical']/span"));
	 Actions act = new Actions(driver);
	// act.dragAndDropBy(slider, 0, 90).build().perform();
	 act.dragAndDropBy(slider, 300, 900).build().perform();

}


}
