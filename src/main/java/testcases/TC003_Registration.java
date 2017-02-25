package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.WebStoreWrappers;

public class TC003_Registration extends WebStoreWrappers{

	@BeforeClass(groups="smoke")
	public void setValues() {
		browserName="chrome";
		testCaseName="TC003 - Registration";
		testDescription="Register WebStore(Positive)";
		category="smoke";
		dataSheetName="TC003";
	}
	
	
	@Test(dataProvider="fetchData",groups="smoke")
	public void loginOpentaps(  String fName, String lName,
								String email, String pass,
								String confirm, String msg) {
		
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 


		new LoginPage(driver,test)
		.clickRegister()
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterEmail(email+number+"@testleaf.com")
		.enterPassword(pass)
		.enterConfirmPassword(confirm)
		.clickRegister()
		.verifyMessage(msg);
		
	}
	

	
}










