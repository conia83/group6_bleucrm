package com.cydeo.step_definitions;

import com.cydeo.pages.LUE1076_Page;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LUE1076_StepDefinitions {

   String pdfFilePath = "C:\\Users\\sonic\\Desktop\\Test Files\\Test PDF.pdf";
   String jpgFilePath = "C:\\Users\\sonic\\Desktop\\Test Files\\Test JPG.jpg";

   LUE1076_Page lue1076Page = new LUE1076_Page();

   @When("user inserts a PDF file to text section")
   public void user_inserts_a_pdf_file_to_text_section() {

      lue1076Page.textSection.sendKeys(pdfFilePath);
      BrowserUtils.sleep(3);
   }

   @When("user inserts a image to text section")
   public void user_inserts_a_image_to_text_section() {
      lue1076Page.textSection.sendKeys(jpgFilePath);
      BrowserUtils.sleep(3);
   }

}
