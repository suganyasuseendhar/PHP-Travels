package net.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")
	WebElement login;
	
	
	public void enterEmail(String emailid) {
		
		email.sendKeys(emailid);
		
		
	}
	
	public void enterPassword(String newPassword) {
		password.sendKeys(newPassword);
		
	}
	
}
