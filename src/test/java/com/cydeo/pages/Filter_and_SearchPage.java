package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Filter_and_SearchPage {

    public Filter_and_SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='main-ui-filter-sidebar-item']")
    public List<WebElement> defaultFilters;

    @FindBy(xpath = "//*[@class='main-ui-filter-field-add-item']")
    public WebElement addFieldBtn;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-restore-items']")
    public WebElement restoreDefBtn;

    @FindBy(xpath ="//*[@class='main-ui-control main-ui-select']")
    public WebElement dateDropdown;

    @FindBy(xpath = "//div[@class='main-ui-control main-ui-multi-select']")
    public WebElement typeCheck;

    @FindBy(xpath = "//*[@class='main-ui-filter-add-item']")
    public WebElement saveFilterBtn;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")
    public WebElement saveBtn;

    @FindBy(className = "main-ui-select-inner-label")
    public List<WebElement> addFilterCheckboxes;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-light-border main-ui-filter-field-button main-ui-filter-reset']")
    public WebElement resetBtn;

    @FindBy(className = "main-ui-filter-search-filter")
    public WebElement filterSearchBtn;

    @FindBy(xpath = "//input[@class='main-ui-filter-sidebar-edit-control']")
   public WebElement addFilterName;

    @FindBy(xpath = "//span[.='This month']")
    public WebElement selectedDate;

    @FindBy(xpath = "//div[.='Polls']")
    public WebElement typePoll;

    @FindBy(xpath = "//div[.='Appreciations']")
    public WebElement typeAppreciation;

}
