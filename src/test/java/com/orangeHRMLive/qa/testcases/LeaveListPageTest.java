package com.orangeHRMLive.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRMLive.qa.base.BasePage;
import com.orangeHRMLive.qa.pages.AssignLeavePage;
import com.orangeHRMLive.qa.pages.DashboardPage;
import com.orangeHRMLive.qa.pages.LeaveListPage;
import com.orangeHRMLive.qa.pages.LoginPage;
import com.orangeHRMLive.qa.utils.TakeScreenShot;
import com.orangeHRMLive.qa.utils.TestUtil;

public class LeaveListPageTest extends BasePage {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AssignLeavePage assignLeavePage;
	LeaveListPage leaveListPage;
	TakeScreenShot takeScreenShot;
	TestUtil testUtil;
	
	public LeaveListPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization(); 		
		loginPage = new LoginPage();
		assignLeavePage = new AssignLeavePage();
		leaveListPage = new LeaveListPage();
		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//dashboardPage.clickOnAssignLeaveLink();
		leaveListPage = dashboardPage.clickOnLeaveListLink();
	}
//	@Test(priority = 1)
//	
//	public void veryfyAssignmentLeaveLebel() {
//		dashboardPage.clickOnAssignLeaveLink();
//		Assert.assertTrue(assignLeavePage.veriFyAssignLeaveLebel(),"Page is not opening");
//		//assignLeavePage.veriFyAssignLeaveLebel();		
//	}
	
	
	@Test
	
	public void veryfyLeaveListLebel() {
		takeScreenShot.takesScreenShot(driver, testUtil.leaveList);
		Assert.assertTrue(leaveListPage.veriFyLiveListLebel(),"Page is not opening");
		//assignLeavePage.veriFyAssignLeaveLebel();
		
		
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
