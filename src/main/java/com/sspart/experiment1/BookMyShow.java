package com.sspart.experiment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sspart.experiment.utils.DriverUtils;

import static com.sspart.experiment.utils.DriverUtils.driver;
import static com.sspart.experiment.utils.DriverUtils.getDriver;

import java.util.List;

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
		Thread.sleep(2000);
		driver.findElement(By.id("wzrk-cancel")).click();
		//driver.findElement(By.name("inputSearchBox")).sendKeys("Majili");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='primary-nav']/div[@class='inner-nav left-nav']//a[text()='Movies']")).click();
		System.out.println("Selected movies");
		//how to enable checkbox
//		driver.findElement(By.xpath("//*[@id=\"ns-lang\"]/div[2]/ul/li[1]/span/input")).isSelected();
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"ns-lang\"]/div[2]/ul/li[1]/span/span/a")).isDisplayed());
		
		//driver.findElement(By.xpath("//*[@class=\"cards-list\"]/div/div[@class=\"mv-row\"]/div/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"popular_movies\"]/div/div/div[2]/a")).click();
		//driver.findElement(By.xpath("//ul/li[@class=\"list\"]//*[text()='AMB Cinemas: Gachibowli']")).getText();
		driver.findElement(By.xpath("//*[@class=\"showtimes btn _cuatro\"]")).click();
		driver.findElements(By.xpath("//ul[@id=\"venuelist\"]//li[@data-name=\"AMB Cinemas: Gachibowli\"]//a[@class=\"__showtime-link  time_vrcenter \"]\n" )).get(0).click();
		driver.findElement(By.xpath("//*[@class=\"showtimes btn _cuatro\"]")).click();
		
		//driver.findElement(By.xpath("//*[text()='TODAY']")).click();
//		driver.findElement(By.xpath("//*[text()='AMB Cinemas: Gachibowli']")).click();
//		driver.findElement(By.xpath("//*[@class=\"_available _filling\"]")).isSelected();
//		driver.findElement(By.xpath("//*[@class=\"time_vrcenter data-enabled\"]")).click();
		driver.findElements(By.xpath("(//*[@class=\"date-container \"]//ul[@id=\"showDates\"]//li)[2]"));
		Thread.sleep(4000);
		driver.findElement(By.id("btnPopupAccept")).click();
		driver.findElement(By.xpath("//*[@id=\"popQty\"]/li[4]")).click();
		driver.findElement(By.xpath("//*[@class=\"action-btn\"]")).click();
		driver.findElement(By.xpath("//*[@class=\"seats\"]//div[@id=\"layout\"]//td[@class=\"SRow1\"]//a[@class=\"_available\"]")).click();

		List<WebElement> elements = driver.findElements(By.xpath(“//*[@id="layout"]//td[@class="SRow1"]“));
		int selectedseat= 0;
		for(WebElement ele : elements){
			List<WebElement> seats=ele.findElements(By.xpath("//a[@class='_available']“));
			int expectedSeat=0;
			
		for(int i = 0; i < seats.size() && (seats.size()-i>=4); i++){
			if(Integer.parseInt(seats.get(i+3).getText().trim()) == Interger.parseInt(seats.get(i).trim())+3)){
				Seats.get(i).click();
				break;
		}
		
		for(int i = 0; i < seats.size() && (seats.size()-i>=4); i++){
			if(Integer.parseInt(seats.get(i+3).getText().trim()) == Interger.parseInt(seats.get(i).trim())+3)){
				Seats.get(i).click();
				break;
			}
		}
		int expectedSeat = 0;
		for(WebElement seat :seats){
		expectedSeat= Integer.parseInt(seat.getText().trim();
		for(Selectedseat=0;selectedseat<expectedSeat;selectedseat++){
		if(seat.getSeats().equals.seats[selectedseat]){
		
		element.findElement(By.xpath());
		driver.findElement(By.xpath(“//*[@id="btmcntbook"]”)).click();
		driver.findElement(By.xpath(“//*[@id="TickType"]/div[1]”).click();
		driver.findElement(By.xpath(“//*[@id="prePay"]”).click();
		}

		Thread.sleep(4000);
		driver.quit();
	}
	
}
