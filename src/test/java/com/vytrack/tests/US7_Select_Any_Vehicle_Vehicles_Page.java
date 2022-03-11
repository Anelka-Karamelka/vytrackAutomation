package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US7_Select_Any_Vehicle_Vehicles_Page extends TestBase {
    @Test
    public void uncheckedBoxes_SalesManager_Test1() {

        VytrackUtils.loginAsSalesManager();

        BrowserUtils.sleep(2);
        WebElement fleet = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleet).perform();

        BrowserUtils.sleep(2);
        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();

        BrowserUtils.sleep(2);
        List<WebElement> allCheckBox = Driver.getDriver().findElements(By.xpath("//button[@class='btn btn-default btn-small dropdown-toggle']"));

        VytrackUtils.waitTillLoaderMaskDisappear();

        for (WebElement checkBox : allCheckBox) {
            Assert.assertTrue(!checkBox.isSelected());

        }


    }

    @Test

    public void checkedAllBoxes_SalesManager_Test2() {

        VytrackUtils.loginAsSalesManager();

        BrowserUtils.sleep(2);
        WebElement fleet = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleet).perform();

        BrowserUtils.sleep(2);
        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();

        BrowserUtils.sleep(2);



        List<WebElement> allCheckBox = Driver.getDriver().findElements(By.xpath("//tr//td/input[@type='checkbox']"));
        WebElement checkBox = Driver.getDriver().findElement(By.xpath("//div/button[@class='btn btn-default btn-small dropdown-toggle']"));
        checkBox.click();
        WebElement select = Driver.getDriver().findElement(By.linkText("All"));
        select.click();

        for (WebElement eachCheckBox : allCheckBox) {

            Assert.assertTrue(eachCheckBox.isSelected());

        }


    }

    @Test
    public void selectAnyCar_SalesManager_Test3() {

        VytrackUtils.loginAsSalesManager();

        BrowserUtils.sleep(2);
        WebElement fleet = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleet).perform();

        BrowserUtils.sleep(2);
        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();

        BrowserUtils.sleep(2);
        VytrackUtils.waitTillLoaderMaskDisappear();

        BrowserUtils.sleep(2);
        WebElement oneCheckBox = Driver.getDriver().findElement(By.xpath("//td/input[@type='checkbox']"));
        oneCheckBox.click();

        Assert.assertTrue(oneCheckBox.isSelected());

    }

    @Test
    public void uncheckedBoxes_StoreManager_Test4() {

        VytrackUtils.loginAsStoreManger();

        BrowserUtils.sleep(2);
        WebElement fleet = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleet).perform();

        BrowserUtils.sleep(2);
        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();

        BrowserUtils.sleep(2);
        List<WebElement> allCheckBox = Driver.getDriver().findElements(By.xpath("//button[@class='btn btn-default btn-small dropdown-toggle']"));

        VytrackUtils.waitTillLoaderMaskDisappear();

        for (WebElement checkBox : allCheckBox) {
            Assert.assertTrue(!checkBox.isSelected());

        }


    }

    @Test

    public void checkedAllBoxes_StoreManager_Test5() {

        VytrackUtils.loginAsStoreManger();

        BrowserUtils.sleep(2);
        WebElement fleet = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleet).perform();

        BrowserUtils.sleep(2);
        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();

        BrowserUtils.sleep(2);

        List<WebElement> allCheckBox = Driver.getDriver().findElements(By.xpath("//tr//td/input[@type='checkbox']"));
        WebElement checkBox = Driver.getDriver().findElement(By.xpath("//div/button[@class='btn btn-default btn-small dropdown-toggle']"));
        checkBox.click();
        WebElement select = Driver.getDriver().findElement(By.linkText("All"));
        select.click();

        for (WebElement eachCheckBox : allCheckBox) {

            Assert.assertTrue(eachCheckBox.isSelected());

        }


    }

    @Test
    public void selectAnyCar_StoreManager_Test6() {

        VytrackUtils.loginAsStoreManger();

        BrowserUtils.sleep(2);
        WebElement fleet = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleet).perform();

        BrowserUtils.sleep(2);
        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();

        BrowserUtils.sleep(2);
        VytrackUtils.waitTillLoaderMaskDisappear();

        BrowserUtils.sleep(2);
        WebElement oneCheckBox = Driver.getDriver().findElement(By.xpath("//td/input[@type='checkbox']"));
        oneCheckBox.click();

        Assert.assertTrue(oneCheckBox.isSelected());

    }



}
