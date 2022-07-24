package com.cydeo.step_definitions;

import com.cydeo.pages.Filter_and_SearchPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class filterAndSearch_step_def {
    LoginPage login = new LoginPage();
    Filter_and_SearchPage filter = new Filter_and_SearchPage();

    String filterName = "Company";

    @Given("as a user I am on the BleuCRM homepage")
    public void as_a_user_i_am_on_the_bleu_crm_homepage() {
        login.loginHomePage();
        BrowserUtils.waitFor(2);
    }

    @When("I click filter and search input box")
    public void i_click_filter_and_search_input_box() {
        filter.filterSearchBtn.click();
        BrowserUtils.waitFor(1);
    }

    @Then("I should see following as default filters")
    public void I_should_see_following_as_default_filters(List<String> expectedDefaultFilters) {
        List<String> actualDefaultFilters = BrowserUtils.getElementsText(By.xpath("//div[@class='main-ui-filter-sidebar-item']"));
        Assert.assertEquals(expectedDefaultFilters, actualDefaultFilters);
    }


    @When("I click add field button")
    public void i_click_add_field_button() {
        List<WebElement> extraFilterCheckboxes = filter.addFilterCheckboxes;
        filter.addFieldBtn.click();
    }

    @When("I see checkboxes")
    public void i_see_checkboxes() {
        List<WebElement> extraFilterCheckboxes = filter.addFilterCheckboxes;
        for (WebElement eachCheckBox : extraFilterCheckboxes) {
            Assert.assertTrue(eachCheckBox.isDisplayed());
        }
    }

    @Then("I should be able to select and deselect fields")
    public void i_should_be_able_to_select_and_deselect_fields() {
        List<WebElement> extraFilterCheckboxes = filter.addFilterCheckboxes;
        for (WebElement eachCheckBox : extraFilterCheckboxes) {
            Assert.assertTrue(eachCheckBox.isEnabled());
        }
    }


    @When("I click date dropdown menu")
    public void i_click_date_dropdown_menu() {
        filter.dateDropdown.click();
        String wantedElement = "Yesterday";
        WebElement dateDropDown = Driver.getDriver().findElement(By.xpath("//div[@class='main-ui-select-inner-item-element' and text()='" + wantedElement + "']"));
        dateDropDown.click();

    }

    @Then("I should be able to see selected date on menu")
    public void i_should_be_able_to_see_selected_date_on_menu() {
        WebElement yesterday = Driver.getDriver().findElement(By.xpath("//span[.='Yesterday']"));
        Assert.assertTrue(yesterday.isDisplayed());
    }

    @And("I click type dropdown and check multiple types")
    public void I_Click_Type_Dropdown_And_Check_Multiple_Types() {
        filter.typeCheck.click();
        Driver.getDriver().findElement(By.xpath("//div[.='Polls']")).click();
        Driver.getDriver().findElement(By.xpath("//div[.='Appreciations']")).click();
    }

    @Then("I should be able to see checked types")
    public void I_Should_Be_AbleTo_See_CheckedTypes() {

        Assert.assertTrue(filter.typeAppreciation.isDisplayed());
        Assert.assertTrue(filter.typePoll.isDisplayed());

    }

    @When("I click save filter button")
    public void i_click_save_filter_button() {
        filter.saveFilterBtn.click();
        filter.addFilterName.click();
        String filterName = "Company";
        filter.addFilterName.sendKeys(filterName + Keys.ENTER);
    }

    @Then("I should see my new search filter name on default filters")
    public void i_should_see_my_new_search_filter_name_on_default_filters() {

        WebElement newFilter = Driver.getDriver().findElement(By.xpath("//span[.='" + filterName + "']"));
        Assert.assertTrue(newFilter.isDisplayed());
    }

    @When("I click Restore default fields button")
    public void i_click_restore_default_fields_button() {
        filter.restoreDefBtn.click();
    }

    @Then("I should see filters as default type")
    public void I_should_see_filters_as_default_type() {

        WebElement newFilter = Driver.getDriver().findElement(By.xpath("//span[.='" + filterName + "']"));
        Assert.assertFalse(newFilter.isDisplayed());

    }

    @When("I click Reset button")
    public void i_click_reset_button() {
        filter.resetBtn.click();
        BrowserUtils.waitFor(2);
    }

    @Then("I should not see my selected filters")
    public void i_should_not_see_my_selected_filters() {

        Assert.assertFalse(filter.typeAppreciation.isDisplayed());
        Assert.assertFalse(filter.typePoll.isDisplayed());

    }


}

