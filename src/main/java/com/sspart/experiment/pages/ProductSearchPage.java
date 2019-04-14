package com.sspart.experiment.pages;

import org.openqa.selenium.By;

import com.sspart.experiment.utils.DriverUtils;

public class ProductSearchPage extends DriverUtils{
	public boolean verifyProductSearchResult(String productName) {
		try {
		return driver.findElement(By.xpath("//*[text()='Apple iPhone X (64GB) - Silver']")).isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public void selectProduct(String productName) {
		driver.findElement(By.xpath("//*[text()='"+productName+"']")).click();
	}
}