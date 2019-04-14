package com.sspart.experiment.pages;

import org.openqa.selenium.By;

import com.sspart.experiment.utils.DriverUtils;

public class GmailHome extends DriverUtils {
	public void switchToGmailHome(String Gmail) {
		for(String windowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
//			if(driver.getTitle().contains(Gmail)) {
//				return;
			}
		}
	
	public void Compose() {
		driver.findElement(By.linkText("//*[text()='Compose']")).click();
		
	}
}
