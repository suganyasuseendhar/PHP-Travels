package seleniumlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AgodaDatePicker {

	@Test
	public void datePicker(){
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.agoda.com/?cid=1844104");
		
	driver.findElement(By.xpath("//div[@class='SearchBoxTextDescription__title']")).click();
	
	//List<WebElement> currentMonthandYear = driver.findElements(By.xpath("//div[@class='DayPicker-Caption' and @role='heading']"));
	//System.out.println(currentMonthandYear.size());


	String currentMonthandYear1 = driver.findElement(By.xpath("//div[@class='DayPicker-Caption' and @role='heading']")).getText();
	System.out.println(currentMonthandYear1);

	







}}
