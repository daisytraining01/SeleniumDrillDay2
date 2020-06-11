package com.ether.steps;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.ether.base.SeleniumDriver;
import com.ether.pages.locators.HomePageLocators;
import com.ether.pages.locators.ScheduleAnAppointmentLocators;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_Priyanka_update {
	HomePageLocators hpl = new HomePageLocators();
	ScheduleAnAppointmentLocators spl = new ScheduleAnAppointmentLocators();

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

	@When("^click on appointment$")
	public void click_on_appointment() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		SeleniumDriver.clickOnTheElement(hpl.appointment);

	}

	@Then("^schedule an appointment$")
	public void schedule_an_appointment() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		SeleniumDriver.clickOnTheElement(hpl.scheduleAnAppointment);
	}

	@And("^you store the records in DB$")
	public void you_store_the_records_in_DB() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Pick a Date and Time$")
	public void pick_a_Date_and_Time() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		SeleniumDriver.clickOnTheElement(spl.datePicker);
		SeleniumDriver.clickOnTheElement(spl.datePicker_Day);
		SeleniumDriver.clickOnTheElement(spl.datePicker_hour);
		SeleniumDriver.clickOnTheElement(spl.datePicker_minutes);
		
	}

	@Then("^Pick a location$")
	public void pick_a_location() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SeleniumDriver.waitForElementVisiblity(spl.pickALocation);
		Select select  = new Select(spl.pickALocation);
		select.selectByVisibleText("Turku");
	}

	@Then("^update Notes$")
	public void update_Notes() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SeleniumDriver.inputValuesInElement(spl.notes, "appoinment needed");
	}

	@Then("^finally click on Submit scheduling$")
	public void finally_click_on_Submit_scheduling() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SeleniumDriver.clickOnTheElement(spl.submitScheduling);

	}

}
