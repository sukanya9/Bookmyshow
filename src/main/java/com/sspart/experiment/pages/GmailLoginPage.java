package com.sspart.experiment.pages;

import org.openqa.selenium.By;

import com.sspart.experiment.utils.DriverUtils;

public class GmailLoginPage extends DriverUtils{
	public void login() {
		initiateDriver();
		driver.get(props.getProperty("gmail.url"));
		}
	
	public void userName() throws InterruptedException {
		driver.findElement(By.id("identifierId")).sendKeys("*****@gmail.com");
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
		Thread.sleep(2000);
	//	String currentWindowHandle= driver.getWindowHandle();
		driver.findElement(By.name("password")).sendKeys("*****");
		//driver.findElement(
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
		//driver.findElement(By.className("//*[@class=\"RveJvd snByac\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
		driver.switchTo().frame(1);
		}

//	public void navigateToNext() throws InterruptedException {
//		driver.findElement(By.linkText("//*[text()='Next']")).click();
//			
//	}
}
