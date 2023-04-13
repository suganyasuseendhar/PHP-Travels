package seleniumlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PhpTravels {
	@Test
	public void travels() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/");
		
		
		 driver.findElement(By.xpath("//span[@id='select2-hotels_city-container']")).click();
		 
		 WebElement element = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	element.click() ; 
	
	element.sendKeys("chennai");
	
	element = driver.findElement(By.xpath("//li[@role='option']"));
	element.click() ;	
	Thread.sleep(3000);
				//driver.findElement(By.id("select2-hotels_city-container")).click();
		
		
	 //element = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		
		/*
		 * WebElement element =
		 * driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		 * element.click() ; element.sendKeys("chennai");
		 * 
		 * element1 = driver.findElement(By.xpath("//li@role=''option")); element.click()
		 * ;
		 * 
		 * 
		 * WebElement element =
		 * driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		 * element.click() ; element.sendKeys("chennai");
		 */

		/*
		 * WebElement element =
		 * driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		 * Select dd = new Select(element); dd.selectByIndex(1);
		 */

	}

	
	
	
		@Test
		public void travelsnew() throws Exception {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://phptravels.net/");
			
			
			 driver.findElement(By.xpath("//span[@id='select2-hotels_city-container']")).click();
			 
			 WebElement element = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		element.click() ; 
		
		element.sendKeys("chen");
		
		element = driver.findElement(By.xpath("//li[@role='option']"));
		Select dd = new Select(element);
		dd.selectByVisibleText("Chennai,India");
		element.click() ;	
		
		Thread.sleep(3000);
		
}
	
	
		 public void datePicker() {
 
	 WebDriverManager.chromedriver().setup(); WebDriver driver = new
		ChromeDriver(); driver.get("https://phptravels.net/"); WebElement date1 =
		  driver.findElement(By.
		  xpath("//input[@class='checkin form-control form-control-lg border-top-r0']")); date1.click();
		  
		  
		  WebElement date = driver.findElement(By.
				  xpath("//input[@class='checkout form-control form-control-lg border-top-l0']"
				  ));
		  date.sendKeys(Keys.TAB);
		  
			/*
			 * date1 dateWidgetFrom = wait.until(
			 * ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className(
			 * "ui-datepicker-calendar"))).get(0);
			 */
		  
		  WebElement date2 = driver.findElement(By.
		  xpath("//input[@class='checkout form-control form-control-lg border-top-l0']"
		  )); date2.click();
		  
		 date2.sendKeys("10022023"); }
		
		

		public void tabledata() {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");		
		
		
		
}
		@Test
		public void table() {
			
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");
	WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
	List<WebElement> eachRow = driver.findElements(By.tagName("tr"));
	System.out.println("total no of row is in the Table : " + eachRow.size());
			
		int i =0;
		
		for(WebElement element :eachRow ) {
			
			if(i==0) {
				
				List<WebElement> eachHeader = element.findElements(By.tagName("th"));
				
				for(WebElement header :eachHeader) {
					
					System.out.println(header.getText() + "\t" + "\t");
					
					}
				
				System.out.println();
				i++;
			}
			
			
			if(i==1) {
				
				List<WebElement> eachColoumn = element.findElements(By.tagName("td"));
				for (WebElement coloumn : eachColoumn) {
					
				System.out.println(coloumn.getText() + "\t" + "\t");	
					
					}
				
				System.out.println();
			}
			
			
		}
		}
}