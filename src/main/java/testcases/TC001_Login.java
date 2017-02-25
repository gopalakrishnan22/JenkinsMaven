package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.WebStoreWrappers;

public class TC001_Login extends WebStoreWrappers{

	@BeforeClass(groups="smoke")
	public void setValues() {
		browserName="chrome";
		testCaseName="TC001 - Login";
		testDescription="Login and Logout from WebStore(Positive)";
		category="smoke";
		dataSheetName="TC001";
	}
	
	
	@Test(dataProvider="fetchData",groups="smoke")
	public void loginOpentaps(String userName, String password,
								String name) {

		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.verifyLoggedName(name)
		.clickProfileImage()
		.clickLogout();		
	}
	

	
}










