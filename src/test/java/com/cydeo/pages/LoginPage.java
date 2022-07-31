package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    public void loginHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
        BrowserUtils.waitForPageToLoad(5);

    }

}
