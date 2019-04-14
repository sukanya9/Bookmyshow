package com.sspart.experiment.march_bdd;
//package com.sspart.march_bdd;

import org.openqa.selenium.By;

import com.sspart.experiment.pages.GmailHome;
import com.sspart.experiment.pages.GmailLoginPage;
import com.sspart.experiment.utils.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
public class GmailLogin extends DriverUtils{
	
	
	GmailLoginPage gmailloginpage=new GmailLoginPage();
	GmailHome gmailhome=new GmailHome();
//	
//@Given("^I am in background step$")
//public void i_am_in_background_step() throws Throwable {
//	System.out.println("I am in background");
//    initiateDriver();
//	}

@Given("^Open gmail url$")
public void open_gmail_url() throws Throwable {
	gmailloginpage.login();
}

@Then("^provide details$")
public void provide_details() throws Throwable {
	gmailloginpage.userName();
	//gmailloginpage.navigateToNext();
	
}

@Then("^click on Compose$")
public void click_on_Compose() throws Throwable {
	gmailhome.Compose();
}

@Then("^quit browser$")
public void quit_browser() throws Throwable {
   driver.close();
}



}
