package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US13_TC2_VehicleCostsAreChecked extends TestBase {


    @Test
    public void vehicle_Costs_Are_Check_AsDriver() {

        VytrackUtils.loginAsDriver();

        WebElement fleet = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleet.click();

        WebElement vehicleCoste = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[3]"));
        vehicleCoste.click();

        //Driver doesn't have checkbox for Vehicle Costs under the Fleet 3,

    }




    @Test
    public void vehicle_Costs_Are_Check_AsStoreManger() {

        VytrackUtils.loginAsStoreManger();

        WebElement fleet = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleet.click();

        WebElement vehicleCoste = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[6]"));
        vehicleCoste.click();

        //        2. Click the Vehicle Costs under the Fleet 3. Click the first checkbox
        WebElement dropDown=Driver.getDriver().findElement(By.xpath("(//i[@class='caret'])[2]"));
        dropDown.click();

        WebElement allSelect = Driver.getDriver().findElement(By.linkText("All"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

//  4. Verify all the vehicle costs are checked
     //   BrowserUtils.sleep(5);
        js.executeScript("arguments[0].scrollIntoView(true)", allSelect);
        allSelect.click();



    }

    @Test
    public void vehicle_Costs_Are_Check_AsSalesMange() {

        VytrackUtils.loginAsSalesManager();

        WebElement fleet = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleet.click();

        WebElement vehicleCost = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-2'])[6]"));
        vehicleCost.click();

//        2. Click the Vehicle Costs under the Fleet 3. Click the first checkbox
        WebElement dropDown=Driver.getDriver().findElement(By.xpath("(//i[@class='caret'])[2]"));
        dropDown.click();

        WebElement allSelect = Driver.getDriver().findElement(By.linkText("All"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

       // 4. Verify all the vehicle costs are checked
        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", allSelect);
        allSelect.click();


    }


}
