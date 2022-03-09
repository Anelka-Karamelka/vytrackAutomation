package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US54_AccessToMainModules extends TestBase {

    //testing modules for sale manager
    @Test
    public void test_verify_sales_manager(){
        VytrackUtils.loginAsSalesManager();
        List<WebElement> moduleElements = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
        List<String> actualModuleTexts=new ArrayList<>();

        for (WebElement each : moduleElements) {
            String moduleElementText = each.getText();
            actualModuleTexts.add(moduleElementText);
        }

        List<String> expectedModuleTexts=new ArrayList<>(Arrays.asList(
                "Dashboards",
                "Fleet",
                "Customers",
                "Sales",
                "Activities",
                "Marketing",
                "Reports & Segments",
                "System"));

       Assert.assertEquals(actualModuleTexts, expectedModuleTexts);
    }

    //testing modules for store managers
    @Test
    public void test_verify_store_managers(){
        VytrackUtils.loginAsStoreManger();
        List<WebElement> moduleElements= Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
        List<String> actualModuleTexts=new ArrayList<>();

        for (WebElement each : moduleElements) {
            String moduleElementTexts= each.getText();
            actualModuleTexts.add(moduleElementTexts);
        }
        List<String> expectedModuleTexts=new ArrayList<>(Arrays.asList(
                "Dashboards",
                "Fleet",
                "Customers",
                "Sales",
                "Activities",
                "Marketing",
                "Reports & Segments",
                "System"));
        Assert.assertEquals(actualModuleTexts,expectedModuleTexts);
        }

        //testing modules as a driver
        @Test
        public void test_verify_driver(){
        VytrackUtils.loginAsDriver();
        List<WebElement> moduleElements=Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
        List<String> actualModuleText= new ArrayList<>();
            for (WebElement each : moduleElements) {
                String moduleElementText=each.getText();
                actualModuleText.add(moduleElementText);
            }

            List<String> expectedModuleText=new ArrayList<>(Arrays.asList(
                "Fleet",
                "Customers",
               "Activities",
               "System"));
            Assert.assertEquals(actualModuleText,expectedModuleText);
    }


}
