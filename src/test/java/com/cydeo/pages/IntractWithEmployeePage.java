package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntractWithEmployeePage {
    public IntractWithEmployeePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement userName;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passWord;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginBtn;

    @FindBy(xpath = "(//a[@class='feed-com-add-link'])[1]")
    public WebElement addComment;
    //(//a[@href='javascript:void(0);'])[1]

    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-sm ui-btn-primary'])[1]")
    public static WebElement addCommentSendBtn;

    @FindBy(xpath = "(//a[@class='bx-ilike-text'])[1]")
    public static WebElement likeBtn;

    @FindBy(xpath = "//a[@href='javascript:void(0);']")
    public static WebElement unfollowBtn;

    @FindBy(xpath = "(//a[@class='bx-ilike-text'])[2]")
    public static WebElement othersLikeBtn;

    @FindBy(xpath = "(//a[@class='feed-com-reply feed-com-reply-Y'])[1]")
    public static WebElement replyBtn;

    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-sm ui-btn-primary'])[1]")
    public static WebElement replySendBtn;

    @FindBy(xpath = "(//span[@class='feed-post-more-text'])[2]")
    public static WebElement moreUnderComment;


    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[1]")
    public static WebElement moreViewComment;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public static WebElement moreCopyLink;

    @FindBy(xpath = "//span[.='Edit']")
    public static WebElement moreEdit;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-sm ui-btn-link']")
    public static WebElement moreEditCancel;

//
    @FindBy(xpath = "//span[.='Create task']")
    public static WebElement moreCreateTask;

    @FindBy(xpath = "//span[.='Delete']")
    public static WebElement moreDelete;
    //span[.='Delete']
    //(//span[@class='menu-popup-item-text'])[4]
    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public static WebElement commentDeleted ;

    @FindBy(xpath = "(//span[@class='bx-contentview-popup-name-new'])[1]")
    public static WebElement viewierEyeIconUnderPost;

    @FindBy(xpath = "(//td[@class='user-profile-block-title'])[1]")
    public static WebElement ProfileContactInfo;

    @FindBy(xpath = "(//div[@class='feed-post-important-switch'])[1]")
    public static WebElement addToFavoritesIcon;









}
