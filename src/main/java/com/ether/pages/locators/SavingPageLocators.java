package com.ether.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.ether.base.SeleniumDriver;

public class SavingPageLocators {

	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-usd']")
	public WebElement SavingAccBalance;
	// td should be checked
	@FindBy(how = How.XPATH, using = "//table [@class=\"table table-bordered table-hover table-striped\"]/tbody/tr")
	public WebElement LastSavingTransaction;

	public SavingPageLocators() {

		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}

}
