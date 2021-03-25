package com.orangehrm.stepdefinitions;

import com.orangehrm.base.ConfigReader;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSD {
    @Given("I am on the login page")
    public void verifyTitle(){

        Assert.assertEquals("OrangeHRM", LoginPage.verifyTitle());
    }

    @When("I enter correct username in the username field")
    public void enterUsername() {
        LoginPage.enterUserName(ConfigReader.getProperty("username"));

    }

    @And("I enter correct password in the password field")
    public void enterPassword() {
    LoginPage.enterPassword(ConfigReader.getProperty("password"));
    }

    @And("I click on the login button")
    public void clickOnOnLogin() {
        LoginPage.clickLoginBtn();

    }

    @Then("I see the home page")
    public void verifyHomePageTitle() {

        Assert.assertEquals("OrangeHRM", HomePage.verifyTitle());
    }

    @When("I enter incorrect username in the username field")
    public void enterInvalidUsername() {
        LoginPage.enterUserName(ConfigReader.getProperty("invalidusername"));
    }

    @And("I enter incorrect password in the password field")
    public void enterInvalidPassword() {
        LoginPage.enterPassword(ConfigReader.getProperty("invalidpassword"));
    }

    @Then("I see the error message")
    public void verifyErrorMessage() {
        Assert.assertEquals("Invalid credentials",LoginPage.getErrorMessage());
    }
}
