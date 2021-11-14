package com.orangeHRMLive.qa.testcases;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRMLive.qa.base.BasePage;
import com.orangeHRMLive.qa.pages.DashboardPage;
import com.orangeHRMLive.qa.pages.LoginPage;
//import com.qa.projectName.util.TakeScreenShot;


public class LoginPageTest extends BasePage {
	
	//WebDriver driver;
	//BasePage basePage;
	//Properties prop;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	
	// call base class constructor
	public LoginPageTest() {
		super(); 
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		
		loginPage = new LoginPage();
		
	}
	@Test()
	public void loginTestPage() throws InterruptedException {
		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
