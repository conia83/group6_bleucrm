package com.cydeo.step_definitions;

import com.cydeo.pages.AssignTask_pages;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AssignTask_StepDef{
    LoginPage loginPage=new LoginPage();
    AssignTask_pages assignTask_pages=new AssignTask_pages();

    @Given("User is on the blueCrm home page")
    public void user_is_on_the_blue_crm_home_page() {

        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();
        BrowserUtils.sleep(1);
        assignTask_pages.TasksButton.click();

    }
    @When("user types a task name on the Things to do section")
    public void user_types_a_task_name_on_the_things_to_do_section() {

       // Actions actions=new Actions(Driver.getDriver());
        assignTask_pages.NewTaskButton.click();
        BrowserUtils.sleep(1);
//       WebElement iframe1= Driver.getDriver().findElement(By.id("iframe_3zqdmb5nb0"));
        Driver.getDriver().switchTo().frame(assignTask_pages.Iframe);
        BrowserUtils.sleep(1);
        assignTask_pages.thingsToDo.click();
        assignTask_pages.thingsToDo.sendKeys("login");
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
    String expected1="login";
    String actual1=assignTask_pages.verifyTask1.getText();
        Assert.assertEquals(expected1,actual1);
    }
}
