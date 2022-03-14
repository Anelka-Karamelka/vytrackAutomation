package com.vytrack.tests;
import com.google.common.base.Verify;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import javax.swing.*;

public class US11_ViewCarOdometer {


    @AfterMethod
    public void tearDown(){
        BrowserUtils.sleep(5);
        Driver.closeDriver();

    }
    @Test
    public void managersDoNotHaveAccessToVehicleOdometer(){

        //Log in as store or sales managers
        VytrackUtils.loginAsSalesManager();

        BrowserUtils.sleep(3);
        //Click the “Vehicle Odometers” under the Fleet
        WebElement fleetOption=Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleetOption.click();

        WebElement vehicleOdometer=Driver.getDriver().findElement(By.xpath("//a[@href='/entity/Extend_Entity_VehiclesOdometer']"));
        vehicleOdometer.click();

        //Verify the managers see “You do not have permission to perform this action.”
        String actualMessage=Driver.getDriver().findElement(By.xpath("//div[.='You do not have permission to perform this action.']")).getText();
        String expectedMessage="You do not have permission to perform this action.";
        Assert.assertEquals(actualMessage,expectedMessage);

    }

    @Test
    public void driversSeePageNumberAs1(){

        //Log in as drivers
        VytrackUtils.loginAsDriver();

        //Click the “Vehicle Odometers” under the Fleet
        WebElement fleetOption=Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetOption.click();

        WebElement vehicleOdometer=Driver.getDriver().findElement(By.xpath("(//a[@href='/entity/Extend_Entity_VehiclesOdometer'])[3]"));
        vehicleOdometer.click();

        //Verify the default page number is 1
        String  expectedDefaultPageNumber="1";
        String actualDefaultPageNumber=Driver.getDriver().findElement(By.xpath("//input[@value='1']")).getAttribute("value");
        Assert.assertEquals(actualDefaultPageNumber,expectedDefaultPageNumber);

    }

    @Test
    public void driverSeeViewPerPageAs25(){
        //Log in as drivers
        VytrackUtils.loginAsDriver();

        //Click the “Vehicle Odometers” under the Fleet
        WebElement fleetOption=Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleetOption.click();

        WebElement vehicleOdometer=Driver.getDriver().findElement(By.xpath("(//a[@href='/entity/Extend_Entity_VehiclesOdometer'])[3]"));
        vehicleOdometer.click();

        //Verify the default view per page is 25
        String expectedViewPerPage="25";
        String actualViewPerPage=Driver.getDriver().findElement(By.xpath("//button[@class='btn dropdown-toggle ']")).getText();
        Assert.assertEquals(actualViewPerPage,expectedViewPerPage);
    }

}