package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.costco.HomePage;
import pages.costco.SearchResultPage;

import java.util.ArrayList;
import java.util.List;

public class SearchTest  extends CommonAPI {

    @Test(enabled = true)
    public void waterBottleSearch() {
       // getDriver().switchTo().alert().dismiss();
        HomePage homePage =new HomePage(getDriver());
        waitFor(10);
        homePage.setWindowToClose();
        homePage.closeEmailTab();
        SearchResultPage searchProduct=new SearchResultPage(getDriver());
        searchProduct.searchProd("water bottle");
        waitFor(10);
        //<title>water bottle &nbsp;| Costco</title>
        String expectedPageTitle  = searchProduct.getPageTitle();
        Assert.assertEquals("water bottle &nbsp;| Costco",expectedPageTitle);

    }

    @Test(enabled = false)
    public void kitchenBagSearch() {
        //getDriver().switchTo().alert().dismiss();
        HomePage homePage =new HomePage(getDriver());
        waitFor(20);
        homePage.setWindowToClose();
        homePage.closeEmailTab();

        SearchResultPage searchProduct=new SearchResultPage(getDriver());
        searchProduct.searchProd("kitchen bags");
        waitFor(3);
        String expected = "kitchen bags &nbsp;| Costco";
        String actual= searchProduct.getPageTitle();
        Assert.assertEquals(expected,actual);

    }
/*
    @Test(enabled = true)
    public void kirklandItemSearch() {

        getDriver().switchTo().alert().dismiss();
        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();

    }*/
}