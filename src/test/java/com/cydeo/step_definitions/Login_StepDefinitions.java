package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_StepDefinitions {

   LoginPage loginPage = new LoginPage();

   @Given("user is on the login page")
   public void userIsOnTheLoginPage() {
      String url = ConfigurationReader.getProperty("url2");
      Driver.getDriver().get(url);
   }

   @And("user should login with correct credentials")
   public void userShouldLoginWithCorrectCredentials() {

      loginPage.usernameConfig();
      loginPage.passwordConfig();
      loginPage.loginButton.click();

   }

   @And("user should land on home page where Active Stream is")
   public void user_should_land_on_home_page_where_active_stream_is() {
      BrowserUtils.verifyURLContains("stream");
   }

   @Then("user clicks on the Send Message searchbox")
   public void userClicksOnTheSendMessageSearchbox() {
      loginPage.sendMessageSearchbox.click();
      BrowserUtils.sleep(4);
   }

}
