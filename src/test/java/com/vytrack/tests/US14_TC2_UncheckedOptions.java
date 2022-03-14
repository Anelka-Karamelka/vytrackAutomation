package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US14_TC2_UncheckedOptions extends TestBase {
    @Test
    public void test_for_salesManager() {
        VytrackUtils.loginAsSalesManager();

        // Find and Click the Campaigns under the Marketing
        WebElement DriverMarketing = Driver.getDriver().findElement(By.xpath("//div[@id='main-menu']/ul/li[6]"));
        DriverMarketing.click();
        WebElement DriverCampaigns = Driver.getDriver().findElement(By.xpath("//span[.='Campaigns']"));
        DriverCampaigns.click();

        //Find and Click the Manager filters button
        WebElement DriverFiltersBtn = Driver.getDriver().findElement(By.xpath("//i[@class='fa-filter hide-text']"));
        DriverFiltersBtn.click();
        WebElement DriverManageFilters = Driver.getDriver().findElement(By.xpath("//a[@class='add-filter-button']"));
        DriverManageFilters.click();

        //Find the dropbox and checkbox with options
        WebElement DriverMultiselectDropdown = Driver.getDriver().findElement(By.xpath("//div[@class='ui-multiselect-menu ui-corner-all select-filter-widget dropdown-menu']"));


        //by checking the checkbox we can Uncheck one or more filter options
        WebElement DriverCheckbox2 = Driver.getDriver().findElement(By.xpath("//input[@id='ui-multiselect-0-0-option-1']"));
        DriverCheckbox2.click();


        WebElement DriverCheckbox3 = Driver.getDriver().findElement(By.xpath("//input[@title='Start Date']"));
        DriverCheckbox3.click();

        // locating all checkBoxes
        List<WebElement> allCheckBoxes= Driver.getDriver().findElements(By.xpath("//input[contains (@id,'column-c')]"));
        //Assert if the checkBoxes are selected
        allCheckBoxes.forEach(p-> Assert.assertTrue(p.isSelected()));

        //Verify one or more options are unchecked

        for (int i = 0; i < allCheckBoxes.size()-1; i++) {
            allCheckBoxes.get(i).click();
            Assert.assertTrue(!(allCheckBoxes.get(i).isSelected()));

        }
    }
    @Test
    public void test_for_storeManager() {
        VytrackUtils.loginAsStoreManger();

        // Find and Click the Campaigns under the Marketing
        WebElement DriverMarketing = Driver.getDriver().findElement(By.xpath("//div[@id='main-menu']/ul/li[6]"));
        DriverMarketing.click();
        WebElement DriverCampaigns = Driver.getDriver().findElement(By.xpath("//span[.='Campaigns']"));
        DriverCampaigns.click();

        //Find and Click the Manager filters button
        WebElement DriverFiltersBtn = Driver.getDriver().findElement(By.xpath("//i[@class='fa-filter hide-text']"));
        DriverFiltersBtn.click();
        WebElement DriverManageFilters = Driver.getDriver().findElement(By.xpath("//a[@class='add-filter-button']"));
        DriverManageFilters.click();

        //Find the dropbox and checkbox with options
        WebElement DriverMultiselectDropdown = Driver.getDriver().findElement(By.xpath("//div[@class='ui-multiselect-menu ui-corner-all select-filter-widget dropdown-menu']"));


        //by checking the checkbox we can Uncheck one or more filter options
        WebElement DriverCheckbox2 = Driver.getDriver().findElement(By.xpath("//input[@id='ui-multiselect-0-0-option-1']"));
        DriverCheckbox2.click();

        WebElement DriverCheckbox3 = Driver.getDriver().findElement(By.xpath("//input[@title='Start Date']"));
        DriverCheckbox3.click();

        // locating all checkBoxes
        List<WebElement> allCheckBoxes= Driver.getDriver().findElements(By.xpath("//input[contains (@id,'column-c')]"));
        //Assert if the checkBoxes are selected
        allCheckBoxes.forEach(p-> Assert.assertTrue(p.isSelected()));

        //Verify one or more options are unchecked

        for (int i = 0; i < allCheckBoxes.size()-1; i++) {
            allCheckBoxes.get(i).click();
            Assert.assertTrue(!(allCheckBoxes.get(i).isSelected()));





        }


    }}


