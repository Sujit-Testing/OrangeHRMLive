package com.orangeHRMLive.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRMLive.qa.base.BasePage;

public class LeaveListPage extends BasePage {
	@FindBy(xpath ="//a[contains(text(),'Leave List')]")
	WebElement liveListLebel ;
	
	public LeaveListPage() {		
		PageFactory.initElements(driver, this);		
	}
	
	public boolean veriFyLiveListLebel() {
		return liveListLebel.isDisplayed();
	}

}
