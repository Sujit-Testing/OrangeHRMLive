package com.orangeHRMLive.qa.utils;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {

	public static void takesScreenShot(WebDriver driver, String screenShotName)  {
		//TakesScreenshot is a interface
		//Convert web driver object to TakeScreenshot using type casting "TakesScreenshot" . 
		TakesScreenshot scr = (TakesScreenshot)driver;
		File source=scr.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("./ScreenShot/"+screenShotName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


