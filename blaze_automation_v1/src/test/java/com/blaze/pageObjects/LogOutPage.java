package com.blaze.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.blaze.testCases.BaseClass;


public class LogOutPage extends BaseClass {
	
	WebDriver ldriver;
	
	public LogOutPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="logout2")
	WebElement logOut;
	
	@FindBy(id="nameofuser")
	WebElement nameOfUser;
	
	public void clickLogOut() {
		WebDriverWait w = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout2")));
		logOut.click();
	}
	
	public void verifyUserLogin() {
		WebDriverWait w = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
		Assert.assertEquals("Welcome abethegreat", nameOfUser.getText());
	}
	
	
	
}
