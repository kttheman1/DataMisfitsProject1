package apps.pagetestcasescosto;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.costco.HomePage;
import pages.costco.ViewWarehouseSavingsPage;

import java.util.Collections;

public class NavigationToWarehouseTest extends CommonAPI {
    @Test
    public void navigateToWarehouse(){

        getDriver().switchTo().alert().dismiss();
        getDriver().findElement(By.xpath("//*[@id=language-region-set")).click();
        HomePage homePage =new HomePage(getDriver());
        //homePage.setWindowToClose();
        homePage.closeEmailTab();
        ViewWarehouseSavingsPage navigate=new ViewWarehouseSavingsPage (getDriver());
        navigate.warehouseTab();
        navigate.clicktoViewTab();

    }

}
