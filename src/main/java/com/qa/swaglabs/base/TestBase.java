package com.qa.swaglabs.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;

	public TestBase () {
		
		prop = new Properties();
		
		try {
			FileInputStream ip;
			ip = new FileInputStream(System.getProperty("user.dir")+
					"\\src\\main\\java\\com\\qa\\swaglabs\\config\\config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	// initialization of browser
	public static void initialization ( ) {
		
		String browserName = prop.getProperty("browser");
		String browserPath = System.getProperty("user.dir") +"\\src\\main\\resources\\com\\qa\\swaglabs\\seleniumbrowserdriver\\";
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", browserPath + "chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", browserPath + "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", browserName + "geckodriver.exe");	
			driver = new FirefoxDriver(); 
		} else {
			System.out.println("Please define browser name (chrome/ie/firefox) into config.properties file.");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
		
		
	}


	}