package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US4_TC1_ManagersAccessTo_VehicleContractsPage extends TestBase {
    @Test
    public void test_for_salesManager() {

        //Login as  sales manager
        VytrackUtils.loginAsSalesManager();
        //Click the Vehicle contracts under the Fleet
        String fleetTabElementLocator = "//span[contains(text(),'Fleet')]";
        WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetTabElement).perform();
        BrowserUtils.sleep(3);
        String vehicleContractsLocator = "//span[.='Vehicle Contracts']";
        WebElement DriverVehicleContracts = Driver.getDriver().findElement(By.xpath(vehicleContractsLocator));
        //VytrackUtils.waitTillLoaderMaskDisappear();
        DriverVehicleContracts.click();
        VytrackUtils.waitTillLoaderMaskDisappear();


        //Verify managers can access the Vehicle contracts page
        //Expected URL:
        //https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract


        String expectedURL = "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract";
        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedURL, actualURL);

        //6- Verify title equals:
        //Expected:All - Vehicle Contract - Entities - System - Car -Entities - System

        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("Actual title: " + actualTitle);
       // Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test
    public void test_for_storeManager() {

        //Login as  storemanager
        VytrackUtils.loginAsStoreManger();
        //Click the Vehicle contracts under the Fleet
        String fleetTabElementLocator = "//span[contains(text(),'Fleet')]";
        WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetTabElement).perform();
        //BrowserUtils.sleep(3);
        String vehicleContractsLocator = "//span[.='Vehicle Contracts']";
        WebElement DriverVehicleContracts = Driver.getDriver().findElement(By.xpath(vehicleContractsLocator));
        VytrackUtils.waitTillLoaderMaskDisappear();
        DriverVehicleContracts.click();
        VytrackUtils.waitTillLoaderMaskDisappear();


        //Verify managers can access the Vehicle contracts page
        //Expected URL:
        //https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract


        String expectedURL = "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract";
        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedURL, actualURL);

        //6- Verify title equals:
        //Expected:All - Vehicle Contract - Entities - System - Car -Entities - System
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(By.xpath("//a[@title='Create Vehicle Contract']"))));
        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("Actual title: " + actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}

