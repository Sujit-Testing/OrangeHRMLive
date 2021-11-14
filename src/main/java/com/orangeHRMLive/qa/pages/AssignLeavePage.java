package com.orangeHRMLive.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRMLive.qa.base.BasePage;
import com.orangeHRMLive.qa.utils.ExplicitWaitUtil;

public class AssignLeavePage extends BasePage {
	
	
	@FindBy(xpath ="//a[contains(text(),'Assign Leave')]")
	WebElement assignLeaveLebel ;
	
	public AssignLeavePage() {		
		PageFactory.initElements(driver, this);		
	}
	
	public boolean veriFyAssignLeaveLebel() {
		
		return assignLeaveLebel.isDisplayed(); 
		
	}
	

}
