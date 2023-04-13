package seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditableCollegeForm {

@Test
public void form() throws Exception  {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get(
			"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/editablecollegeform.html");
	
	WebElement element = driver.findElement(By.xpath("//input[@id='firstname']"));
	element.sendKeys("suganya");

	element = driver.findElement(By.xpath("//input[@type='text' and @name='lname']"));
	element.sendKeys("suseendhar");
	
	element = driver.findElement(By.xpath("//input[@id='firstname']//following::input[2]"));
	element.sendKeys("hosur");
	
	element = driver.findElement(By.xpath("//input[@id='firstname']//following::input[3]"));
	element.sendKeys("46546234566");
	
	

	element = driver.findElement(By.xpath("//input[contains(@name,'girl')]//preceding::input[3]"));
	element.click();
	
	element = driver.findElement(By.xpath("//input[contains(@name,'girl')]"));
	element.click();

	element = driver.findElement(By.xpath("//*[contains(@id,department_name) and @name='department' ]"));
	Select dd = new Select(element);
	dd.selectByVisibleText("MECH");
	
    //parent element finding
	//textarea[@name='message']//..
	element = driver.findElement(By.xpath("//textarea[starts-with(@name,'message')]"));
	element.sendKeys("welcome to our college");

	element = driver.findElement(By.xpath("//input[@type='button' or @name='sub']"));
	element.click();
	Thread.sleep(3000);

	driver.switchTo().alert().accept();

	element = driver.findElement(By.xpath("//a[text()='Visit Us!']"));
	element.click();

	

}




@Test
public void form1() throws Exception {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get(
			"file:///D:/learning%20workspace/UIFrameworkLearning/src/test/java/seleniumlearning/html%20files/editablecollegeform.html");
	
	WebElement element = driver.findElement(By.xpath("//input[@type='text' and @name='lname']"));
	
	
	Assert.assertTrue(element.isDisplayed());
	Assert.assertTrue(element.isEnabled());

}
}