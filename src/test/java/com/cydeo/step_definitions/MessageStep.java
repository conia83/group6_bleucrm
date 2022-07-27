package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardMessage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public class MessageStep {


    LoginPage loginPage = new LoginPage();

    DashboardMessage dashboardMessage = new DashboardMessage();




    /////////////// background

    @Given("user is on the login page, login, clicks on Message tab")
    public void user_is_on_the_login_page_login_clicks_on_message_tab_or_send_message_input_box() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        //BrowserUtils.sleep(1);

        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        //BrowserUtils.sleep(1);

        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        //BrowserUtils.sleep(1);

        loginPage.loginButton.click();
        //BrowserUtils.sleep(1);

        dashboardMessage.messageTab.click();
        BrowserUtils.waitForVisibility(dashboardMessage.iframe,3);
        //BrowserUtils.waitForVisibility(dashboardMessage.title,2);
    }


    /////////////// TC1

    @And("user writes a message title {string} on the Topic field")
    public void user_writes_a_message_title_on_the_topic_field(String title) {

        dashboardMessage.title.sendKeys(title);
        BrowserUtils.waitFor(1);
    }

    @And("user writes a message {string} on the message text field")
    public void user_writes_a_message_on_the_message_text_field(String text) {

        text = ConfigurationReader.getProperty("message");

        Driver.getDriver().switchTo().frame(dashboardMessage.iframe);
        //BrowserUtils.waitForVisibility(dashboardMessage.iframeMessage,3);

        dashboardMessage.iframeMessage.sendKeys(text);
        //BrowserUtils.waitFor(1);
    }

    @And("user clicks the SEND button")
    public void user_clicks_the_send_button() {

        Driver.getDriver().switchTo().parentFrame();

        dashboardMessage.sendButton.click();
        BrowserUtils.sleep(1);
    }

    @Then("user should see the created Message on the dashboard")
    public void user_should_see_the_created_message_on_the_dashboard() {

        String eMessage = ConfigurationReader.getProperty("message");
        String aMessage = dashboardMessage.createdMessage.getText();

        System.out.println("eMessage = " + eMessage);
        System.out.println("aMessage = " + aMessage);

        Assert.assertEquals(eMessage,aMessage);
    }



    @Then("user should see the error message {string}")
    public void user_should_see_the_error_message(String expectedErrorMessage) {

        String actualErrorMessage = dashboardMessage.errorMessage.getText();
        System.out.println("actualErrorMessage = " + actualErrorMessage);

        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }


    @Given("user deletes the Recipients")
    public void user_deletes_the_recipients() {

        Driver.getDriver().switchTo().parentFrame();

        dashboardMessage.deleteRecipients.click();
        BrowserUtils.sleep(1);
    }







    /////////////// TC2

    @And("user sees the message created to {string} by default")
    public void user_sees_the_message_created_by_default(String expected) {

        BrowserUtils.sleep(1);

        System.out.println("expected = " + expected);

        String actual = dashboardMessage.toAllEmployees.getText();

        System.out.println("actual = " + actual);


        Assert.assertEquals(expected,actual);

        BrowserUtils.sleep(1);
    }


    @And("user clicks More button in the created message")
    public void user_clicks_more_button_in_the_created_message() {

        dashboardMessage.more.click();
        BrowserUtils.sleep(1);

    }




    @And("user clicks Edit button")
    public void user_clicks_edit_button(){

        BrowserUtils.sleep(1);

        dashboardMessage.edit.click();


//        for (WebElement eachPopupMenu : dashboardMessage.popupMenu) {
//
//            if (eachPopupMenu.getText().equals(button)){
//                eachPopupMenu.click();
//                BrowserUtils.sleep(1);
//            }
//        }

        BrowserUtils.sleep(1);
//        dashboardMessage.delete.click();


    }

    @And("user clicks Add more button")
    public void userClicksAddMoreButton() {

        Driver.getDriver().switchTo().frame(dashboardMessage.iframe);

        dashboardMessage.iframeMessage.sendKeys(ConfigurationReader.getProperty("url"));
//
        Driver.getDriver().switchTo().parentFrame();

        dashboardMessage.addMore.click();
//
//
//
//        dashboardMessage.addMore.click();
//        BrowserUtils.sleep(1);
    }

    /*
    @And("user clicks Add persons, groups or department")
    public void user_clicks_add_persons_groups_or_department() {

        BrowserUtils.sleep(1);
        dashboardMessage.addPerson.click();
        BrowserUtils.sleep(1);
    }
    */

    @And("user clicks a person {string}")
    public void user_clicks_a_person(String person) {

        person = dashboardMessage.email1;

        for (WebElement each : dashboardMessage.recentPerson) {

            if(each.getText().equals(person)){
                each.click();
            }
        }

        BrowserUtils.sleep(1);
    }

    @And("user clicks the Employees and departments tab")
    public void user_clicks_the_employees_and_departments_tab() {

        dashboardMessage.employeesAndDepartmentsTab.click();
        BrowserUtils.sleep(1);
    }

    @And("user clicks a person {string} from the people list")
    public void user_clicks_a_person_from_the_people_list(String person) {

        person = dashboardMessage.email2;

        for (WebElement each : dashboardMessage.employeesAndDepartments) {

            if(each.getText().equals(person)){
                each.click();
            }
        }
        BrowserUtils.sleep(1);
    }

    @And("user clicks the E-mail users tap")
    public void user_clicks_the_e_mail_users_tap() {

        dashboardMessage.emailUsers.click();
       // BrowserUtils.sleep(1);
    }

    @And("user texts a email {string}")
    public void user_texts_a_email(String person) {

        person = dashboardMessage.email3;

        dashboardMessage.emailInput.sendKeys(person);
        BrowserUtils.sleep(1);
    }

    @And("user clicks the person {string} from the people list")
    public void user_clicks_the_person_from_the_people_list(String string) {
        dashboardMessage.email.click();
        //BrowserUtils.sleep(1);
    }

    @Then("user should see the recipients has changed")
    public void user_should_see_the_message_that_the_recipients_has_changed() {


        for (WebElement each : dashboardMessage.changedEmployees) {


            if (each.getText().equals(dashboardMessage.email1)){
                Assert.assertTrue(each.getText().equals(dashboardMessage.email1));
            }else if (each.getText().equals(dashboardMessage.email2)) {
                Assert.assertTrue(each.getText().equals(dashboardMessage.email2));
            }else if (each.getText().equals(dashboardMessage.email3)) {
                Assert.assertTrue(each.getText().equals(dashboardMessage.email3));
            }
//
//
        }
    }




    /////////////// TC3
    @And("user clicks the CANCEL button")
    public void user_clicks_the_cancel_button() {
        BrowserUtils.sleep(1);

        Driver.getDriver().switchTo().parentFrame();

        dashboardMessage.cancelButton.click();
        BrowserUtils.sleep(1);
    }


    @Then("MESSAGE field should be hided")
    public void message_field_should_be_hided() {
        System.out.println("Message text box is displayed = " + dashboardMessage.cancelButton.isDisplayed());
    }





    /////////////// TC4

    @And("user clicks Delete button")
    public void user_clicks_delete_button(){

        dashboardMessage.delete.click();

    }

    @And("the alert displayed")
    public void the_alert_displayed() {

        Alert alert = Driver.getDriver().switchTo().alert();

        alert.getText();
        BrowserUtils.sleep(1);

    }

    @And("user clicks OK")
    public void user_clicks_OK() {

        Alert alert = Driver.getDriver().switchTo().alert();

        alert.accept();
        BrowserUtils.sleep(1);

    }


    @Then("user should see the message {string}")
    public void user_should_see_the_message(String expectedDeleteMessage) {
        System.out.println("Message: " + dashboardMessage.deleteMessage.getText());
        Assert.assertEquals(dashboardMessage.deleteMessage.getText(),expectedDeleteMessage);
    }


}
