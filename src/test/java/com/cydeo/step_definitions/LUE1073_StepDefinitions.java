package com.cydeo.step_definitions;

import com.cydeo.pages.LUE1071ToLUE1075_Page;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.When;

public class LUE1073_StepDefinitions {

   String docFilePath = "C:\\Users\\sonic\\Desktop\\Test Files\\Test DOC.docx";
   String pdfFilePath = "C:\\Users\\sonic\\Desktop\\Test Files\\Test PDF.pdf";
   String txtFilePath = "C:\\Users\\sonic\\Desktop\\Test Files\\Test TXT.txt";

   LUE1071ToLUE1075_Page lue1071Page = new LUE1071ToLUE1075_Page();

   @When("user sends {int} files at the same time to Upload files and images section")
   public void user_sends_files_at_the_same_time_to_upload_files_and_images_section(Integer int1) {
      lue1071Page.uploadFilesSection.sendKeys(docFilePath);
      lue1071Page.uploadFilesSection.sendKeys(pdfFilePath);
      lue1071Page.uploadFilesSection.sendKeys(txtFilePath);
      BrowserUtils.sleep(5);

   }

}
