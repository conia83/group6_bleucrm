package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LUE1079_Page {

   public LUE1079_Page() {
      PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy(xpath = "//span[@class='del-but']")
   public WebElement firstFileRemoveButton;

   @FindBy(xpath = "//span[@class='del-but']")
   public WebElement secondFileRemoveButton;

}
