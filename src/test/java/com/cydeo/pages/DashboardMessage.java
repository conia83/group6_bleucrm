package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

;

public class DashboardMessage {


    public DashboardMessage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageTab;

    @FindBy(id = "POST_TITLE")
    public WebElement title;


    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement iframeMessage;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;




    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement errorMessage;



    @FindBy(xpath = "//span[.='Edit']")
    public WebElement edit;

    // @FindBy(xpath = "//a[@class='feed-add-destination-link']")
    @FindBy(xpath = "//*[@id='bx-destination-tag']")
    public WebElement addMore;

    @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
    public WebElement allEmployeesBtn;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement deleteRecipients;




    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[3]/div[2]/div[1]/div/div[1]/div[2]/span/span[2]")
    public WebElement toAllEmployees;




    @FindBy(linkText = "Add persons, groups or department")
    public WebElement addPerson;

    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-info']" )
    public List<WebElement> recentPerson;

    @FindBy(linkText = "Employees and departments")
    public WebElement employeesAndDepartmentsTab;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-name']")
    public List<WebElement> employeesAndDepartments;


    @FindBy(linkText = "E-mail users")
    public WebElement emailUsers;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement emailInput;

    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name']")
    public WebElement email;





    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;










    @FindBy(xpath= "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[3]/div[2]/div[1]/div/div[1]/div[5]/div/a/span[1]")
    public WebElement more;

    @FindBy(xpath = "//span[text()='Delete']")
    public WebElement delete;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public List<WebElement> popupMenu;


    @FindBy(xpath = "//*[text() = 'The post has been deleted.']")
    public WebElement deleteMessage;



}

