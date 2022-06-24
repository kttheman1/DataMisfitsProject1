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
        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();
        SearchResultPage searchProduct=new SearchResultPage(getDriver());
        searchProduct.searchProd("water bottle");
        waitFor(5);
        String expectedPageTitle  = searchProduct.getPageTitle();
        Assert.assertEquals("water bottle &nbsp;| Costco",expectedPageTitle);

    }

    @Test(enabled = false)
    public void kitchenBagSearch() {
        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();

        SearchResultPage searchProduct=new SearchResultPage(getDriver());
        searchProduct.searchProd("kitchen bags");
        waitFor(3);
        String expected = "kitchen bags &nbsp;| Costco";
        String actual= searchProduct.getPageTitle();
        Assert.assertEquals(expected,actual);

    }

    @Test(enabled = false)
    public void kirklandItemSearch() {
        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();
        SearchResultPage searchProduct=new SearchResultPage(getDriver());
        searchProduct.searchProd("Kirkland ");

    }
}
