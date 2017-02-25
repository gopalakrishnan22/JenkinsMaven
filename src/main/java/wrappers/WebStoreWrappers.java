package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class WebStoreWrappers extends GenericWrappers {
	
	public String browserName;
	public String dataSheetName;
	

	@BeforeSuite(groups="common")
	public void beforeSuite(){
		startResult();
	}

	@BeforeTest(groups="common")
	public void beforeTest(){
		loadObjects();
	}
	
	@BeforeMethod(groups="common")
	public void beforeMethod(){
		test = startTestCase(testCaseName, testDescription);
		test.assignCategory(category);
		invokeApp(browserName);
	}
		
	@AfterSuite(groups="common")
	public void afterSuite(){
		endResult();
	}

	@AfterTest(groups="common")
	public void afterTest(){
		unloadObjects();
	}
	
	@AfterMethod(groups="common")
	public void afterMethod(){
		endTestcase();
		quitBrowser();
		
	}
	
	@DataProvider(name="fetchData")
	public Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName);		
	}	
	
	
}
