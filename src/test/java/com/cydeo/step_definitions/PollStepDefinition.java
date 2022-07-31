package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.PollPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public class PollStepDefinition {
    LoginPage loginPage = new LoginPage();
    PollPage pollpage = new PollPage();

    @Given("user is on the login page, login, clicks on Poll tab")
    public void user_is_on_the_login_page_login_clicks_on_poll_tab() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        BrowserUtils.sleep(1);

        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.sleep(1);

        loginPage.loginButton.click();
        BrowserUtils.sleep(3);

        pollpage.pollTab.click();
        BrowserUtils.sleep(2);
    }

    @Given("user sees the specifying {string} by default")
    public void user_sees_the_specifying_by_default(String expected) {

        System.out.println("expected = " + expected);
        BrowserUtils.sleep(1);

        String actual = pollpage.allEmployees.getText();
        System.out.println("actual = " + actual);
        BrowserUtils.sleep(1);

        Assert.assertEquals(expected, actual);
        BrowserUtils.sleep(1);
    }

    @Given("user clicks {string} button")
    public void user_clicks_button(String string) {

        pollpage.addMore.click();
        BrowserUtils.sleep(2);
    }

    @Given("user clicks {string}")
    public void user_clicks(String string) {

        pollpage.employessAndDepartmentsTab.click();
        BrowserUtils.sleep(1);

    }
    @Given("user seleckts a person  {string} from list")
    public void user_seleckts_a_person_from_list(String person) {

        for (WebElement each : pollpage.employeesandDepartments) {
            if (each.getText().equals(person)) {
                each.click();
            }
        }
        BrowserUtils.sleep(1);

    }

    @Then("user sees the specifying person as {string}.")
    public void user_sees_the_specifying_person_as(String person) {
        for (WebElement each : pollpage.employeesandDepartments) {
            if (each.getText().equals(person)) {
                each.click();
                BrowserUtils.sleep(1);
                Assert.assertTrue(pollpage.toBox.getText().contains(person));
                BrowserUtils.sleep(1);
            }
        }

    }
//AC2
    @Given("user sends question {string}")
    public void user_sends_question(String firstquestion) {

        pollpage.question1.sendKeys(firstquestion);
        BrowserUtils.sleep(1);

    }
    @Given("user sends answer {string}")
    public void user_sends_answer(String answ1) {

        pollpage.ans1.sendKeys(answ1);
        BrowserUtils.sleep(1);
    }
    @Given("user sends second answer {string}")
    public void user_sends_second_answer(String answ2) {

        pollpage.ans2.sendKeys(answ2);
        BrowserUtils.sleep(1);

    }
    @Given("user clicks Add question button")
    public void user_clicks_add_question_button() {

       pollpage.addQuestionButton.click();
        BrowserUtils.sleep(1);
    }
    @Given("user sends second question {string}")
    public void user_sends_second_question(String secQuest) {

        pollpage.question2.sendKeys(secQuest);
        BrowserUtils.sleep(1);

    }
    @Given("user sends second question's answer {string}")
    public void user_sends_second_question_s_answer(String secQuestAns) {

    pollpage.secQuestionAns.sendKeys(secQuestAns);
    BrowserUtils.sleep(1);

    }

    //AC3
    @Given("user sends a question {string}")
    public void user_sends_a_question(String firstquestion) {

        pollpage.question1.sendKeys(firstquestion);
        BrowserUtils.sleep(1);

    }
    @Given("user deletes  the question")
    public void user_deletes_the_question() {

        pollpage.question1.clear();
        BrowserUtils.sleep(1);
    }
    @Given("user sends an answer {string}")
    public void user_sends_an_answer(String answ1) {

        pollpage.ans1.sendKeys(answ1);
        BrowserUtils.sleep(1);
    }
    @Given("user deletes the answer")
    public void user_deletes_the_answer() {

        pollpage.ans1.clear();
        BrowserUtils.sleep(1);
    }
    @Given("user sends a second answer {string}")
    public void user_sends_a_second_answer(String answ2) {

        pollpage.ans2.sendKeys(answ2);
        BrowserUtils.sleep(1);
    }
    @Given("user deletes second answer")
    public void user_deletes_second_answer() {

        pollpage.ans2.clear();
        BrowserUtils.sleep(1);

    }
    @Given("user sends a second question {string}")
    public void user_sends_a_second_question(String secQuestion) {

        pollpage.question2.sendKeys(secQuestion);
        BrowserUtils.sleep(1);

    }
    @Given("user deletes second question.")
    public void user_deletes_second_question() {

        pollpage.question2.clear();
        BrowserUtils.sleep(1);

    }

    //AC4
    @Given("user clicks first Allow multiple choice box")
    public void user_clicks_first_allow_multiple_choice_box() {

        pollpage.firstAllowMultipleCoiceBox.click();
        BrowserUtils.sleep(1);
    }
    @Given("user clicks second Allow multiple choice box")
    public void user_clicks_second_allow_multiple_choice_box() {

        pollpage.secondAllowMultipleCoiceBox.click();
        BrowserUtils.sleep(1);

    }
    //AC5.1

    @Given("user clicks closesign of person list.")
    public void user_clicks_closesign_of_person_list() {

        pollpage.closeSign.click();
        BrowserUtils.sleep(1);
    }

    @Given("user specifies at list one question {string}.")
    public void user_specifies_at_list_one_question(String question) {

        pollpage.question1.sendKeys(question);
        BrowserUtils.sleep(2);

    }
    @Given("user specifies at list two answer {string}, {string}.")
    public void user_specifies_at_list_two_answer(String ans1, String ans2) {

        pollpage.ans1.sendKeys(ans1);
        BrowserUtils.sleep(1);

        pollpage.ans2.sendKeys(ans2);
        BrowserUtils.sleep(1);

    }
    @Given("user clicks send button")
    public void user_clicks_send_button() {

        pollpage.send.click();
        BrowserUtils.sleep(1);

    }
    @Then("user sees the {string}")
    public void user_sees_the(String string) {

        String expected=string;
        String actual=pollpage.messageallert.getText();
        Assert.assertEquals(expected,actual);


    }

    //AC5.2
    @Given("user send a message {string}.")
    public void user_send_a_message(String text) {

        Driver.getDriver().switchTo().frame(pollpage.iframe);
        BrowserUtils.sleep(1);

        pollpage.frametext.sendKeys(text);
        BrowserUtils.sleep(2);

        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.sleep(1);

    }
    @Given("user delete all person at To box.")
    public void user_delete_all_person_at_to_box() {
        pollpage.allEmployeesSign.click();
    }

    @Given("user click to question box.")
    public void user_click_to_question_box() {

        pollpage.question1.click();
        BrowserUtils.sleep(1);
    }

    @Then("user sees the person error message {string}")
    public void user_sees_the_person_error_message(String errorMessage) {

        String expected=errorMessage;
        String actual=pollpage.personErrorMessage.getText();

        Assert.assertEquals(expected,actual);
    }
//AC5.3
@Then("user sees the error message about question {string}")
public void user_sees_the_error_message_about_question(String questionErrorMessage) {

        String expected= questionErrorMessage;
        String actual=pollpage.questionErrorMessage.getText();

        Assert.assertEquals(expected,actual);

}
//AC5.4
@Then("user sees the error message about answer {string}")
public void user_sees_the_error_message_about_answer(String answerErrorMessage) {

        String expected=answerErrorMessage;
        //when I entered only one answer, the poll sended so no error message. There is a bug.
        String actual= pollpage.ansErrorMessage.getText();

        Assert.assertEquals(expected,actual);
}




}