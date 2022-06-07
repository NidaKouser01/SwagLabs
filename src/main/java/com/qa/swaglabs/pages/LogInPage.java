package com.qa.swaglabs.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.swaglabs.base.TestBase;

public class LogInPage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement Username;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement Login;

	public  LogInPage() {
		   PageFactory.initElements(driver, this);
	   }
	   public void assertLogInPageTitle() {
		  // assertEquals(driver.getTitle(), "OrangeHRM");
		   
		   driver.navigate().to("https://www.saucedemo.com");
		   
		   assertEquals(driver.getTitle(), "Swag Labs");
		   
		   
	   }
	   
	   public HomePage clickOnUserAndPassword() {
		   
		   Username.sendKeys("standard_user");
		   Password.sendKeys("secret_sauce");
		   Login.click();
		   return new HomePage();
		   
	   }
}
