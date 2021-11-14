package com.orangeHRMLive.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.orangeHRMLive.qa.utils.TestUtil;

public class BasePage {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BasePage() {
		prop = new Properties();
		
		try {
			FileInputStream ip =  new FileInputStream(System.getProperty("user.dir")+
					"/src/main/java/com/orangeHRMLive/qa/config/config.properties");
			
				
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\SUJITSWAIN\\Desktop\\Personal\\Selenium\\Browsers\\chromedriver_win32\\chromedriver.exe");
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","./Browsers/chromedriver.exe");
			driver = new ChromeDriver();
		}
				
		//WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	

}
