package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US14_TC1_CheckedByDefault {
    /*
  Test cases #1
Description: managers see default checked filters on the
Campaigns page
Environment: https://qa2.vytrack.com/user/login
Steps:
1. Users are on the homepage
2. Click the Campaigns under the Marketing
3. Click the Manage filters button
4. Verify 5 options are checked by default
   */
    @Test
    public void test_for_salesManager() {

        //1. Users are on the homepage
        VytrackUtils.loginAsSalesManager();

        //2. Click the Campaigns under the Marketing
        String marketingTabElementLocator = "//span[normalize-space()='Marketing' and contains(@class, 'title title-level-1')]";

        WebElement marketingTab = Driver.getDriver().findElement(By.xpath(marketingTabElementLocator));
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(marketingTab).perform();
        BrowserUtils.sleep(3);

        String CampaignsTabLocator = "//span[normalize-space()='Campaigns' and contains(@class, 'title title-level-2')]";
        WebElement CampaignsTab = Driver.getDriver().findElement(By.xpath(CampaignsTabLocator));
        //we are using for waiting until loader mask disappearing
        //VytrackUtils.waitTillLoaderMaskDisappear();
        CampaignsTab.click();
        VytrackUtils.waitTillLoaderMaskDisappear();

        //3. Click the Manage filters button
        WebElement DriverFiltersBtn = Driver.getDriver().findElement(By.xpath("//i[@class='fa-filter hide-text']"));
        DriverFiltersBtn.click();
        WebElement DriverManageFiltersDrop = Driver.getDriver().findElement(By.xpath("//a[@class='add-filter-button']"));
        DriverManageFiltersDrop.click();

        // locating all checkBoxes
        List<WebElement> allCheckBoxes = Driver.getDriver().findElements(By.xpath("//input[contains (@id,'column-c')]"));
        //Assert if the checkBoxes are selected
        allCheckBoxes.forEach(p -> Assert.assertTrue(p.isSelected()));

    }

    @Test
    public void test_for_storeManager() {

        //1. Users are on the homepage
        VytrackUtils.loginAsStoreManger();

        //2. Click the Campaigns under the Marketing
        String marketingTabElementLocator ="//span[normalize-space()='Marketing' and contains(@class, 'title title-level-1')]";

        WebElement marketingTab = Driver.getDriver().findElement(By.xpath(marketingTabElementLocator));
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(marketingTab).perform();
        BrowserUtils.sleep(3);

        String CampaignsTabLocator = "//span[normalize-space()='Campaigns' and contains(@class, 'title title-level-2')]";
        WebElement CampaignsTab = Driver.getDriver().findElement(By.xpath(CampaignsTabLocator ));
        //we are using for waiting until loader mask disappearing
        VytrackUtils.waitTillLoaderMaskDisappear();
        CampaignsTab.click();
        //VytrackUtils.waitTillLoaderMaskDisappear();

        //3. Click the Manage filters button
        WebElement DriverFiltersBtn = Driver.getDriver().findElement(By.xpath("//i[@class='fa-filter hide-text']"));
        DriverFiltersBtn.click();
        WebElement DriverManageFiltersDrop = Driver.getDriver().findElement(By.xpath("//a[@class='add-filter-button']"));
        DriverManageFiltersDrop.click();

        // locating all checkBoxes
        List<WebElement> allCheckBoxes= Driver.getDriver().findElements(By.xpath("//input[contains (@id,'column-c')]"));
        //Assert if the checkBoxes are selected
        allCheckBoxes.forEach(p-> Assert.assertTrue(p.isSelected()));






    }}


