package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LUE1080_Page {

   public LUE1080_Page() {
      PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy(xpath = "//span[@class='files-name-edit-btn']")
   public WebElement editButton;

   @FindBy(xpath = "//input[@class='files-name-edit-inp']")
   public WebElement nameEdit;

   @FindBy(xpath = "//span[@class='f-wrap']")
   public WebElement fileName;


}
