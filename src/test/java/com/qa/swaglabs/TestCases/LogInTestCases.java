package com.qa.swaglabs.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.swaglabs.base.TestBase;
import com.qa.swaglabs.pages.LogInPage;
import com.qa.swaglabs.util.TestUtil;

public class LogInTestCases extends TestBase {

	LogInPage Lp;
	
	public LogInTestCases() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		Lp = new LogInPage();
		
		
	}
	
	@AfterMethod
	public void cleanUp() {
		TestUtil.takeScreenshotAtEndOfTest("LogInPage");
		// close driver
		driver.close();
		driver.quit();
	}
	
	@Test
	
	public void LogInTest() {
		Lp.clickOnUserAndPassword();
	}
}
