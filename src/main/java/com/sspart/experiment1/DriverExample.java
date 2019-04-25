package com.sspart.experiment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
//import com.sspart.experiment.utils.DriverUtils;

import static com.sspart.experiment.utils.DriverUtils.*;

import java.util.List;
public class DriverExample {

	@Test
	public void test() throws InterruptedException {
		getDriver().get("https://in.bookmyshow.com/");
		Thread.sleep(8000);
		getDriver().findElement(By.linkText("Hyderabad")).click();
		Thread.sleep(2000);
		getDriver().findElement(By.id("wzrk-cancel")).click();
		Thread.sleep(2000);
		getDriver().findElements(By.xpath("//*[@class=\"primary-menu\"]//a")).get(0).click();
		getDriver().findElement(By.xpath("//*[@class=\"cards\"][1]")).click();
		getDriver().findElement(By.xpath("//*[@class=\"showtimes btn _cuatro\"]")).click();
		getDriver().findElement(By.xpath("//*[@class=\"date-container \"]/ul[@id=\"showDates\"]/li[5]")).click();
		Thread.sleep(2000);
		getDriver().findElements(By.xpath("//ul[@id=\"venuelist\"]//li[@data-name=\"AMB Cinemas: Gachibowli\"]//a[@class=\"__showtime-link  time_vrcenter \"]\n" )).get(0).click();
		getDriver().findElement(By.xpath("//*[text()='Accept']")).click();
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("//*[@id=\"popQty\"]/li[4]")).click();
		getDriver().findElement(By.xpath("//*[@class=\"action-btn\"]")).click();
		getDriver().findElement(By.xpath("//*[@class=\"seats\"]//div[@id=\"layout\"]//td[@class=\"SRow1\"]//a[@class=\"_available\"]")).click();
		
	
		List<WebElement> elements = getDriver().findElements(By.xpath("//*[@id=\"layout\"]//td[@class=\"SRow1\"]"));
		int selectedseat= 0;

		for(WebElement ele : elements){
			List<WebElement> seats=ele.findElements(By.xpath("//a[@class='_available']"));
			int expectedSeat=0;
			
		for(int i = 0; i < seats.size() && (seats.size()-i>=4); i++){
			if(Integer.parseInt(seats.get(i+3).getText().trim()) == Integer.parseInt(seats.get(i).getText().trim())+3){
				seats.get(i).click();
				break;
			}
		}
		}
			Thread.sleep(2000);
			getDriver().findElement(By.xpath("//*[@class=\"bottom-screen\"]//a[@id=\"btmcntbook\"]")).click();
		
			
			
			
			
			
			
			
			
			
//				driver.findElement(By.xpath(“//*[@id="TickType"]/div[1]”).click();
//				driver.findElement(By.xpath(“//*[@id="prePay"]”).click();
	}
	
		
		
		
	}

