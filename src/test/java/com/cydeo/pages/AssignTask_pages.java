package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "(//div[@class='bx-finder-box-item-t7-name'])[1]")
    public WebElement recipient;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeButton;

    @FindBy(xpath = "//button[@class=\"ui-btn ui-btn-success\"]")
    public WebElement addTaskButton;

    @FindBy(xpath = "//a[@class=\"task-title task-status-text-color-accepted\"]")
    public WebElement verifyTask1;

    @FindBy(xpath = "//iframe[starts-with(@id,'iframe')]")
    public WebElement Iframe;


}
