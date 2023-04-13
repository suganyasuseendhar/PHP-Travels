package seleniumlearning;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	
	@Test
	
	public void dpHandling() {
		
		String monthYear = "April 2025";
		String day = "23";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/");
		WebElement checkInDate = driver.findElement(By.name("checkin"));
		checkInDate.click();
		//(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']
		String currentMonth = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']")).getText();
		System.out.println("the current month is : " + currentMonth);
		
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
	@Test
	public void dpHandlingwithDay() {

		String monthYear = "May 2024";
		String day = "21";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net");
		WebElement checkInDate = driver.findElement(By.name("checkin"));
		checkInDate.click();
		String currentMonth = driver
				.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']"))
				.getText();
		System.out.println("the current month is : = " + currentMonth);

		WebElement next = driver
				.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='next']"));

		while (true) {

			System.out.println(monthYear);
			System.out.println(currentMonth);
			System.out.println(day);
			if (monthYear.equals(currentMonth)) {
				break;
			} else
				next.click();
			currentMonth = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']")).getText();

		}
	String dayToClick = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//tr/td[contains(text(),"+day+")]")).getText();
		
		
		
}
	@Test
	public void dpCheckout() {

		String monthYear = "May 2024";
		String day = "21";
		String checkoutmonthYear = "June 2024";
		String checkoutday = "26";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net");
		
		/*
		 * //System.out.println(dayToClick); while (true) {
		 * 
		 * //System.out.println(monthYear); //System.out.println(currentMonth);
		 * //System.out.println(day); if (day.equals(currentMonth)) { break; } else
		 * next.click(); currentMonth = driver.findElement(By.xpath(
		 * "((//div[@class='datepicker-days']/table)[1]//tr/td[contains(text(),\"+day+\")]"
		 * )).getText();
		 * 
		 */
		/*
		 * WebElement checkOutDate = driver.findElement(By.name("Checkout"));
		 * checkOutDate.click();
		 */
		WebElement checkInDate = driver.findElement(By.name("checkin"));
		checkInDate.click();
		String currentMonth = driver
				.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']"))
				.getText();
		System.out.println("the current month is : = " + currentMonth);

		WebElement next = driver
				.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='next']"));

		while (true) {

			System.out.println(monthYear);
			System.out.println(currentMonth);
			System.out.println(day);
			if (monthYear.equals(currentMonth)) {
				break;
			} else
				next.click();
			currentMonth = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']")).getText();

		}
		
		//String	currentMonthCheckout = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//tr/td[contains(text(),"+day+")]")).getText();
		//System.out.println(currentMonthCheckout);
		/*System.out.println(" The checkout month is = " + currentMonthCheckout);
		
		WebElement next = driver
				.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='next']"));
		while (true) {

			System.out.println(checkoutmonthYear);
			System.out.println(checkoutday);
			
			if (checkoutmonthYear.equals(currentMonthCheckout)) {
				break;
			} else
				next.click();
			currentMonthCheckout = driver.findElement(By.xpath("((//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']")).getText();

		}
		*WebElement dayToClick = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//tr/td[contains(text(),"+day+")]"));
		dayToClick.click();
		System.out.println("current day is = " + day);
		*/
}
	@Test
	public void dpHandlingWithCheckOutDate() {

		String monthYear = "May 2023";
		String day = "24";
		String checkOutMonth = "Jone 2024";
		String CheckOutDay= "26";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net");
		WebElement checkInDate = driver.findElement(By.name("checkin"));
		checkInDate.click();
		String currentMonth = driver
				.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']"))
				.getText();
		System.out.println("the current month is: " + currentMonth);

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
		
		String checkOutMonth1 = driver
				.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']"))
				.getText();
		System.out.println(currentMonth);
		WebElement next1 = driver
				.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='next']"));
		while (true) {

			System.out.println(currentMonth);
			System.out.println(monthYear);
			if (checkOutMonth.equals(currentMonth)) {
				break;
			} else
				next1.click();
			checkOutMonth = driver.findElement(By.xpath("((//div[@class='datepicker-days']/table)[1]//thead//tr//th[@class='switch']")).getText();

		}
		
		WebElement checkOutDayToClick = driver.findElement(By.xpath("(//div[@class='datepicker-days']/table)[1]//tr/td[contains(text(),"+day+")]"));
		dayToClick.click();
	}
	
	
	@Test
	public void travells() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net");
		WebElement dragable = driver.findElement(By.xpath(null))
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}