package com.swagLabs.pages;

import com.swagLabs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctionality {
    public LoginFunctionality() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "user-name")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//div[.='Sauce Labs Backpack']")
    public WebElement product;

    @FindBy(xpath = "//div[.='$29.99']")
    public WebElement productPrice;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElement addButton;

    @FindBy(xpath = "//div[@id='shopping_cart_container']")
    public WebElement shoppingCart;


    @FindBy(name = "login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//div[.='Sauce Labs Fleece Jacket']")
    public WebElement fleeceJacket;

    @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement error;

    @FindBy(xpath = "//h3[.='Epic sadface: Sorry, this user has been locked out.']")
    public WebElement errorPopUp;


}
