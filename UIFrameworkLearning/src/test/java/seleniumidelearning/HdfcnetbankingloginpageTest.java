
package seleniumidelearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class HdfcnetbankingloginpageTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @Test
  public void hdfcnetbankingloginpage() {
    driver.get("https://netbanking.hdfcbank.com/netbanking/");
    driver.manage().window().setSize(new Dimension(1298, 684));
    driver.switchTo().frame(0);
    driver.findElement(By.name("fldLoginUserId")).sendKeys("123545341531");
    driver.findElement(By.linkText("CONTINUE")).click();
    driver.switchTo().defaultContent();
    driver.findElement(By.id("keyboard")).sendKeys("1315157878");
    driver.findElement(By.id("loginBtn")).click();
    driver.close();
  }
}
