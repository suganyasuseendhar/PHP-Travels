package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {
	@Test
public void nestedframe() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		
		//Switching to the Parent frame
		WebElement parentFrame= driver.findElement(By.id("frame1"));
		driver.switchTo().frame(parentFrame);
		
		WebElement parentFrameText= driver.findElement(By.tagName("body"));
	    System.out.println("Parent Frame Text: "+parentFrameText.getText());
	    
	    int countofChildFrames= driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Count of Child frames: "+countofChildFrames);
	    
	    //Switching to Child Frame
	    driver.switchTo().frame(0);
	    
	    WebElement childFrameText= driver.findElement(By.tagName("body"));
	    System.out.println("Child Frame Text: "+childFrameText.getText());
	    
	    //Switching the control to Parent Frame
	    
	    driver.switchTo().parentFrame();
	    
	    WebElement parentFrameText1= driver.findElement(By.tagName("body"));
	    System.out.println("Parent Frame Text: "+parentFrameText1.getText());
	    
	    driver.switchTo().defaultContent();
	    WebElement pageText= driver.findElement(By.xpath("//div[@id='framesWrapper']//div[1]"));
	    System.out.println(pageText.getText());
	    
		
		
	}
	
}
