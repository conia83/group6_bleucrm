package com.cydeo.step_definitions;

import com.cydeo.pages.IntractWithEmployeePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class IntractWithEmployeeStepDef {

    BrowserUtils browserUtils = new BrowserUtils();
    IntractWithEmployeePage intractWithEmployeePage = new IntractWithEmployeePage();
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        Driver.getDriver().get("https://qa.azulcrm.com/");
    }
    @When("User enters valid username {string}")
    public void userEntersValidUsername(String string)
    {
        intractWithEmployeePage.userName.sendKeys(string);
    }

    @And("User enters valid password {string}")
    public void userEntersValidPassword(String string) {
        BrowserUtils.sleep(3);
        intractWithEmployeePage.passWord.sendKeys(string);
    }

    @Then("User clicks log in button")
    public void userClickLogInButton() {
        intractWithEmployeePage.loginBtn.click();
    }


    @And("User clicks on comment, type {string} and clicks send button")
    public void userClicksOnCommentTypeAndClicksSendButton(String string){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(intractWithEmployeePage.addComment);
        BrowserUtils.sleep(1);
        actions.click();
        BrowserUtils.sleep(5);
        actions.sendKeys("Test");
        BrowserUtils.sleep(1);
        actions.build().perform();
        BrowserUtils.sleep(1);
        IntractWithEmployeePage.addCommentSendBtn.click();

        /*
       intractWithEmployeePage.addComment.sendKeys("string");
        WebElement addCommentBtn = intractWithEmployeePage.addComment;
        Actions.click(Driver.getDriver().findElement(By.xpath("aada"))).sendKeys("Test");
        intractWithEmployeePage.addComment.sendKeys(string);
-------------------------------------------------------------------------------------------------
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//body[@contenteditable='true']")));
        WebElement editable = Driver.getDriver().switchTo().activeElement();
        editable.sendKeys("Test");
        Driver.getDriver().switchTo().defaultContent();
-------------------------------------------------------------------------------------------------
       WebElement iframeMsg = Driver.getDriver().findElement(By.xpath
                ("//iframe[@class='bx-editor-iframe']"));
        Driver.getDriver().switchTo().frame(string);
-------------------------------------------------------------------------------------------------
       Driver.getDriver().switchTo().frame(Driver.getDriver().
                findElement(By.xpath("//div[@class='bxhtmled-dummy-target']")));
-------------------------------------------------------------------------------------------------
        intractWithEmployeePage.sendComment.sendKeys(string);
        IntractWithEmployeePage.addCommentSendBtn.click();
*/

    }

    @And("User clicks on Like text")
    public void userClicksOnLikeText() {
        IntractWithEmployeePage.likeBtn.click();
        /*
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(IntractWithEmployeePage.likeBtn);
        BrowserUtils.sleep(5);
        actions.click();
        BrowserUtils.sleep(5);
        actions.build().perform();
        BrowserUtils.sleep(5);
        //IntractWithEmployeePage.likeBtn.click();

         */

    }

    @Then("User clicks Unfollow text")
    public void userClicksUnfollowText() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(IntractWithEmployeePage.unfollowBtn);
        BrowserUtils.sleep(5);
        actions.click();
        BrowserUtils.sleep(5);
        actions.build().perform();
        BrowserUtils.sleep(5);

        //IntractWithEmployeePage.unfollowBtn.click();

    }

    @And("User clicks others reply like button")
    public void userClicksOthersReplyLikeButton() {
        BrowserUtils.sleep(3);
        IntractWithEmployeePage.othersLikeBtn.click();
        BrowserUtils.sleep(3);
    }

    @And("User clicks reply then type {string} and send button")
    public void userClicksReplyThenTypeAndSendButton(String arg0) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(IntractWithEmployeePage.replyBtn);
        actions.click();
        BrowserUtils.sleep(5);
        actions.sendKeys("Test");
        BrowserUtils.sleep(5);
        actions.build().perform();
        BrowserUtils.sleep(3);
        IntractWithEmployeePage.replySendBtn.click();
        BrowserUtils.sleep(3);


        //IntractWithEmployeePage.replyBtn.click();
        //BrowserUtils.sleep(3);

    }

    @And("User clicks more button under comment message")
    public void userClicksMoreButtonUnderCommentMessage() {
        IntractWithEmployeePage.moreUnderComment.click();
        BrowserUtils.sleep(3);
    }

    @And("User clicks view comment")
    public void userClicksViewComment() {
        IntractWithEmployeePage.moreViewComment.click();
        BrowserUtils.sleep(3);

    }

    @And("User clicks copy link")
    public void userClicksCopyLink() {
        IntractWithEmployeePage.moreUnderComment.click();
        BrowserUtils.sleep(2);
        IntractWithEmployeePage.moreCopyLink.click();
        BrowserUtils.sleep(3);

    }

    @And("User clicks edit and cancel")
    public void userClicksEditAndCancel() {
        IntractWithEmployeePage.moreEdit.click();
        BrowserUtils.sleep(2);
        IntractWithEmployeePage.moreEditCancel.click();
        BrowserUtils.sleep(2);


    }

    @And("User clicks create task")
    public void userClicksCreateTask() {
        IntractWithEmployeePage.moreUnderComment.click();
        BrowserUtils.sleep(2);
        IntractWithEmployeePage.moreCreateTask.click();
        BrowserUtils.sleep(2);


    }

    @And("User clicks delete then ok pop up windows")
    public void userClicksDeleteThenOkPopUpWindows() {
        IntractWithEmployeePage.moreUnderComment.click();
        BrowserUtils.sleep(2);
        IntractWithEmployeePage.moreDelete.click();
        BrowserUtils.sleep(2);
        Alert alert = Driver.getDriver().switchTo().alert(); // switch to alert
        BrowserUtils.sleep(2);
        alert.accept();
        BrowserUtils.sleep(2);
        // comment here

    }
    @Then("User should see comment deleted message")
    public void userShouldSeeCommentDeleteMessage() {
        Assert.assertEquals("Comment deleted", IntractWithEmployeePage.commentDeleted.getText() );

    }

    @And("User clicks reviewer's name")
    public void userClicksReviewerSName() {
        WebElement ele = Driver.getDriver().findElement
                (By.xpath("(//span[@class='feed-content-view-cnt'])[1]"));
        BrowserUtils.sleep(5);
        Actions ac1 = new Actions(Driver.getDriver());
        ac1.moveToElement(ele).perform();
        BrowserUtils.sleep(5);
        IntractWithEmployeePage.viewierEyeIconUnderPost.click();
        BrowserUtils.sleep(3);
    }

    @Then("User should see the reviewer's profile")
    public void userShouldSeeTheReviewerSProfile() {
        ArrayList<String> tabs = new ArrayList<String> (Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tabs.get(1));
        BrowserUtils.sleep(2);
        Assert.assertTrue(IntractWithEmployeePage.ProfileContactInfo.isDisplayed());
    }
    @Then("User clicks add to favorites icon")
    public void userClicksAddToFavoritesIcon() {
        BrowserUtils.sleep(2);
        IntractWithEmployeePage.addToFavoritesIcon.click();


    }
}
