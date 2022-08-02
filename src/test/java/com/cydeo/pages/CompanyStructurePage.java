package com.cydeo.pages;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyStructurePage {
    public static Actions iconDeleteChildDepart;
    BrowserUtils browserUtils = new BrowserUtils();
    public CompanyStructurePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement userName;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passWord;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginBtn;

    @FindBy(xpath = " //span[contains(text(),'Employees')]")
    public WebElement employeeBtn;

    @FindBy(xpath = " //span[contains(text(),'Add department')]") //span[contains(text(),'Add department')]
    public WebElement addDepartBtn;

    @FindBy(name = "IBLOCK_SECTION_ID")
    public static WebElement parentDropdown;

    //@FindBy(id = "single-user-choice")

    @FindBy(xpath = "//a[@id='single-user-choice']")
    public static WebElement selectFromStr;

    // @FindBy(linkText = "this is a link text")
    // @FindBy(linkText = "javascript:void(0)")
    //@FindBy(linkText = "Select from structure")

    @FindBy(xpath = "//div[@bx-tooltip-user-id='522']")
    public static WebElement selectFromStrEmail;




    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-link" +
            " popup-window-button-link-cancel']")
    public static WebElement addDeparCloseBtn;


    @FindBy(xpath = "(//div[@class='structure-add-icon'])[1]")
    public static WebElement addChildDepar;

    @FindBy(xpath = "//a[@title='23234']")
    public static WebElement DragAndDropsource;

    //@FindBy(xpath = "//a[@title='21124']")
    //public static WebElement drag;

    //@FindBy(xpath = "//a[@title='21125']")
    //public static WebElement drop;

// this one is - i tried to do explicit waits, but couldn't do it.
    //public void waitFor() {
    // BrowserUtils.waitForClickablility(By.xpath("//input[@id='NAME']"), 10);}

    @FindBy(xpath = "(//div[@class='structure-delete-icon'])[3]")
    public static WebElement clickDeleteChildBtn;


    @FindBy(xpath = "//input[@id='NAME']")
    public static WebElement departNameBox;


    @FindBy(xpath = "//span[.='Add']")
    public static WebElement addDeparAddbtn;




    public static class class1{

        public static void doSomething(){

            WebDriver driver = null;
            //WebDriver driver = new ChromeDriver();

            //Element which needs to drag.
            WebElement From=driver.findElement(By.xpath("")); // //span[@id='bx_str_373'] , bx_str_373

            //Element on which need to drop.
            WebElement To=driver.findElement(By.xpath("//a[@title='21125']"));

            //Using Action class for drag and drop.
            Actions act=new Actions(driver);
            act.clickAndHold(From).moveToElement(To).release(To).build().perform();

            //Dragged and dropped.
            // act.dragAndDrop(From, To).build().perform();

        }

        @FindBy(xpath = "(//div[@class='structure-delete-icon'])[3]")
        public WebElement iconDeleteChildDepart;

    }
    @FindBy(xpath = "(//a[@title='Oybek'])[1]")
    public static WebElement iconDeleteStep6;

    @FindBy(xpath = "//a[@class='department-profile-events-item department-profile-remove']")
    public static WebElement deleteDeparStep6;

}
