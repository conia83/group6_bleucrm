package com.cydeo.step_definitions;

import com.cydeo.pages.AssignTask_pages;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AssignTask_StepDef {
    LoginPage loginPage = new LoginPage();
    AssignTask_pages assignTask_pages = new AssignTask_pages();
    String email;
    int beforeCount;
    int afterCount;


    @Given("User is on the Tasks section in the azulcrm home page")
    public void user_is_on_the_blue_crm_home_page() {

        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();
        BrowserUtils.sleep(1);
        assignTask_pages.TasksButton.click();

    }

    @When("user types a task name on the Things to do section")
    public void user_types_a_task_name_on_the_things_to_do_section() {
        beforeCount= Integer.parseInt(assignTask_pages.count1.getText());
        assignTask_pages.NewTaskButton.click();
        BrowserUtils.sleep(1);
        Driver.getDriver().switchTo().frame(assignTask_pages.Iframe);
        BrowserUtils.sleep(1);
        assignTask_pages.thingsToDo.click();
        assignTask_pages.thingsToDo.sendKeys("login1");

        BrowserUtils.sleep(1);


    }

    @When("user clicks on Add more button of Responsible person section")
    public void user_clicks_on_add_more_button_of_responsible_person_section() {

        assignTask_pages.addMoreButton.click();

    }

    @When("user selects a person from the list")
    public void user_selects_a_person_from_the_list() {
        assignTask_pages.recipient.click();
    }

    @When("user clicks on close button on  the list")
    public void user_clicks_on_close_button_on_the_list() {
        assignTask_pages.closeButton.click();
    }

    @When("user clicks the High priority check box")
    public void user_clicks_the_high_priority_check_box() {
        assignTask_pages.highPriorityCheckbox.click();
    }

    @When("user clicks on send button")
    public void user_clicks_on_send_button() {
        assignTask_pages.addTaskButton.click();
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("user should see Task has been created message")
    public void user_should_see_task_has_been_created_message() {
        Driver.getDriver().navigate().refresh();
        String expectedEnes1 = "login1";
        String actualEnes1 = assignTask_pages.verifyTask1.getText();
        Assert.assertEquals(expectedEnes1, actualEnes1);


    }

    @When("user clicks on Add more button")
    public void user_clicks_on_Add_more_button() {

        assignTask_pages.addMoreButton.click();
    }


    @When("user selects a person from the people list")
    public void user_selects_a_person_from_the_people_list() {
        assignTask_pages.recipient.click();
    }

    @When("user clicks on the Employees and departments tab")
    public void user_clicks_on_the_employees_and_departments_tab() {
        assignTask_pages.EmployeesAndDepartment.click();
    }

    @When("user select another user")
    public void user_types_and_select() {

        assignTask_pages.SecondEmail.click();
        assignTask_pages.EaDcloseButton.click();


    }

    @Then("user should see all the responsible person")
    public void user_should_see_all_the_responsible_person() {
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.sleep(1);

        assignTask_pages.WebTable.click();
        Driver.getDriver().switchTo().frame(assignTask_pages.IframeWebtable);
        String expectedEmail1 = "helpdesk22@cybertekschool.com";
        String expectedEmail2 = "hr98@cybertekschool.com";
        String actualEmail1 = assignTask_pages.emailInIframe1.getText();
        String actualEmail2 = assignTask_pages.emailInIframe2.getText();
        Assert.assertEquals(actualEmail1, expectedEmail1);
        Assert.assertEquals(actualEmail2, expectedEmail2);
    }


    @And("user click on send button")
    public void userClickOnSendButton() {

        assignTask_pages.addTaskButton.click();
        Driver.getDriver().navigate().refresh();
        afterCount= Integer.parseInt(assignTask_pages.count1.getText());
    }

    @Then("user should see that the number in the count on the home page under the MY TASKS table.")
    public void user_should_see_that_the_number_in_the_count_on_the_home_page_under_the_my_tasks_table() {

        Assert.assertNotEquals(beforeCount, afterCount);


    }
}
