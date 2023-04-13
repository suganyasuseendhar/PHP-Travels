package javascriptexecutor;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwoPlugsPage {

	@Test
	public void jsContentPage() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://twoplugs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement joinFreeButton	= driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));	
		
		TwoPlugsMethod.flash(joinFreeButton, driver);
		
		
		TwoPlugsMethod.drawBorder(joinFreeButton, driver);
		
		File source =((TakesScreenshot ) driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\guvi automation testing\\screenshots\\twoplugs.png");
		
		FileUtils.copyFile(source, dest);
		
		String title = TwoPlugsMethod.getTitleByJs(driver);
		System.out.println(title);
		
		//TwoPlugsMethod.clickByElement(joinFreeButton, driver);
		
		//TwoPlugsMethod.refreshBrowser(driver);
		
		//TwoPlugsMethod.generateAlert("you clicked me join free", driver);
		
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
		TwoPlugsMethod.scrollIntoParticular(element, driver);
		
		TwoPlugsMethod.pageDown(element, driver);
		
	}
	
	
	
	
	
}
