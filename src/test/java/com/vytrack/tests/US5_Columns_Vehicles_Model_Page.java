package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import com.vytrack.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US5_Columns_Vehicles_Model_Page extends TestBase {

    @Test
    public void verify_columns_as_sales_manager() {
        //AC/TC #1: The store manager and sales manager should see 10 columns on the Vehicle Model page.
        //Expected Column names:
        //MODEL NAME, MAKE, CAN BE REQUESTED, CVVI, CO2 FEE (/MONTH), COST (DEPRECIATED),
        //TOTAL COST (DEPRECIATED), CO2 EMISSIONS, FUEL TYPE, VENDORS

        //login as sales manager
        VytrackUtils.loginAsSalesManager();
        //go to Fleet tab
        String fleetTabElementLocator = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]";
        WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetTabElement).perform();
        //select and click Vehicle Model page
        String vehiclesModelModuleLocator = "//span[normalize-space()='Vehicles Model' and contains(@class, 'title title-level-2')]";
        WebElement vehiclesModelElement = Driver.getDriver().findElement(By.xpath(vehiclesModelModuleLocator));
        VytrackUtils.waitTillLoaderMaskDisappear();
        vehiclesModelElement.click();
        VytrackUtils.waitTillLoaderMaskDisappear();
        //verify if managers see 10 columns on the Vehicle Model page
        List<String> actualheadersFromVehicleModelTable = WebTableUtils.getHeadersFromVehicleModelTable();
        List<String> expectedheadersFromVehicleModelTable=new ArrayList<>(Arrays.asList(
                "MODEL NAME",
                "MAKE",
                "CAN BE REQUESTED",
                "CVVI",
                "CO2 FEE (/MONTH)",
                "COST (DEPRECIATED)",
                "TOTAL COST (DEPRECIATED)",
                "CO2 EMISSIONS",
                "FUEL TYPE",
                "VENDORS"
        ));

        //verify header columns
        Assert.assertEquals(actualheadersFromVehicleModelTable, expectedheadersFromVehicleModelTable);

    }

    @Test
    public void test_driver_vehicles_models(){
        // AC/TC #2: Drivers should not able to access the Vehicle Model page, users should see
        // “You do not have permission to perform this action.”

        //login as driver
        VytrackUtils.loginAsDriver();
        //go to Fleet tab
        String fleetTabElementLocator = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]";
        WebElement fleetTabElement = Driver.getDriver().findElement(By.xpath(fleetTabElementLocator));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetTabElement).perform();
        //select and click Vehicle Model page
        String vehiclesModelModuleLocator = "//span[normalize-space()='Vehicles Model' and contains(@class, 'title title-level-2')]";
        WebElement vehiclesModelElement = Driver.getDriver().findElement(By.xpath(vehiclesModelModuleLocator));
        VytrackUtils.waitTillLoaderMaskDisappear();
        vehiclesModelElement.click();
        VytrackUtils.waitTillLoaderMaskDisappear();

        //Drivers should not be able to access the Vehicle Model page, users should see
        // “You do not have permission to perform this action.”
        Assert.assertEquals(Driver.getDriver().getTitle(), "Dashboard");
       WebElement actualWarningMessage = Driver.getDriver().findElement(By.xpath("//div[@data-messenger-namespace = 'eed2dfc230ad3968235b216c8d8c54588cb2f30904a1c179d4416e09dd8008d3']//div"));
       Assert.assertEquals(actualWarningMessage.getText(), "You do not have permission to perform this action.");

    }
    }
