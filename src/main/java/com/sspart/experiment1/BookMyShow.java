package com.sspart.experiment1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sspart.experiment.utils.DriverUtils;

import org.apache.tools.ant.taskdefs.condition.IsFileSelected;
import org.openqa.selenium.Alert;

public class BookMyShow extends DriverUtils{
	@BeforeTest
	public void launchBrowser() {
		initiateDriver();
	}
	@Test
	public void openURL() throws InterruptedException {
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(8000);
		driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("Hyderabad");
		driver.findElement(By.linkText("Hyderabad")).click();
		driver.findElement(By.id("wzrk-cancel")).click();
		//driver.findElement(By.name("inputSearchBox")).sendKeys("Majili");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"popular_movies\"]/div/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@class=\"showtimes btn _cuatro\"]")).click();
		driver.findElement(By.xpath("//*[text()='TODAY']")).click();
		driver.findElement(By.xpath("//*[text()='AMB Cinemas: Gachibowli']")).click();
		driver.findElement(By.xpath("//*[@class=\"_available _filling\"]")).isSelected();
		driver.findElement(By.xpath("//*[@class=\"time_vrcenter data-enabled\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("btnPopupAccept")).click();
		driver.findElement(By.id("pop_4")).isEnabled();
		//driver.findElement(By.className("category")).click();
		driver.findElement(By.id("proceed-Qty")).click();
	
		driver.findElements(By.className("_available")).isEmpty();
		Thread.sleep(4000);
		driver.quit();
	}
	
}
