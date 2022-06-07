package com.qa.swaglabs.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.swaglabs.base.TestBase;
import com.qa.swaglabs.pages.HomePage;
import com.qa.swaglabs.pages.LogInPage;
import com.qa.swaglabs.util.TestUtil;

public class HomePageTestCases extends TestBase{

	HomePage Hp;
	
	LogInPage Lp;
	
	TestUtil testutil;
	
	public HomePageTestCases() {
		super();
	
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		Lp = new LogInPage();
		Hp= new HomePage();
		testutil= new TestUtil();
		
	}
	
	@AfterMethod
	public void cleanUp() {
		TestUtil.takeScreenshotAtEndOfTest("HomePage");
		// close driver
		driver.close();
		driver.quit();
	}
	
	@Test
	
	public void AddToCartTestCase1() {
		//Lp.clickOnUserAndPassword();
		Hp.clickOnAddToCart();
		
	}
	
	
}
