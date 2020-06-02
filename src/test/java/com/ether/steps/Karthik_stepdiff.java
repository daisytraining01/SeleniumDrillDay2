package com.ether.steps;

import com.ether.base.SeleniumDriver;
import com.ether.base.TestUtil;
import com.ether.pages.locators.LoginPageLocators;
import com.ether.pages.locators.RegisterPageLocators;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Karthik_stepdiff {
	TestUtil util = new TestUtil();
	LoginPageLocators lpl=new LoginPageLocators();
	RegisterPageLocators rpl = new RegisterPageLocators();
	@Given("^Launching application url on the Browser$")
	public void launching_application_url_on_the_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SeleniumDriver.openPage("http://elastic.rapidtestpro.com:8086/index");
	   
	}

	@Given("^user clicks signUp buttton for registration$")
	public void user_clicks_signUp_buttton_for_registration() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SeleniumDriver.clickOnTheElement(lpl.signUp);
	    
	}
	
	@When("^user enters  Registration form details$")
	public void user_enters_Registration_form_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	SeleniumDriver.inputValuesInElement(rpl.firstName, "ramann");
	SeleniumDriver.inputValuesInElement(rpl.lastName, "rmm");
	SeleniumDriver.inputValuesInElement(rpl.phone, "8747723456");
	SeleniumDriver.inputValuesInElement(rpl.email, "test@testrt.com");
	SeleniumDriver.inputValuesInElement(rpl.username, "raman002");
	SeleniumDriver.inputValuesInElement(rpl.password, "raman02");
	
	}
	
	@When("^user submit signUp button$")
	public void user_submit_signUp_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    SeleniumDriver.clickOnTheElement(rpl.signUp);
	}

	@Then("^user will navigate to login page$")
	public void user_will_navigate_to_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SeleniumDriver.inputValuesInElement(lpl.username, "raman001");
		SeleniumDriver.inputValuesInElement(lpl.password, "raman01");
	    
	}

	@Then("^click sign in button for succesfull login$")
	public void click_sign_in_button_for_succesfull_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SeleniumDriver.clickOnTheElement(lpl.signIn);
	    
	}

}

