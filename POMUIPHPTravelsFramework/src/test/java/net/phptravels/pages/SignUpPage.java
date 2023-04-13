package net.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {
	
	
	
	
	@FindBy (name="first_name")
	WebElement firstNmae;
	
	@FindBy(name = "last_name")
	WebElement lastname;
	
	@FindBy(name = "phoneNumber")
	WebElement phoneNumber;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(id = "select2-account_type-container")
	WebElement accountType;
	
	@FindBy(id = "recaptcha-anchor-label")
	WebElement recaptcha;
	
	
	@FindBy(id = "signUpButton")
	WebElement signUpButton;
	
	
	
	
}
