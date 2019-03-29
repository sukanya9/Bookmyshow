package com.sspart.pages;

import org.openqa.selenium.By;

import com.sspart.utils.DriverUtils;

public class ProductPage extends DriverUtils{
	public void switchToProductPage(String productName) {
		for(String windowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
			if(driver.getTitle().contains(productName)) {
				return;
			}
			//System.out.println("hi");
		}
	}
	public void printPrice() {
		System.out.println(driver.findElement(By.id("amazon.dealprice")).getText());
	}
	public void switchBack() {
		for(String windowHandle : driver.getWindowHandles()) {
		driver.switchTo().window(windowHandle);
	}
	}
}