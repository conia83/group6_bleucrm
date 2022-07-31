package com.cydeo.step_definitions;

import com.cydeo.pages.LUE1079_Page;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LUE1079_StepDefinitions {

   LUE1079_Page lue1079Page = new LUE1079_Page();

   @And("user removes uploaded files and images")
   public void userRemovesUploadedFilesAndImages() {

      lue1079Page.firstFileRemoveButton.click();
      BrowserUtils.sleep(1);

      lue1079Page.secondFileRemoveButton.click();
      BrowserUtils.sleep(1);
   }

   @Then("removed files and images are not seen")
   public void removedFilesAndImagesAreNotSeen() {

   }

}
