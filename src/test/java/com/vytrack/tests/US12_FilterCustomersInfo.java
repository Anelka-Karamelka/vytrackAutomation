package com.vytrack.tests;


import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US12_FilterCustomersInfo {

@Test
public void compareFilterNames() {

        //Step 1 : Logging in as sales manager
        VytrackUtils.loginAsSalesManager();

        //Step 2 : Go to Customers tab
        String customersTabElementLocator = "//span[normalize-space()='Customers' and contains(@class, 'title title-level-1')]";
        WebElement customersTabElement = Driver.getDriver().findElement(By.xpath(customersTabElementLocator));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(customersTabElement).perform();

        //Step3 : Accounts option under Customers tab
        String accountsModuleLocator = "//span[normalize-space()='Accounts' and contains(@class, 'title title-level-2')]";
        WebElement accountsElement = Driver.getDriver().findElement(By.xpath(accountsModuleLocator));

        //Wait till load
        VytrackUtils.waitTillLoaderMaskDisappear();
        accountsElement.click();


        WebElement filtersButton = Driver.getDriver().findElement(By.xpath("//a[@title='Filters']"));
        filtersButton.click();


        List<WebElement> filterNames = Driver.getDriver().findElements(By.xpath("//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']"));
        List<String> actualFilterNamesTexts = new ArrayList<>();



        for (WebElement each : filterNames) {
        String filterNamesTexts = each.getText();
        actualFilterNamesTexts.add(filterNamesTexts.replace(": All", ""));
        }


        List<String> expectedFilterNamesTexts = new ArrayList<>(Arrays.asList(
        "Account Name",
        "Contact Name",
        "Contact Email",
        "Contact Phone",
        "Owner",
        "Business Unit",
        "Created At",
        "Updated At"
        ));


        //Verify the names match
        Assert.assertEquals(actualFilterNamesTexts, expectedFilterNamesTexts);


        }

        }

