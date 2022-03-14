package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.bouncycastle.util.Store;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US3_PinBar_Functionality extends TestBase {


    //Truck drivers
    @Test
    public void PinBar_Test1() {
        VytrackUtils.login("user38", "UserUser123");
        WebElement LearnSpace = Driver.getDriver().findElement(By.xpath("//*[@id=\"pinbar\"]/div[1]/div/a"));
        LearnSpace.click();

        WebElement verifyTitle = Driver.getDriver().findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/h3"));
        String actualText = verifyTitle.getText();

        String expectedTitle = "How To Use Pinbar";

        Assert.assertEquals(actualText, expectedTitle);

    }

    @Test
    public void PinBar_Test2() {
        VytrackUtils.login("user43", "UserUser123");
        WebElement LearnSpace = Driver.getDriver().findElement(By.xpath("//*[@id=\"pinbar\"]/div[1]/div/a"));
        LearnSpace.click();

        WebElement verifyTitle = Driver.getDriver().findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/h3"));
        String actualText = verifyTitle.getText();

        String expectedTitle = "How To Use Pinbar";

        Assert.assertEquals(actualText, expectedTitle);

    }

    //Store manager
    @Test
    public void PinBar_Test3() {
        VytrackUtils.login("storemanager83", "UserUser123");
        WebElement LearnSpace = Driver.getDriver().findElement(By.xpath("//*[@id=\"pinbar\"]/div[1]/div/a"));
        LearnSpace.click();

        WebElement verifyTitle = Driver.getDriver().findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/h3"));
        String actualText = verifyTitle.getText();

        String expectedTitle = "How To Use Pinbar";

        Assert.assertEquals(actualText, expectedTitle);

    }

    @Test
    public void PinBar_Test4() {
        VytrackUtils.login("storemanager86", "UserUser123");
        WebElement LearnSpace = Driver.getDriver().findElement(By.xpath("//*[@id=\"pinbar\"]/div[1]/div/a"));
        LearnSpace.click();

        WebElement verifyTitle = Driver.getDriver().findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/h3"));
        String actualText = verifyTitle.getText();

        String expectedTitle = "How To Use Pinbar";

        Assert.assertEquals(actualText, expectedTitle);

    }

    //Sales manager
    @Test
    public void PinBar_Test5() {
        VytrackUtils.login("salesmanager129", "UserUser123");
        WebElement LearnSpace = Driver.getDriver().findElement(By.xpath("//*[@id=\"pinbar\"]/div[1]/div/a"));
        LearnSpace.click();

        WebElement verifyTitle = Driver.getDriver().findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/h3"));
        String actualText = verifyTitle.getText();

        String expectedTitle = "How To Use Pinbar";

        Assert.assertEquals(actualText, expectedTitle);

    }

    @Test
    public void PinBar_Test6() {
        VytrackUtils.login("salesmanager132", "UserUser123");
        WebElement LearnSpace = Driver.getDriver().findElement(By.xpath("//*[@id=\"pinbar\"]/div[1]/div/a"));
        LearnSpace.click();

        WebElement verifyTitle = Driver.getDriver().findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/h3"));
        String actualText = verifyTitle.getText();

        String expectedTitle = "How To Use Pinbar";

        Assert.assertEquals(actualText, expectedTitle);

    }


}



