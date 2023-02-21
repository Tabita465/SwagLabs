package com.swagLabs.step_definition;

import com.swagLabs.pages.LoginFunctionality;
import com.swagLabs.utilities.ConfigurationReader;
import com.swagLabs.utilities.BrowserUtils;

import com.swagLabs.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinition {
    LoginFunctionality loginFunctionality = new LoginFunctionality();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);


    }

    @When("user enters username")
    public void user_enters_username() {
        BrowserUtils.sleep(3);
        loginFunctionality.inputUsername.sendKeys(ConfigurationReader.getProperty("Username"));

    }

    @And("user enters password")
    public void user_enters_password() {
        BrowserUtils.sleep(3);
        loginFunctionality.inputPassword.sendKeys(ConfigurationReader.getProperty("Password"));
        loginFunctionality.loginButton.click();
    }

    @Then("user should be able to see the' 'Sauce Labs Fleece Jacket' product is displayed")
    public void user_should_be_able_to_see_the_sauce_labs_fleece_jacket_product_is_displayed() {
        BrowserUtils.sleep(5);
        loginFunctionality.fleeceJacket.isDisplayed();
        Driver.getDriver().close();
    }

    @When("user enters correct username")
    public void user_enters_correct_username() {
        BrowserUtils.sleep(3);
        loginFunctionality.inputUsername.sendKeys(ConfigurationReader.getProperty("Username"));

    }

    @When("user enters incorrect password")
    public void user_enters_incorrect_password() {
        BrowserUtils.sleep(3);
        loginFunctionality.inputPassword.sendKeys(ConfigurationReader.getProperty("Password"));
        loginFunctionality.loginButton.click();

    }

    @Then("user should be able to see that an error with incorrect login credentials is displayed")
    public void user_should_be_able_to_see_that_an_error_with_incorrect_login_credentials_is_displayed() {
        BrowserUtils.sleep(3);
        loginFunctionality.error.isDisplayed();
        Driver.getDriver().close();

    }


    @Then("user should be able to see an error message is displayed starting that this user has been locked out of the platform")
    public void user_should_be_able_to_see_an_error_message_is_displayed_starting_that_this_user_has_been_locked_out_of_the_platform() {
        BrowserUtils.sleep(3);
        loginFunctionality.errorPopUp.isDisplayed();
        Driver.getDriver().close();
    }

    @When("assert that the Sauce Labs Backpack is ${double}")
    public void assert_that_the_sauce_labs_backpack_is_$(Double double1) {
        BrowserUtils.sleep(3);
        loginFunctionality.product.isDisplayed();
        String expectedPrice = "$29.99";
        String actualPrice = loginFunctionality.productPrice.getText();
        Assert.assertTrue(expectedPrice.equals(actualPrice));
    }

    @Then("user should be able to see that product has been succesfully added to the cart")
    public void user_should_be_able_to_see_that_product_has_been_succesfully_added_to_the_cart() {
        BrowserUtils.sleep(3);
        loginFunctionality.addButton.click();
        loginFunctionality.shoppingCart.click();
        loginFunctionality.product.isDisplayed();
        Driver.getDriver().close();
    }

}
