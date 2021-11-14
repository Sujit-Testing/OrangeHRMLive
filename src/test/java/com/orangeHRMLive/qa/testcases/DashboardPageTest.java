package com.orangeHRMLive.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRMLive.qa.base.BasePage;
import com.orangeHRMLive.qa.pages.AssignLeavePage;
import com.orangeHRMLive.qa.pages.DashboardPage;
import com.orangeHRMLive.qa.pages.LoginPage;

public class DashboardPageTest extends BasePage{
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AssignLeavePage assignLeavePage;
	//LeaveListPage LeaveListPage;
	
	public DashboardPageTest() {
		super();
	} 
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization(); 		
		loginPage = new LoginPage();
		assignLeavePage = new AssignLeavePage();
		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority =1)
	public void verifyCorrectLandingHomePage() {
		Assert.assertTrue(dashboardPage.verifyCorrectDashboardLebel());
	}
	/*
	@Test
	public void verifyAssignLinkTest(){
		assignLeavePage = dashboardPage.clickOnAssignLeaveLink();
	}
	
	@Test 	
	public void verifyLeaveListTest() {
		dashboardPage.clickOnLeaveListLink();
		
	}
	*/
	
	@Test(priority =2)
	public void verifyNotAssignedToSubunits() {
		Assert.assertTrue(dashboardPage.verifyNotAssignedToSubunitsText());
	}
	@Test(priority =3)
	public void verifyAdministration() {
		Assert.assertTrue(dashboardPage.verifyAdministrationText());
	}
	
	
	@Test(priority =4)
	public void signOut() {
		loginPage = dashboardPage.clickonSignOutLink();
		
	}
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
