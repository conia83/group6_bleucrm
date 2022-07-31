package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LUE1076_Page {


   public LUE1076_Page() {
      PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy(xpath = "/html/body")
   public WebElement textSection;

}
