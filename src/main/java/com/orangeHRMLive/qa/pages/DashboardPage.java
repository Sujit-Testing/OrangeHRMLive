package com.orangeHRMLive.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRMLive.qa.base.BasePage;

public class DashboardPage extends BasePage {
	
	@FindBy(xpath ="//h1[contains(text(),'Dashboard')]")
	WebElement dashboardLebel ; 
	
	//Quick Launch options webelements -- pagefactory pattern
	@FindBy(xpath = "//span[contains(text(),'Assign Leave')]")
	WebElement assignLeaveLink;
	@FindBy(xpath = "//span[contains(text(),'Leave List')]")
	WebElement leaveListLink;
	@FindBy(xpath = "//span[contains(text(),'Timesheets')]")
	WebElement timeSheetLink;

	//Legend options webelements -- pagefactory pattern
	@FindBy(xpath = "//td[contains(text(),'Not assigned to Subunits')]")
	WebElement NotAssignedToSubunitsText;
	@FindBy(xpath = "//td[contains(text(),'Administration')]")
	WebElement administrationText;
	
	//Sign-Out options webelements -- pagefactory pattern	
	@FindBy(xpath = "//*[@id='welcome']")
	WebElement signOutLink;
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement logOutLink;
	//Initializing the page objects	
		public DashboardPage() {		
			PageFactory.initElements(driver, this);		
		}
			
		public String verifyDashboardPageTitle() {			
			return driver.getTitle();
		}
		
		public boolean verifyCorrectDashboardLebel() {
			return dashboardLebel.isDisplayed();			
		}
		//Quick Launch options methods
		public AssignLeavePage clickOnAssignLeaveLink() {
			assignLeaveLink.click();
			return new AssignLeavePage();			
		} 
		public LeaveListPage clickOnLeaveListLink() {
			leaveListLink.click();
			return new LeaveListPage();			
		}
		public TimeSheets clickOnTimeSheetLink() {
			timeSheetLink.click();
			return new TimeSheets();			
		}
		public AssignLeavePage clickOnApplyLeaveLink() {
			assignLeaveLink.click();
			return new AssignLeavePage();			
		}
		
		public boolean verifyNotAssignedToSubunitsText() {
			return NotAssignedToSubunitsText.isDisplayed();
						
		}
		public boolean verifyAdministrationText() {
			return administrationText.isDisplayed();
						
		}
		
		public LoginPage clickonSignOutLink() {
			signOutLink.click();
			logOutLink.click();
			return new LoginPage();
			
		}
}
