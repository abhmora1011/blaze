package com.blaze.pageObjects;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.blaze.testCases.BaseClass;

public class LoginPage extends BaseClass{
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="login2")
	WebElement linkLogin;
	
	@FindBy(id="loginusername")
	WebElement txtUsername;
	
	@FindBy(id="loginpassword")
	WebElement txtPassword;
	
	@FindBy(xpath="//*[@id='logInModal']/div/div/div[3]/button[2]")
	WebElement btnLoginModal;
	
	
	public void clickLogin() {
		linkLogin.click();
	}
	
	public void enterUsername(String user) {
		WebDriverWait w = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		txtUsername.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		WebDriverWait w = new WebDriverWait(ldriver, Duration.ofSeconds(3));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword")));
		txtPassword.sendKeys(pass);
	}
	
	public void clickLoginModal() {
		btnLoginModal.click();
	}
	
}
