package com.sspart.march_bdd;

import org.testng.Assert;

import com.sspart.pages.HomePage;
import com.sspart.pages.ProductPage;
import com.sspart.pages.ProductSearchPage;
import com.sspart.utils.DriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ProductSearchStepDefs extends DriverUtils{

	 HomePage homePage= new HomePage();
	 ProductSearchPage productSearchPage =new ProductSearchPage();
	 ProductPage productPage = new ProductPage();
	 @Given("^I am in background step$")
		public void i_am_in_background_step() throws Throwable {
		 System.out.println("I am in background");
		   initiateDriver();
		}
	@Then("^I will navigate to amazon home page$")
	public void i_will_navigate_to_amazon_home_page() throws Throwable {
	   	   homePage.navigateToHome();	   
	}

	@Then("^I will search a product \"([^\"]*)\"$")
	public void i_will_search_a_product(String productQuery) throws Throwable {
	   	    homePage.searchProduct(productQuery);
	}

	@Then("^I will verify whether \"([^\"]*)\" is available or not and select it$")
	public void i_will_verify_whether_is_available_or_not_and_select_it(String productName) throws Throwable {
	   Assert.assertTrue(productSearchPage.verifyProductSearchResult(productName));
	   productSearchPage.selectProduct(productName);
	   productPage.switchToProductPage(productName);
	}

	@Then("^I will print the product price$")
	public void i_will_print_the_product_price() throws Throwable {
		productPage.printPrice();
		productPage.switchBack();
	   
	   
	}

}
