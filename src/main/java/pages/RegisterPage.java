package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import wrappers.WebStoreWrappers;

public class RegisterPage extends WebStoreWrappers{

	public RegisterPage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("TestLeaf - Registration"))
			reportStep("This is not Registration Page", "FAIL");

	}

	public RegisterPage enterFirstName(String data) {
		enterByName(prop.getProperty("Registration.FirstName.Name"), data);
		return this;

	}
	
	public RegisterPage enterLastName(String data) {
		enterByName(prop.getProperty("Registration.LastName.Name"), data);
		return this;
	}
	
	public RegisterPage enterEmail(String data) {
		enterByName(prop.getProperty("Registration.Email.Name"), data);
		return this;
	}
	
	public RegisterPage enterPassword(String data) {
		enterByName(prop.getProperty("Registration.Password.Name"), data);
		return this;
	}
	
	public RegisterPage enterConfirmPassword(String data) {
		enterByName(prop.getProperty("Registration.ConfirmPassword.Name"), data);
		return this;
	}
	
	public RegisterPage clickRegister() {
		clickByXpath(prop.getProperty("Registration.Submit.Xpath"));
		return this;		
	}

	public RegisterPage verifyMessage(String data) {		
		verifyTextContainsByXpath(prop.getProperty("Registration.Message.Xpath"), data);		
		return this;		
	}
	
	



}





