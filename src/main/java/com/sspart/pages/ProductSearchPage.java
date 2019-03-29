package com.sspart.pages;

import org.openqa.selenium.By;

import com.sspart.utils.DriverUtils;

public class ProductSearchPage extends DriverUtils{
	public boolean verifyProductSearchResult(String productName) {
		try {
		return driver.findElement(By.xpath("//*[text()="+productName+"]")).isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public void selectProduct(String productName) {
		driver.findElement(By.xpath("//*[text()="+productName+"]")).click();
	}
}