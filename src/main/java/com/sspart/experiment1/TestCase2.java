package com.sspart.experiment1;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sspart.experiment.utils.DriverUtils;

public class TestCase2 extends DriverUtils {
	@BeforeTest
	public void launchBrowser() {
		initiateDriver();
	}
	@Test
	public void gmail() throws InterruptedException {
		
		driver.findElement(By.id("identifierId")).sendKeys("******");
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("****");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
		//driver.findElement(By.className("//*[@class=\"RveJvd snByac\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Next\"]")).click();
	}

//	@AfterTest
//	public void switchWindow()
//	{
////		for(String windowHandle : driver.getWindowHandles()) {
////			driver.switchTo().window(windowHandle);
//			driver.getCurrentUrl();
//			driver.findElement(By.linkText("//*[text()='Compose']")).click();
//			driver.close();
//}
}
