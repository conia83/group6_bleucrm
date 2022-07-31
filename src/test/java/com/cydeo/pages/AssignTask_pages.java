package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AssignTask_pages {

    public AssignTask_pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "bx_left_menu_menu_tasks")
    public WebElement TasksButton;

    @FindBy(id="tasks-buttonAdd")
    public WebElement NewTaskButton;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement taskName;

    @FindBy(id = "tasks-task-priority-cb")
    public WebElement highPriorityCheckbox;

    @FindBy(xpath = "(//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-filled task-form-field-link add'])[1]")
    public WebElement addMoreButton;

    @FindBy(name= "ACTION[0][ARGUMENTS][data][TITLE]")
    public WebElement thingsToDo;

    @FindBy(xpath = "//a[contains(@id,'U512')]")
    public WebElement recipient;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeButton;

    @FindBy(xpath = "//button[@class=\"ui-btn ui-btn-success\"]")
    public WebElement addTaskButton;

    @FindBy(xpath = "//a[@class=\"task-title task-status-text-color-accepted\"]")
    public WebElement verifyTask1;

    @FindBy(xpath="//iframe[starts-with(@id,'iframe')]")
    public WebElement Iframe;

    @FindBy(xpath = "//a[@href=\"/company/personal/user/693/tasks/?F_CANCEL=Y&F_STATE=sRg00&clear_filter=Y\"]")
    public WebElement SetByMe;

    @FindBy(xpath = "//a[starts-with(@id,'destDepartmentTab')]")
    public WebElement EmployeesAndDepartment;

    @FindBy(xpath = "//a[@href=\"#U790\"]")
    public WebElement recipientInEaD;

    @FindBy(xpath = "//span[@class=\"popup-window-close-icon\"]")
    public WebElement EaDcloseButton;

    @FindBy(id = "destEmailTab_-740733135")
    public WebElement EmailUsersbutton;

    @FindBy(xpath = "(//a[@rel=\"U790\"])[2]")
    public WebElement SecondEmail;


    @FindBy(xpath = "//table[@id=\"TASKS_GRID_ROLE_ID_4096_0_ADVANCED_N_table\"]/tbody/tr[1]/td[3]//a")
    public WebElement WebTable;

    @FindBy(xpath = "//iframe[starts-with(@id,'iframe')]")
    public WebElement IframeWebtable;

    @FindBy(xpath = "//table[@id='task-list-table']//tbody/tr[1]/td[5]")
    public WebElement emailInIframe1;

    @FindBy(xpath = "//table[@id='task-list-table']//tbody/tr[2]/td[5]")
    public WebElement emailInIframe2;

    @FindBy(xpath = "//table[@class='main-grid-panel-table']//tr/td[2]//span[2]")
    public WebElement count1;



}
