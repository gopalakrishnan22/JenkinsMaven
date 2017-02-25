package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import wrappers.WebStoreWrappers;

public class LoginPage extends WebStoreWrappers{

	public LoginPage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("TestLeaf - Login"))
			reportStep("This is not Login Page", "FAIL");

	}

	public LoginPage enterUserName(String data) {
		enterByName(prop.getProperty("Login.UserName.Name"), data);
		return this;

	}
	
	public LoginPage enterPassword(String data) {
		enterByName(prop.getProperty("Login.Password.Name"), data);
		return this;
	}
	
	public HomePage clickLogin() {
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return new HomePage(driver,test);		
	}

	public LoginPage clickLoginForFailure() {
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return this;
		
	}
	public LoginPage verifyErrorMessage(String data) {		
		verifyTextContainsByXpath(prop.getProperty("Login.Error.Xpath"), data);		
		return this;		
	}
	
	public RegisterPage clickRegister() {
		clickByLink(prop.getProperty("Login.Register.Link"));
		return new RegisterPage(driver,test);		
	}

	



}





