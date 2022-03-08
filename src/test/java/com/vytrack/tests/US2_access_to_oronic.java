package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US2_access_to_oronic extends TestBase {


    @Test
    public void Oroinc1() {
       VytrackUtils.loginAsDriver();
        WebElement DriverOroinc = Driver.getDriver().findElement(By.xpath("//div[@class='container']/ul//li/a"));
        DriverOroinc.click();
      BrowserUtils.verifyTitle(Driver.getDriver(),"Dashboard");

        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('https://doc.oroinc.com/','_blank');");
        BrowserUtils.switchWindowAndVerify(Driver.getDriver(), "Oroinc", "Welcome to Oro Documentation");



    }


    @Test
    public void Oroinc2() {
        VytrackUtils.loginAsSalesManager();
        WebElement SalesManager = Driver.getDriver().findElement(By.xpath("//div[@class='container']/ul//li/a"));
        SalesManager.click();
        BrowserUtils.verifyTitle(Driver.getDriver(),"Dashboard");

        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('https://doc.oroinc.com/','_blank');");
        BrowserUtils.switchWindowAndVerify(Driver.getDriver(), "Oroinc", "Welcome to Oro Documentation");



    }



    @Test
    public void Oroinc3() {
        VytrackUtils.loginAsStoreManger();
        WebElement StoreManger = Driver.getDriver().findElement(By.xpath("//div[@class='container']/ul//li/a"));
        StoreManger.click();
        BrowserUtils.verifyTitle(Driver.getDriver(), "Dashboard");

        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('https://doc.oroinc.com/','_blank');");
        BrowserUtils.switchWindowAndVerify(Driver.getDriver(), "Oroinc", "Welcome to Oro Documentation");
    }


}

//Story2: As a user, I should be access to the Oroinc
//        Documentation page. (Window handle)
//        AC #1: users access the Oronic Documentation page by
//        clicking the question icon. The page URL:https://doc.oroinc.com/

//    Test cases #1
//        Description: users access the Oronic Documentation page
//        Environment: https://qa2.vytrack.com/user/login
//        Steps:
//        1. Users are on the homepage
//        2. Click the question icon on the right top of the homepage
//        3. Verify the users access to the Oronic Documentation page








