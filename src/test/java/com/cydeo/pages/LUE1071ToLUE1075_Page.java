package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LUE1071ToLUE1075_Page {

   public LUE1071ToLUE1075_Page() {
      PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy(xpath = "//*[@id=\"bx-b-uploadfile-blogPostForm\"]")
   public WebElement uploadFilesButton;

   @FindBy(xpath = "//input[@name='bxu_files[]']")
   public WebElement uploadFilesSection;

   @FindBy(xpath = "//*[@id=\"blog-submit-button-save\"]")
   public WebElement sendButton;

}
