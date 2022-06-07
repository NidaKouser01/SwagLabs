package com.qa.swaglabs.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.swaglabs.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement Username;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement Login;
	
	@FindBy (id="shopping_cart_container")
	WebElement Addtocart;
	
	public  HomePage() {
		   PageFactory.initElements(driver, this);
	   }
	
	public static void assertHomePage() {
		
		driver.navigate().to("https://www.saucedemo.com");
		   
		   assertEquals(driver.getTitle(), "Swag Labs");
		   
	}
	 public void clickOnAddToCart() {
		 
		 Username.sendKeys("standard_user");
		   Password.sendKeys("secret_sauce");
		   Login.click();
		   Addtocart.click();
	 }
	
	
	
}
