package com.sspart.experiment.utils;

import java.net.MalformedURLException;
import com.sspart.experiment.*;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverUtils extends ResourceUtil{
	public static WebDriver driver =null;
	public static AndroidDriver<WebElement> mobileDriver = null;
	
	private static InheritableThreadLocal<WebDriver> localDriver = new InheritableThreadLocal<WebDriver>(){
		 
		@Override
		protected WebDriver initialValue() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
				
			driver.manage().window().maximize();
			return driver;
		}
	};
		
	public static WebDriver getDriver(){
		return DriverUtils.localDriver.get();
		}

	public void initiateMobileDriver() throws MalformedURLException {
	if(mobileDriver==null) {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("Lenovo", "pixel");
		desiredCapabilities.setCapability("PlatformName", "AndroidDevice");
		desiredCapabilities.setCapability("appPackage", "com.android.calculator");
		desiredCapabilities.setCapability("appActivity", "com.android.calculator");
		desiredCapabilities.setCapability("noReset", "true");
		mobileDriver= new AndroidDriver<WebElement>(new URL(" http://localhost:4723/wd/hub"),desiredCapabilities);
		try {
			initiateLocators();
		}catch(Exception e){
		e.printStackTrace();
		}
	}
	}
	
	public void quitMobileDriver() {
		mobileDriver.quit();
	
	}
	


	public void initiateDriver() {
		if(driver== null) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
		try {
			initiateLocators();
		}catch(Exception e){
		e.printStackTrace();
		}
	}
	}
	
//		WebDriver driver=null;
//		if(getConfig().getProperty(“driver.name”).toLowerCase().contains(“chrome”)){
//		System.setProperty(“Webdriver.chrome.driver”,.getConfig().getProperty(“chromedriver.loc”);
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		return null;
//		}else if (getConfig().getProperty(“driver.name”).toLowerCase().contains(“firefox”)){

		
		
	public void quitDriver() {
		driver.quit();
	}

}