package com.cydeo.step_definitions;

import com.cydeo.pages.LUE1080_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class LUE1080_StepDefinitions {

   Actions action = new Actions(Driver.getDriver());

   LUE1080_Page lue1080Page = new LUE1080_Page();

   @When("user clicks the small pencil button right of the uploaded file name")
   public void user_clicks_the_small_pencil_button_right_of_the_uploaded_file_name() {

      action.moveToElement(lue1080Page.fileName).perform();

      lue1080Page.editButton.click();
      BrowserUtils.sleep(1);
   }

   @When("user enters a custom name for the file")
   public void user_enters_a_custom_name_for_the_file() {

      for (int i = 0; i < 15; i++) {
         lue1080Page.nameEdit.sendKeys(Keys.DELETE);
      }
      BrowserUtils.sleep(1);

      lue1080Page.nameEdit.sendKeys("customName");
      BrowserUtils.sleep(1);

      lue1080Page.nameEdit.sendKeys(Keys.ENTER);

   }

   @Then("uploaded file's name is changed")
   public void uploaded_file_s_name_is_changed() {
      Assert.assertEquals(lue1080Page.fileName.getText(), "customName.pdf");
   }

}
