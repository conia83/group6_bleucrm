package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PollPage {
    public PollPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id= "feed-add-post-form-tab-vote")
    public WebElement pollTab;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/ol/li[1]/div[2]/span[1]/span[1]")
    public WebElement allEmployees;

    @FindBy(id="bx-destination-tag")
    public WebElement addMore;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement employessAndDepartmentsTab;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-name']")
    public List<WebElement> employeesandDepartments;

    @FindBy(xpath="//div[@class='feed-add-post-destination-wrap']")
    public WebElement toBox;

    @FindBy(id="question_0")
    public WebElement question1;

    @FindBy(id="answer_0__0_")
    public WebElement ans1;

    @FindBy(id="answer_0__1_")
    public WebElement ans2;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[2]/div[1]/div/div/a")
    public WebElement addQuestionButton;

    @FindBy(id="question_1")
    public WebElement question2;

    @FindBy(id="answer_1__0_")
    public WebElement secQuestionAns;

    @FindBy(id="multi_0")
    public WebElement firstAllowMultipleCoiceBox;

    @FindBy(id="multi_1")
    public WebElement secondAllowMultipleCoiceBox;

    @FindBy(xpath ="//a[@class='bx-finder-box-tab bx-lm-tab-last bx-finder-box-tab-selected']")
    public List<WebElement> Recent;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-sonetgroup bx-finder-box-tab-selected']")
    public List<WebElement> MyGroups;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-email']")
    public List<WebElement> emailUsers;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeSign;


    @FindBy(id="blog-submit-button-save")
    public WebElement send;

    @FindBy(xpath ="//span[@class='feed-add-info-text']")
    public WebElement messageallert;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath="//body[@contenteditable='true']")
    public WebElement frametext;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement allEmployeesSign;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement personErrorMessage;

    @FindBy(xpath="//span[@class='feed-add-info-text']")
    public WebElement questionErrorMessage;

    @FindBy(xpath="//span[@class='feed-add-info-text']")
    public WebElement ansErrorMessage;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-lg ui-btn-primary']")
    public  WebElement vote;
}
