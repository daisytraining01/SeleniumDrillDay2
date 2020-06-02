package com.ether.steps;

import com.ether.base.SeleniumDriver;
import com.ether.pages.locators.HomePageLocators;
import com.ether.pages.locators.LoginPageLocators;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Ajay_StepDef {

                LoginPageLocators LPL = new LoginPageLocators();
                HomePageLocators hpl=new HomePageLocators();
                
                @Given("^User Navigate to Login Page$")
                public void user_Navigate_to_Login_Page() throws Throwable {
                    // Write code here that turns the phrase above into concrete actions
                    
                                SeleniumDriver.openPage("http://elastic.rapidtestpro.com:8086/index");
                }

                @Given("^User enters UserName and Password$")
                public void user_enters_UserName_and_Password() throws Throwable {
                    // Write code here that turns the phrase above into concrete actions
                    
                                SeleniumDriver.inputValuesInElement(LPL.username, "labuser");
                                SeleniumDriver.inputValuesInElement(LPL.password, "labuser@01");
                                SeleniumDriver.clickOnTheElement(LPL.signIn);
                                
                }

                @Then("^Message displayed Login Successfully$")
                public void message_displayed_Login_Successfully() throws Throwable {
                    // Write code here that turns the phrase above into concrete actions
                    System.out.println("Logged in Successfully");
                                
                }

                                @Then("^Primary Balance and Savings Balance are displayed$")
                public void primary_Balance_and_Savings_Balance_are_displayed() throws Throwable {
                    // Write code here that turns the phrase above into concrete actions
                                
                                System.out.println("Primary Balance and Savings Balance are displayed");
                    
                }

                @Given("^User clicks on Primary Balance$")
                public void user_clicks_on_Primary_Balance() throws Throwable {
                    // Write code here that turns the phrase above into concrete actions
                                
                                SeleniumDriver.clickOnTheElement(hpl.primaryAccountBalance);
                    
                }

                @Then("^Primary Balance and Transaction details are displayed$")
                public void primary_Balance_and_Transaction_details_are_displayed() throws Throwable {
                    // Write code here that turns the phrase above into concrete actions
                    System.out.println("Primary Accounts are displayed");
                }

                
                @Given("^User clicks on Savings Balance$")
                public void user_clicks_on_Savings_Balance() throws Throwable {
                    // Write code here that turns the phrase above into concrete actions
                    
                                SeleniumDriver.clickOnTheElement(hpl.savingsAccountBalance);
                                                                
                }

                @Then("^Savings Balance and Transaction details are displayed$")
                public void savings_Balance_and_Transaction_details_are_displayed() throws Throwable {
                    // Write code here that turns the phrase above into concrete actions
                    
System.out.println("Saving Account Details are displayed");                    
                }
}
