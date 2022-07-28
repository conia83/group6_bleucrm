package com.cydeo.step_definitions;

import com.cydeo.pages.LUE1071ToLUE1075_Page;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;

public class LUE1074_StepDefinitions {

   String jpgFilePath = "C:\\Users\\sonic\\Desktop\\Test Files\\Test JPG.jpg";

   LUE1071ToLUE1075_Page page = new LUE1071ToLUE1075_Page();

   @And("user sends a JPG file to Upload files and images section")
   public void userSendsAJPGFileToUploadFilesAndImagesSection() {
      page.uploadFilesSection.sendKeys(jpgFilePath);
      BrowserUtils.sleep(3);
   }

}
