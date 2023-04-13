package seleniumlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	@Test
public void table() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get(
			"https://datatables.net/examples/basic_init/zero_configuration.html");
	
	driver.manage().window().maximize();
	
	WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
	List<WebElement> tableRows = table.findElements(By.tagName("tr"));
	System.out.println("No of Rows in the webtable : "+tableRows.size());
	
	//for(CollectionType individualele:collections)
	int i=0;
	
	for (WebElement eachRow:tableRows)
	{
		if(i==0)
		{
			List<WebElement> tableHeader =eachRow.findElements(By.tagName("th"));
			
			for(WebElement eachHeader:tableHeader)
			{
				System.out.print(eachHeader.getText()+"\t" + "\t");
			}
			System.out.println();
			i++;
			
		}
		
		if(i==1)
		{
			List<WebElement> tableData= eachRow.findElements(By.tagName("td"));
			
			for(WebElement eachTableData:tableData)
			{
				System.out.print(eachTableData.getText()+"\t"+"\t");
			}
			System.out.println();
		}
	}
	
}
	@Test
	public void tableName() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://datatables.net/examples/basic_init/zero_configuration.html");
		
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
		List<WebElement> tableRowsName = table.findElements(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
		System.out.println("No of Name in the webtable : "+tableRowsName.size());
		
		
		/*int i=0;
		
		for (WebElement eachRowName:tableRowsName){
			if(i==0)
			{
				List<WebElement> tableDataNmaeOnly= eachRowName.findElements(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
				
				for(WebElement eachTableData:tableDataNmaeOnly)
				{
					System.out.println(eachTableData.getText()+"\t"+"\t");
				}
				System.out.println();
				i++;
			}
			}*/
		
		
		int i=0;
		
		for (WebElement eachRowName:tableRowsName){
			if(i==0)
			{
				List<WebElement> tableDataNmaeOnly= eachRowName.findElements(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
				
				for(WebElement eachTableData:tableDataNmaeOnly)
				{
					System.out.println(eachTableData.getText()+"\t"+"\t");
				}
				System.out.println();
				i++;
			}
			}
}	
	
	
	@Test
	public void tableName1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://datatables.net/examples/basic_init/zero_configuration.html");
		
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@id='example']/tbody/tr/td[1]&td[1]"));
		List<WebElement> tableRowsName = table.findElements(By.xpath("//table[@id='example']/tbody/tr/td[1]&td[1]"));
		System.out.println("No of Name in the webtable : "+tableRowsName.size());
		
		
		/*WebElement tableAge = driver.findElement(By.xpath("//table[@id='example']/tbody/tr/td[4]"));
		List<WebElement> tableAgeOnly = table.findElements(By.xpath("//table[@id='example']/tbody/tr/td[4]"));
		System.out.println("No of tag in the webtable : "+tableAgeOnly.size());
		
		
		
		int i=0;
		
		for (WebElement eachRowName:tableRowsName){
			if(i==0)
			{
				List<WebElement> tableDataNmaeOnly= eachRowName.findElements(By.xpath("//table[@id='example']/tbody/tr/td[3]"));
				
				for(WebElement eachTableData:tableDataNmaeOnly)
				{
					System.out.println(eachTableData.getText()+"\t"+"\t");
				}
				System.out.println();
				i++;
			}
			}
}	*/
	
}
}