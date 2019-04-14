package com.sspart.experiment.pages;

import org.openqa.selenium.By;

import com.sspart.experiment.utils.DriverUtils;

public class HomePage extends DriverUtils{
	public void navigateToHome() {
		initiateDriver();
		driver.get(props.getProperty("amazon.url"));
			}
	public void searchProduct(String query) {
		driver.findElement(By.id(props.getProperty("amazon.searchbox"))).sendKeys(query);
		driver.findElement(By.xpath(props.getProperty("amazon.searchbutton"))).click();
	}
}
