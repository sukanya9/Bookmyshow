package com.sspart.march_bdd;

import java.util.Set;

import org.openqa.selenium.By;

//import org.testng.annotations.Test;

import com.sspart.utils.DriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SeleniumStepDefs {
	

	
//	@Given("^I am in background step$")
//	public void i_am_in_background_step() throws Throwable {
	//   initiateDriver();
	
}
////	@Given("^I am in background step for guru$")
////	public void i_am_in_background_step_for_guru() throws Throwable {
////			System.out.println("I am in background");
////       		initiateDriver();
////	}
////	
////	@Given("^guru home page$")
////	public void guru_home_page() throws Throwable {
////		System.out.println("I am in given step");
////		driver.get(props.getProperty("guru99.url"));
////		Thread.sleep(3000);
////	}
////
////	@Then("^guru clickhere$")
////	public void guru_clickhere() throws Throwable {
////		System.out.println("I am in Then step");
////		String currentWindowHandle= driver.getWindowHandle();
////		driver.findElement(By.linkText(props.getProperty("guru99.clickhere"))).click();
////		
////		System.out.println("Selected button");
////		try{
////		Thread.sleep(4000);
////		}catch(InterruptedException e)
////		{
////		e.printStackTrace();
////		}
////		
////		Set<String> windowHandles=driver.getWindowHandles();
////		
////		for(String eachHandle : windowHandles) {
////			driver.switchTo().window(eachHandle);
////			Thread.sleep(4000);
////			boolean bool = false;
////			try {
////				bool =driver.findElement(By.xpath(props.getProperty("guru99.emailid"))).isDisplayed();	
////			}catch(Exception ignore){}
////				
////			if(bool) {
////				driver.close();
////			}
////	}
////		driver.switchTo().window(currentWindowHandle);
////		System.out.println("Window handled");
////		driver.quit();
////	}
////}
//}
