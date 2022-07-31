package com.cydeo.step_definitions;

import com.cydeo.pages.LUE1078_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LUE1078_StepDefinitions {

   LUE1078_Page lue1078Page = new LUE1078_Page();

   @Then("Allow a recipient to edit documents? checkbox is selected")
   public void allowARecipientToEditDocumentsCheckboxIsSelected() {
      Assert.assertEquals(lue1078Page.recipientEditText.getText(), "Allow a recipient to edit documents?");
      lue1078Page.recipientEditCheckbox.isSelected();

   }

}
