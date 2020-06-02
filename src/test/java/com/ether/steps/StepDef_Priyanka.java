package com.ether.steps;

import com.ether.base.SeleniumDriver;
import com.ether.pages.locators.HomePageLocators;
import cucumber.api.java.en.Then;

public class StepDef_Priyanka {
	HomePageLocators hpl=new HomePageLocators();
	
	@Then("^click on me$")
	public void click_on_me() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    SeleniumDriver.clickOnTheElement(hpl.userDetails);
	}

	@Then("^logout$")
	public void logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		SeleniumDriver.clickOnTheElement(hpl.logout);
	}

}