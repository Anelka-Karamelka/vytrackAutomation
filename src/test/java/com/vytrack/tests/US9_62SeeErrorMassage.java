package com.vytrack.tests;

import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US9_62SeeErrorMassage {
    @Test
    public void loginAsStoreManager() {
        VytrackUtils.loginAsDriver();
        //Users are on the homepage
        //Click on Activities
        WebElement activities = Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[3]"));
        activities.click();

        //Click the “Calendar Events” under the Activities
        WebElement calendarEvents = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events'] "));
        calendarEvents.click();

        //Click the “Create Calendar Event” button
        WebElement createCalendarEvent = Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));
        createCalendarEvent.click();

        //Check the Repeat checkbox
        WebElement repeatBox = Driver.getDriver().findElement(By.xpath("(//input[@id='recurrence-repeat-view830'])"));
        repeatBox.click();

        //Remove exciting integer 1
        //Users enter an INVALID integer (x>99)
        // Verify users get error messages
        WebElement invalidIntegerBiggerThan99 = Driver.getDriver().findElement(By.xpath("(//input[@class='recurrence-subview-control__number'])[1]"));
        invalidIntegerBiggerThan99.clear();

        int x = 0;
        if (x<1 || x>99) {
            invalidIntegerBiggerThan99.sendKeys("134");
            System.out.println("The value have not to be more than 99.");
        }
     Driver.closeDriver();

    }

    @Test
    public void loginAsDriver() {
        VytrackUtils.loginAsDriver();
        //Users are on the homepage
        //Click on Activities
        WebElement activities = Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[3]"));
        activities.click();

        //Click the “Calendar Events” under the Activities
        WebElement calendarEvents = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events'] "));
        calendarEvents.click();

        //Click the “Create Calendar Event” button
        WebElement createCalendarEvent = Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));
        createCalendarEvent.click();

        //Check the Repeat checkbox
        WebElement repeatBox = Driver.getDriver().findElement(By.xpath("(//input[@id='recurrence-repeat-view830'])"));
        repeatBox.click();

        //Remove exciting integer 1
        //Users enter an INVALID integer (x>99)
        // Verify users get error messages
        WebElement invalidIntegerBiggerThan99 = Driver.getDriver().findElement(By.xpath("(//input[@class='recurrence-subview-control__number'])[1]"));
        invalidIntegerBiggerThan99.clear();

        int x = 0;
        if (x < 1 || x > 99) {
            invalidIntegerBiggerThan99.sendKeys("-2");
            System.out.println("The value have not to be less than 1.");
        }


        Driver.closeDriver();
    }


}





