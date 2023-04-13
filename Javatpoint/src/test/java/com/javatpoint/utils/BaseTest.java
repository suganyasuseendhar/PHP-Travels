package com.javatpoint.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver =  null;
	
	public void launchBrowser(String url) {
		
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(url);
			
			
			
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Problem while launching the browser");
		}
		
		
	}
}
