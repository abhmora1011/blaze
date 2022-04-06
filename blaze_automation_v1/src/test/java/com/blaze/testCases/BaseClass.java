package com.blaze.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseUrl = "https://demoblaze.com/index.html";
	public String username = "abethegreat";
	public String password = "abe123";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}

}
