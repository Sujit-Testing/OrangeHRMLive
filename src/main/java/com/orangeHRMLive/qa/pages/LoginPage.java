package com.orangeHRMLive.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRMLive.qa.base.BasePage;

public class LoginPage extends BasePage{
	
	//webelements and actions(methods) -- features
		//for webelements -- pagefactory pattern
	
	@FindBy(xpath ="//input[@id='txtUsername']")
	WebElement username ;  
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement logIn;
	
	//Initializing the page objects	
	public LoginPage() {	
		PageFactory.initElements(driver, this);		
	}
	
	public DashboardPage login(String userName, String pwd) throws InterruptedException {
		//Thread.sleep(5000);
		username.clear();
		password.clear();
		
		username.sendKeys(userName);		
		password.sendKeys(pwd);		
		logIn.click();	
		
		//return DashboardPage class object- landing page
		return new DashboardPage();
	}
	
	
	

}
