package seleniumlearning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class PhpTravelsDatePicker {
	@Test
	public void dpHandling() {
		
		String monthYear = "May 2025";
		String day = "23";
		
		WebDriver driver;
		
		WebElement checkInDate = driver.findElement(By.name("checkin"));
		checkInDate.click();
		String currentMonth = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']")).getText();
		System.out.println(currentMonth);
		
		WebElement next = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='next']"));
		
		while(true) {
			
			System.out.println(monthYear);
			System.out.println(currentMonth);
			if(monthYear.equals(currentMonth)) {
				break;
			}
			else
				next.click();
			 currentMonth = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']")).getText();
			
		}
		
	}
	
@BeforeMethod
public void start()
{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://phptravels.net");

}
@Test	
	public void dpHandlingForDate() {

		String monthYear = "May 2029";
		String day = "21";
		
		WebElement checkInDate =driver.findElement(By.name("checkin"));
		checkInDate.click();
		String currentMonth = driver
				.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']"))
				.getText();
		System.out.println(currentMonth);

		WebElement next = driver
				.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='next']"));

		while (true) {

			System.out.println(monthYear);
			System.out.println(currentMonth);
			if (monthYear.equals(currentMonth)) {
				break;
			} else
				next.click();
			currentMonth = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']")).getText();

		}
		WebElement dayToClick = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//tr/td[contains(text(),"+day+")]"));
		dayToClick.click();

	}

@AfterMethod(){
	public void close();
	driver.close();
	
	
	
}
}

