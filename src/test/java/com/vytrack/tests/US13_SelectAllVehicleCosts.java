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

public class US13_SelectAllVehicleCosts extends TestBase {

    @Test
    public void columns_on_the_Vehicle_page_Driver() {

//   users see 3 columns on the Vehicle Model
//   1-  Users are on the homepage
        VytrackUtils.loginAsDriver();
        WebElement fleet = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleet.click();

        //  2. Click the Vehicle Costs under the Fleet
        WebElement vehicleCoste = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[3]"));
        vehicleCoste.click();


        //    3. Verify there are 3 columns on the table:
        List<WebElement> columns = Driver.getDriver().findElements(By.xpath("//a[@class='grid-header-cell__link']"));
        List<String> actualTextsOfWebElements = new ArrayList<>();

        for (WebElement element : columns) {
            actualTextsOfWebElements.add(element.getText());
        }
        // Expected Column names: TYPE, TOTAL PRICE, DATE
        List<String> expectedTextsOfWebElements = new ArrayList<>(Arrays.asList("TYPE", "TOTAL PRICE", "DATE"));

        Assert.assertEquals(actualTextsOfWebElements, expectedTextsOfWebElements);

    }

        @Test
        public void columns_on_the_Vehicle_page_StoreManger() {
//  users see 3 columns on the Vehicle Model
//   1-  Users are on the homepage
            VytrackUtils.loginAsStoreManger();
            WebElement fleet = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
            fleet.click();


            //  2. Click the Vehicle Costs under the Fleet
            WebElement vehicleCost = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[5]"));
            vehicleCost.click();


            //    3. Verify there are 3 columns on the table:
            List<WebElement> columns = Driver.getDriver().findElements(By.xpath("//a[@class='grid-header-cell__link']"));
            List<String> actualTextsOfWebElements = new ArrayList<>();

            for (WebElement element : columns) {
                actualTextsOfWebElements.add(element.getText());
            }
            //  Expected Column names: TYPE, TOTAL PRICE, DATE
            List<String> expectedTextsOfWebElements = new ArrayList<>(Arrays.asList("TYPE", "TOTAL PRICE", "DATE"));
            Assert.assertEquals(actualTextsOfWebElements, expectedTextsOfWebElements);


        }

        @Test
        public void columns_on_the_Vehicle_page_SalesManager () {

//   users see 3 columns on the Vehicle Model
//   1-  Users are on the homepage
            VytrackUtils.loginAsSalesManager();
            WebElement fleet = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
            fleet.click();

            //  2. Click the Vehicle Costs under the Fleet
            WebElement vehicleCost = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[5]"));
            vehicleCost.click();


            //    3. Verify there are 3 columns on the table:
            List<WebElement> columns = Driver.getDriver().findElements(By.xpath("//a[@class='grid-header-cell__link']"));
            List<String> actualTextsOfWebElements = new ArrayList<>();

            for (WebElement element : columns) {
                actualTextsOfWebElements.add(element.getText());
            }
            //   Expected Column names: TYPE, TOTAL PRICE, DATE
            List<String> expectedTextsOfWebElements = new ArrayList<>(Arrays.asList("TYPE", "TOTAL PRICE", "DATE"));
            Assert.assertEquals(actualTextsOfWebElements, expectedTextsOfWebElements);


        }


    }
