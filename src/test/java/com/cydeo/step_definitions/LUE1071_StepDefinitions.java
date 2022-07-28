package com.cydeo.step_definitions;

import com.cydeo.pages.LUE1071AndLUE1073_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LUE1071_StepDefinitions {

   String docFilePath = "C:\\Users\\sonic\\Desktop\\Test Files\\Test DOC.docx";
   String pdfFilePath = "C:\\Users\\sonic\\Desktop\\Test Files\\Test PDF.pdf";
   String txtFilePath = "C:\\Users\\sonic\\Desktop\\Test Files\\Test TXT.txt";

   LUE1071AndLUE1073_Page uploadingDifferentFormatsPage = new LUE1071AndLUE1073_Page();

   @When("user clicks on the upload files button")
   public void user_clicks_on_the_upload_files_button() {
      uploadingDifferentFormatsPage.uploadFilesButton.click();
      BrowserUtils.sleep(1);
   }

   @And("user sends a DOC file to Upload files and images section")
   public void userSendsADOCFileToUploadFilesAndImagesSection() {
      uploadingDifferentFormatsPage.uploadFilesSection.sendKeys(docFilePath);
      BrowserUtils.sleep(3);
   }

   @And("user sends a PDF file to Upload files and images section")
   public void userSendsAPDFFileToUploadFilesAndImagesSection() {
      uploadingDifferentFormatsPage.uploadFilesSection.sendKeys(pdfFilePath);
      BrowserUtils.sleep(3);
   }

   @And("user sends a TXT file to Upload files and images section")
   public void userSendsATXTFileToUploadFilesAndImagesSection() {
      uploadingDifferentFormatsPage.uploadFilesSection.sendKeys(txtFilePath);
      BrowserUtils.sleep(3);
   }

   @And("user clicks the send button")
   public void userClicksTheSendButton() {
      uploadingDifferentFormatsPage.sendButton.click();
      BrowserUtils.sleep(1);
   }

   @Then("all of the uploaded files are seen on the Active Stream")
   public void allOfTheUploadedFilesAreSeenOnTheActiveStream() {

      try {
         List<WebElement> uploadList = Driver.getDriver().findElements(By.xpath("//td[@class='files-name']"));
         for (WebElement each : uploadList) {
            Assert.assertTrue(each.isDisplayed());
         }

      } catch (StaleElementReferenceException e) {
      }
      BrowserUtils.waitFor(5);

   }

}
