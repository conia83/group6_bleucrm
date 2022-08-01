package com.cydeo.step_definitions;
import com.cydeo.pages.CompanyStructurePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginStepDefinitions {

    BrowserUtils browserUtils = new BrowserUtils();

    CompanyStructurePage companyStructurePage = new CompanyStructurePage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("https://qa.azulcrm.com/");
    }

    @When("user enters {string} username")
    public void user_enters_username(String string) {
        companyStructurePage.userName.sendKeys(string);

    }

    @When("user enters {string} password")
    public void user_enters_password(String string) {
        BrowserUtils.sleep(5);
        companyStructurePage.passWord.sendKeys(string);

    }

    @When("user click login button")
    public void user_click_login_button() {
        companyStructurePage.loginBtn.click();

    }

    @When("user should click employee")
    public void user_should_click_employee() {
        BrowserUtils.sleep(5);
        companyStructurePage.employeeBtn.click();

    }


    @Then("user clicks add department button")
    public void userClicksAddDepartmentButton() {
        BrowserUtils.sleep(5);
        companyStructurePage.addDepartBtn.click();
    }



/*
This is one is doesn't work. I changed my steps.

    @Then("user select parent department dropdown")
    public void userSelectsParentDepartmentDropdown(String string) {
        Select select = new Select(LoginPage.parentDropdown);
        select.selectByIndex(2);
        // select.selectByVisibleText(". Cyber Vet");
         }

 */


    /**
     * Here is step 4
     */

    @Then("user close add department pop up")
    public void userCloseAddDepartmentPopUp() {
        CompanyStructurePage.addDeparCloseBtn.click();

    }


    @And("enter child department name {string}")
    public void enterChildDepartmentName(String arg0) {
    }

    @And("user click add button")
    public void userClickAddButton() {
        CompanyStructurePage.addDeparAddbtn.click();
        BrowserUtils.sleep(10);
    }

    @And("user click x icon to delete child department")
    public void userClickXIconToDeleteChildDepartment() {
        CompanyStructurePage.iconDeleteStep6.click();
        BrowserUtils.sleep(5);
        CompanyStructurePage.deleteDeparStep6.click();



       /*
        WebElement elem = Driver.getDriver().findElement(By.xpath("(//a[@title='Oybek'])[1]"));
        Actions ac = new Actions(Driver.getDriver());
        ac.moveToElement(elem).perform();
        BrowserUtils.sleep(3);
        LoginPage.clickDeleteChildBtn.click();

        */


        // LoginPage.iconDeleteChildDepart.click();
    }

    @And("user drag and drop department")
    public void userDragAndDropDepartment() {
        BrowserUtils.sleep(5);
        CompanyStructurePage.class1.doSomething();

    }

    @And("user type {string} in department box")
    public void userTypeInDepartmentBox(String arg0) {
        BrowserUtils.sleep(5);
        CompanyStructurePage.departNameBox.sendKeys("Oybek");

    }

    @And("user select from dropdown {string}")
    public void userSelectFromDropdown(String arg0) {
        //  //option[@value='366']

    }

    @And("user click supervisor {string} select from structure")
    public void userClickSupervisorSelectFromStructure(String arg0) {
        BrowserUtils.sleep(5);
        companyStructurePage.selectFromStr.click();
        BrowserUtils.sleep(5);
        companyStructurePage.selectFromStrEmail.click();


        //Select select = new Select(loginPage.selectFromStrEmail);
        //select.selectByVisibleText("helpdesk23@cybertekschool.com");
    }

    @And("user drag box {string} and drop box {string} department")
    public void userDragBoxAndDropBoxDepartment(String arg0, String arg1) {
        BrowserUtils.sleep(5);
        WebElement hr5 = Driver.getDriver().findElement(By.xpath("(//div[@class='structure-employee-block'])[2]"));
        BrowserUtils.sleep(5);
        WebElement hr1 = Driver.getDriver().findElement(By.xpath("(//div[@class='structure-employee-block'])[3]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(hr5, hr1).perform();
        BrowserUtils.sleep(15);
    }

    @And("user click + icon button to add child department")
    public void userClickIconButtonToAddChildDepartment() {
        WebElement ele = Driver.getDriver().findElement(By.xpath("//a[@title='Cyber Vet']"));
        BrowserUtils.sleep(5);
        Actions ac1 = new Actions(Driver.getDriver());
        ac1.moveToElement(ele).perform();
        BrowserUtils.sleep(10);
        CompanyStructurePage.addChildDepar.click();

        // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(
        //    By.xpath("(//div[@class='structure-add-icon'])[1]")));

        /*
        WebDriverWait t = new WebDriverWait(Driver.getDriver(), 20);
        t.until(ExpectedConditions.visibilityOf(LoginPage.addChildDepar));
        t.until(ExpectedConditions.elementToBeClickable(LoginPage.addChildDepar));
        LoginPage.addChildDepar.click();
    }

         */

    }
}


