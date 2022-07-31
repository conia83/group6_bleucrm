package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LUE1078_Page {

   public LUE1078_Page() {
      PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy(xpath = "//label[@class='feed-add-post-files-activity-label']")
   public WebElement recipientEditText;

   @FindBy(xpath = "//*[@id=\"diskuf-edit-rigths-doc\"]")
   public WebElement recipientEditCheckbox;

}
