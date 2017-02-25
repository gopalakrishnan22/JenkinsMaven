package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import wrappers.WebStoreWrappers;

public class HomePage extends WebStoreWrappers{

	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("TestLeaf - User Profile"))
			reportStep("This is not Home Page of Web Store - Updated by Babu & Indhu", "FAIL");

	}

	public HomePage verifyLoggedName(String data) {
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), data);
		return this;
	}

	public HomePage clickProfileImage() {
		clickByXpath(prop.getProperty("Home.Image.Xpath"));
		return this;

	}

	public LoginPage clickLogout() {
		clickByXpath(prop.getProperty("Home.Logout.Xpath"));
		return new LoginPage(driver, test);

	}

}





