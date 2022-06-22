package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.costco.HomePage;
import pages.costco.LocationPage;
import pages.costco.SearchResultPage;

public class SearchLocationTest extends CommonAPI {

    @Test
    public void searchLocation(){

        getDriver().switchTo().alert().dismiss();
        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();
        homePage.closeEmailTab();
        LocationPage  setLocation =new LocationPage(getDriver());
        setLocation.locationField();
        setLocation.setLocation();
        String text=setLocation.getPageTitle();
        Assert.assertEquals(text,"Find a Warehouse at a Nearby Location | Costco");

    }

}
