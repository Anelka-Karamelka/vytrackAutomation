package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US61_CreatingRecurringCalendar extends TestBase{


    @Test
    public void test_case_1_as_driver() {
        //logging in Vytrack as truck driver
        VytrackUtils.loginAsDriver();
        //finding "Activities" module
        WebElement activitiesModule = Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[3]"));
        activitiesModule.click();
        //clicking on "Calendar Events" under "Activities" module
        WebElement calendarEvents = Driver.getDriver().findElement(By.xpath("//span[.='Casdadas']"));
        calendarEvents.click();
        //finding and clicking "Create Calendar Event" button
        WebElement createCalendarBtn = Driver.getDriver().findElement(By.xpath("//a[@title='Cdsadasdasdsaadasdasdsadas']"));
        createCalendarBtn.click();
        //finding and checking "Repeat" checkbox
        WebElement repeatCheckBox = Driver.getDriver().findElement(By.xpath("(//fieldset[@class='form-horizontal'])[1]//input[@data-name='recurrence-repeat']"));
        repeatCheckBox.click();
        //locating and asserting if default value is "1"
        WebElement repeatNumber = Driver.getDriver().findElement(By.xpath("(//input[@class='recurrence-subview-control__number'])[1]"));
        Assert.assertEquals(repeatNumber.getAttribute("value"), "1");
    }


    @Test
    public void test_case_2_as_sales_manager(){
        //logging in Vytrack as sales manager
        VytrackUtils.loginAsSalesManager();
        //finding "Activities" module
        WebElement activitiesModule = Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[4]"));
        activitiesModule.click();
        //clicking on "Calendar Events" under "Activities" module
        WebElement calendarEvents = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events']"));
        calendarEvents.click();
        //finding and clicking "Create Calendar Event" button
        WebElement createCalendarBtn = Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));
        createCalendarBtn.click();
        //finding and checking "Repeat" checkbox
        WebElement repeatCheckBox = Driver.getDriver().findElement(By.xpath("(//fieldset[@class='form-horizontal'])[1]//input[@data-name='recurrence-repeat']"));
        repeatCheckBox.click();
        //locating and deleting the default value that is given, so it's empty
        WebElement repeatNumber = Driver.getDriver().findElement(By.xpath("(//input[@class='recurrence-subview-control__number'])[1]"));
        repeatNumber.sendKeys(Keys.BACK_SPACE);
        WebElement randomBtn = Driver.getDriver().findElement(By.xpath("(//input[@type='radio'])[1]"));
        randomBtn.click();
        //locating and asserting if actual Alert Message is the same as expected Alert message
        WebElement messageAlert = Driver.getDriver().findElement(By.xpath("//span[.='This value should not be blank.']"));
        Assert.assertEquals(messageAlert.getText(), "This value should not be blank.");
    }
    @Test
    public void test_case_2_as_store_manager(){
        //logging in Vytrack as store manager
        VytrackUtils.loginAsStoreManger();
        //finding "Activities" module
        WebElement activitiesModule = Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[4]"));
        activitiesModule.click();
        //clicking on "Calendar Events" under "Activities" module
        WebElement calendarEvents = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events']"));
        calendarEvents.click();
        //finding and clicking "Create Calendar Event" button
        WebElement createCalendarBtn = Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));
        createCalendarBtn.click();
        //finding and checking "Repeat" checkbox
        WebElement repeatCheckBox = Driver.getDriver().findElement(By.xpath("(//fieldset[@class='form-horizontal'])[1]//input[@data-name='recurrence-repeat']"));
        repeatCheckBox.click();
        //locating and deleting the default value that is given, so it's empty
        WebElement repeatNumber = Driver.getDriver().findElement(By.xpath("(//input[@class='recurrence-subview-control__number'])[1]"));
        repeatNumber.sendKeys(Keys.BACK_SPACE);
        WebElement randomBtn = Driver.getDriver().findElement(By.xpath("(//input[@type='radio'])[1]"));
        randomBtn.click();
        //locating and asserting if actual Alert Message is the same as expected Alert message
        WebElement messageAlert = Driver.getDriver().findElement(By.xpath("//span[.='This value should not be blank.']"));
        Assert.assertEquals(messageAlert.getText(), "This value should not be blank.");
    }

}
