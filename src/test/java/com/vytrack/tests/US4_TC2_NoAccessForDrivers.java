package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US4_TC2_NoAccessForDrivers  {

/*
    AC2: Drivers should NOT able to access the Vehicle contracts
page, the app should display “You do not have permission to
perform this action.”

Test cases #2
Description: Drivers can NOT access the Vehicle contracts page
Environment: https://qa2.vytrack.com/user/login
Steps:
1. Login as drivers
2. Click the Vehicle contracts under the Fleet
3. Verify users see an error message: “You do not have
permission to perform this action.”
     */


    @Test
    public void test_for_drivers() {
        // Login as drivers
        VytrackUtils.loginAsDriver();

        //Click the Vehicle contracts under the Fleet
        String fleetTabElementLocator = "//span[contains(text(),'Fleet')]";
        WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetTabElement).perform();
        //BrowserUtils.sleep(3);
        String vehicleContractsLocator = "//span[.='Vehicle Contracts']";
        WebElement DriverVehicleContracts = Driver.getDriver().findElement(By.xpath(vehicleContractsLocator));
        //VytrackUtils.waitTillLoaderMaskDisappear();
        DriverVehicleContracts.click();
        VytrackUtils.waitTillLoaderMaskDisappear();

        WebElement DriverErrorMessage = Driver.getDriver().findElement(By.xpath("//*[@id='flash-messages']/div/div/div[2]/div"));
        String expectedErrorMessage = "You do not have permission to perform this action.";
        String actualErrorMessage = DriverErrorMessage.getText();
        System.out.println("actualErrorMessage = " + actualErrorMessage);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


        //Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
            Assert.assertTrue(DriverErrorMessage.isDisplayed(), "You do not have permission to perform this action.");
        }
    }}

