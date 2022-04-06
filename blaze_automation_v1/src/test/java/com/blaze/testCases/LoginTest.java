package com.blaze.testCases;

import org.testng.annotations.Test;

import com.blaze.pageObjects.LogOutPage;
import com.blaze.pageObjects.LoginPage;

public class LoginTest extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException   {
		driver.get(baseUrl);
		
		LoginPage login = new LoginPage(driver);
		LogOutPage logout = new LogOutPage(driver);
		
		login.clickLogin();
		
		login.enterUsername("abethegreat");
		
		login.enterPassword("abe123");
		
		login.clickLoginModal();
		
		logout.verifyUserLogin();
		
		logout.clickLogOut();
		
	}

}
