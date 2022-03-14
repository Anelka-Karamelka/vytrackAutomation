package com.vytrack.tests;


import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class US10_CreateCalendarEvent extends TestBase {
    //Users are on the homepage

    @Test
    public void US10(){
        VytrackUtils.loginAsStoreManger();

        WebElement activities = Driver.getDriver().findElement(By.xpath("//li[5]/a/span[@class='title title-level-1']"));
        Actions actions = new Actions(Driver.getDriver());


        //Login Hover Over the "Activities" -> click on "Calendar Events"
        actions.moveToElement(activities).perform();


        //Click the “Calendar Events” under the Activities

        WebElement activities_calendarEvent = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events' and @class='title title-level-2']"));
        BrowserUtils.sleep(1);
        activities_calendarEvent.click();

        BrowserUtils.sleep(3);


        //Click the “Create Calendar Event” button
        WebElement create_calendarEventBtn = Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));//not clickable
        BrowserUtils.sleep(2);
        create_calendarEventBtn.click();
        BrowserUtils.sleep(2);


        //Locate the iframe
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@title='Rich Text Area. Press ALT-F9 for menu. Press ALT-F10 for toolbar. Press ALT-0 for help']")));
        BrowserUtils.sleep(3);
        //locate p tag
        WebElement userInput = Driver.getDriver().findElement(By.xpath("//p"));

        //Write a message in the Description field
        userInput.sendKeys("Description ");
        BrowserUtils.sleep(2);


        //Verify the message is written in the input box
        Assert.assertTrue(userInput.isDisplayed());
        //   System.out.println("userInput.isDisplayed() = " + userInput.isDisplayed());






    }
    @AfterMethod
    public void TearDown(){
        Driver.closeDriver();
    }




}