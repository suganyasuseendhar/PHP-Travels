package sikulilearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class SikuliGuviWebsite {

	WebDriver driver = null;
	
	@BeforeMethod
	
	
	public void launchbrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	
	
	@Test
	public void sikuliActions() {
		
		try {
			driver.get("https://www.guvi.in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			String sourcePath = "D:\\learning workspace\\UIFrameworkLearning\\sikuliimages\\";
			Screen screen = new Screen();
			
		    Pattern p1 = new Pattern(sourcePath + "login.png" );
			screen.click(p1);
			Thread.sleep(2000);
			//driver.get("https://www.guvi.in/sign-in");
			Pattern p2 = new Pattern(sourcePath + "email.png"  );
			//Pattern p2 = new Pattern(sourcePath + "email.png" );
			screen.find(p2);
			screen.click(p2);
			Thread.sleep(2000);
			screen.type(p2, "testingnew@gmail.com");
			
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}
	
	
	
	
	@AfterMethod
	
	public void closebrowser() {
		
		driver.close();
		
		
	}
	
	
	
}
