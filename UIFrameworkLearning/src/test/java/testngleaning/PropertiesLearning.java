package testngleaning;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesLearning {
	/*
	@Test
public void propertiesLearning() throws IOException {
		
		System.out.println(System.getProperty("user.dir"));
		FileInputStream fp= new FileInputStream(System.getProperty("user.dir")+"//configration.properties");
		
		Properties prop = new Properties();
		prop.load(fp);
		
		String browser;
		if(browser.contentEquals("chrome")) {
			WebDriverManager.chromedriver().setup();
		}
		else if(browser.contentEquals("firefox")) {
			// fire
		}
		
	}

*/




	
		@Test
		public void propertiesLearning1() throws IOException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			
			System.out.println(System.getProperty("user.dir"));
			FileInputStream fp= new FileInputStream(System.getProperty("user.dir")+"//config.properties");
			
			
			
			
			Properties prop = new Properties();
			prop.load(fp);
			
			System.out.println(prop.get("browser"));
			System.out.println(prop.get("url"));
			System.out.println(prop.get("keyword"));
			
			String browser = (String) prop.get("browser");
			
			
			if(browser.contentEquals("chrome")) {
				//WebDriverManager.chromedriver().setup();
				driver.get("https://www.google.com/");
				
				String keyword = (String) prop.get("keyword");
				WebElement element = driver.findElement(By.name("q"));
				element.sendKeys("keyword \n");
				/*driver.findElement(By.name("q")).sendKeys("java \n");*/
				
			}
			else if(browser.contentEquals("firefox")) {
				System.out.println("dirver not support");// fire
			}
			
		}
		
	
	}
	

	
		
	
	
