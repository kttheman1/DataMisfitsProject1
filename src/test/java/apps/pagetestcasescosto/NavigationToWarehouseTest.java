package apps.pagetestcasescosto;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.costco.HomePage;
import pages.costco.ViewWarehouseSavingsPage;

import java.util.Collections;

public class NavigationToWarehouseTest extends CommonAPI {
    @Test
    public void navigateToWarehouse(){

        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();
        homePage.closeEmailTab();
        ViewWarehouseSavingsPage navigate=new ViewWarehouseSavingsPage (getDriver());
        navigate.warehouseTab();
        navigate.clicktoViewTab();
        String expected ="Great Savings This Week &nbsp;| Costco";
        String actual =navigate.getPageTitle()'
        Assert.assertEquals(expected,actual);

    }

}
