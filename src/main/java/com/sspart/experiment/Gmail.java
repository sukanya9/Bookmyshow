package com.sspart.experiment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail {
	WebDriver driver=null;

	@BeforeTest
	public void selectAmazon() throws IOException, InterruptedException
	{
		System.out.println("Open chrome browser");
  	   	   	 
    	if(driver==null) {
    		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    		driver = new ChromeDriver();
    		driver.manage().window().maximize(); 
    	}
		driver.get("https://www.gmail.com");
		Thread.sleep(3000);
	
}
	@Test
	public void sign_in_Page() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.id("//*[@id=identifierId]")).sendKeys("sukanya.pasupula9@gmail.com");
	driver.findElement(By.linkText("//*[text()=\"Next\"]")).click();
	driver.findElement(By.name("//*[@ name=\"password\"]")).sendKeys("Sukanya@9");
	
//			Compose button: By.xpath(//*[text()="Compose"])
//			//*[@name="to"] To
//			//*[@name="subjectbox"] subject
//			By.id(//*[@id=":pb"]) Body
//			//*[text()="Send"] Send button
}

	
}
