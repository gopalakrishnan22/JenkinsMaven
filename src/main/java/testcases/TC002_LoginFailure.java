package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

import wrappers.WebStoreWrappers;

public class TC002_LoginFailure extends WebStoreWrappers{
	
	@BeforeClass(groups="regression")
	public void setValues() {
		browserName="chrome";
		testCaseName="TC002 - Login Failure";
		testDescription="Login to WebStore(Negative)";
		category="Sanity";
		dataSheetName="TC002";
	}
	
	@Test(dataProvider="fetchData",groups="regression")
	public void loginOpentaps(String userName, String password,
								String error) {
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLoginForFailure()
		.verifyErrorMessage(error);
		
	}
	
}










