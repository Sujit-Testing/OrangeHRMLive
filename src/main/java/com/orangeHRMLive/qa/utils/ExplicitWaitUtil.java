package com.orangeHRMLive.qa.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitUtil {
	
	public static void clickOn(WebDriver driver, WebElement locator, int timeOut) {
		 new WebDriverWait(driver, timeOut).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	
	public static void sendKeys(WebDriver driver, WebElement locator, int timeOut, String value) {
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(locator));
		locator.sendKeys(value);
		
	}

}
