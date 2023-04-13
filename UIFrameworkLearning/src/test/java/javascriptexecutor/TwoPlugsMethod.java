package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.errorprone.annotations.CheckReturnValue;

public class TwoPlugsMethod {

	
	private static String heading;


	public static void flash(WebElement element, WebDriver driver) {
		
	String bgcolour =	element.getCssValue("backgroundcolour");
	
	for(int i=0; i<500; i++) {
		
		changeColour("#000000", element, driver);
		
		changeColour("bgcolour", element, driver);
		
		
	}
		
		
	}
	
	public static void changeColour(String colour, WebElement element, WebDriver driver) 
	{
	//https://www.c-sharpcorner.com/article/how-to-highlight-webelements-using-javascriptexecutor-in-selenium-webdriver/	
	try {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor = '" + colour + "'", element);
	  //js.executeScript("arguments[0].style.backgroundColour ='yellow'", element); 
	} catch (Exception e) {
		
		e.printStackTrace();
	}
		
	} 
	
	public static void drawBorder (WebElement element, WebDriver driver) {
		
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript ( "arguments[0].style.border = '3px solid red'", element);)
      js.executeScript("arguments[0].style.border = '3px solid red'", element);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
       
	}

	
	public static String getTitleByJs (WebDriver driver) {
		
		try {
			JavascriptExecutor js =((JavascriptExecutor) driver);
			String heading = js.executeScript("return document.title;").toString();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
	return heading;
		
		}
	
	public static void clickByElement(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js =((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();" , element);
		
	}
	
	public static void refreshBrowser(WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
		
	}
	
	public static void generateAlert(String message, WebDriver driver) {
		
		
	JavascriptExecutor js = ((JavascriptExecutor) driver);
		
	   js.executeScript("alert('" + message +"')");
	   
	   
			
		
		}
	
	public static void scrollIntoParticular(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		}
	
	public static void pageDown(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		
	}
	
		}


