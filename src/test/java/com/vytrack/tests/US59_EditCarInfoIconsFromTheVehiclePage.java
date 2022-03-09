package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US59_EditCarInfoIconsFromTheVehiclePage {





    @Test
    public void EditCarInfoIcons(){

        VytrackUtils.loginAsDriver();
      //  Driver.getDriver().get("https://qa2.vytrack.com/user/login");

        WebElement fleet = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleet.click();

        WebElement vehicle = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[2]"));
        vehicle.click();

        WebElement threeDots =  Driver.getDriver().findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]"));

       Actions actions = new Actions(Driver.getDriver());

       actions.moveToElement(threeDots).perform();

       WebElement viewIcon = Driver.getDriver().findElement(By.xpath("(//li[@class='launcher-item'])[1]//a[@title='View']"));

        Assert.assertTrue(viewIcon.isDisplayed());


       WebElement editIcon = Driver.getDriver().findElement(By.xpath("(//li[@class='launcher-item'])[2]//a[@title='Edit']"));

       actions.moveToElement(threeDots).perform();

        Assert.assertTrue(editIcon.isDisplayed());

        WebElement deleteIcon = Driver.getDriver().findElement(By.xpath("(//li[@class='launcher-item'])[3]//a[@title='Delete']"));

        actions.moveToElement(threeDots).perform();

        Assert.assertTrue(deleteIcon.isDisplayed());






















    }



}
