package com.sspart.experiment.utils;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AndroidUtils extends ResourceUtil {
		
		public static WebDriver driver =null;
		public static AndroidDriver<WebElement> mobileDriver = null;
		
		public void initiateMobileDriver() throws MalformedURLException {
		if(mobileDriver==null) {
			
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability("deviceName","Lenovo");
			desiredCapabilities.setCapability("platformName", "Android");
			desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
			desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
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
}

		

