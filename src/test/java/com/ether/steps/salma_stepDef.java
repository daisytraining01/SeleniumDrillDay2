package com.ether.steps;

import java.sql.ResultSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ether.base.SeleniumDriver;
import com.ether.base.TestUtil;
import com.ether.pages.actions.LoginAction;
import com.ether.pages.locators.HomePageLocators;
import com.ether.pages.locators.LoginPageLocators;

import cucumber.api.PendingException;
//import com.ether.pages.locators.loginPageLocators;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleTestLogin {
	TestUtil util = new TestUtil();
	LoginPageLocators locator = new LoginPageLocators();
	HomePageLocators locators = new HomePageLocators();

	@Given("^Launch url$")
	public void loginToUrl() {
		SeleniumDriver.openPage("http://elastic.rapidtestpro.com:8086/index");
	}

	@And("^login with userName and password$")
	public void loginWithusername() throws Exception {
		String userName = null;
		String password = null;
		util.setUpDBConnection();
		String query = "Select * from user_details where username='mayana'";
		ResultSet result = util.getDataFromDB(query);

		while (result.next()) {
			userName = result.getString("username");
			password = result.getString("password");
		}
		locator.username.sendKeys(userName);
		locator.password.sendKeys(password);
		locator.signIn.click();
		util.closeDBConnection();
	}
	
	
	@When("^Click on me$")
	public void click_on_me() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("you are on home page");
	  //  throw new PendingException();
	}

	@When("^you are in home page$")
	public void you_are_in_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		locators.userDetails.click();
	  //  throw new PendingException();
	}

	@Then("^Click on profile$")
	public void click_on_profile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		locators.userProfile.click();
	  //  throw new PendingException();
	}

	@Then("^validate firstName$")
	public void validate_firstName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String firstname = null;
		String first=locators.first_name.getAttribute("value");
		util.setUpDBConnection();
		String query = "Select firstName from profile_validation";
		ResultSet result = util.getDataFromDB(query);
		
		while (result.next()) {
			firstname = result.getString("firstName");
			
		        if(first.equals(firstname ))
		        {
		           System.out.println("firstname is matched!!");
		        }
		           break;
			
			
		}
	
		
	 //   throw new PendingException();
	}



	@Then("^validate lastName$")
	public void validate_lastName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String lastname = null;
		String last=locators.last_name.getAttribute("value");
		util.setUpDBConnection();
		String query = "Select lastName from profile_validation";
		ResultSet result = util.getDataFromDB(query);

		while (result.next()) {
			lastname = result.getString("lastName");
			
		        if(last.equals(lastname ))
		        {
		           System.out.println("lastname is matched!!");
		        }
		           break;
		}
	  //  throw new PendingException();
	}

	@Then("^Validate phone number$")
	public void validate_phone_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String phone1 = null;
		String phone2=locators.phone_number.getAttribute("value");
		util.setUpDBConnection();
		String query = "Select phone from profile_validation";
		ResultSet result = util.getDataFromDB(query);

		while (result.next()) {
			phone1= result.getString("phone");
			
		        if(phone2.equals(phone1))
		        {
		           System.out.println("phone number is matched!!");
		        }
		           break;
		}
		
		
		
		
	//    throw new PendingException();
	}

	@Then("^Validate email$")
	public void validate_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String email = null;
		String email1=locators.email_id.getAttribute("value");
		util.setUpDBConnection();
		String query = "Select yourEmail from profile_validation";
		ResultSet result = util.getDataFromDB(query);

		while (result.next()) {
			email = result.getString("yourEmail");
			
		        if(email1.equals(email))
		        {
		           System.out.println("email is matched!!");
		        }
		           break;
		}
	  //  throw new PendingException();
	}

	@Then("^validate userName$")
	public void validate_userName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		   // Write code here that turns the phrase above into concrete actions
				String user = null;
				String user1=locators.user_name.getAttribute("value");
				util.setUpDBConnection();
				String query = "Select userName from profile_validation";
				ResultSet result = util.getDataFromDB(query);

				while (result.next()) {
					user = result.getString("userName");
					
				        if(user1.equals(user))
				        {
				           System.out.println("username is matched!!");
				        }
				           break;
				}
	  //  throw new PendingException();
	}
//	@Then("^Click on change setting$")
/*	public void click_on_change_setting() throws Throwable {
		
		String phone3 = null;
		String phone_update=locators.phone_number.clear();
		Thread.sleep(2000);
		locators.change_setting.click();
		Thread.sleep(2000);
		
		util.setUpDBConnection();
		String query = "update profile_validation set phone=phone_update ";
		ResultSet result = util.getDataFromDB(query);

		while (result.next()) {
			phone1= result.getString("phone");
			
		        if(phone2.equals(phone1))
		        {
		           System.out.println("phone number is matched!!");
		        }
		           break;
		}*/
		
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	

	public SampleTestLogin() {
		this.locators = new HomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), locators);
	}

}



 
