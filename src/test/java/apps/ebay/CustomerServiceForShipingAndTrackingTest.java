package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.CustomerServiceForShipingAndTracking;

public class CustomerServiceForShipingAndTrackingTest extends CommonAPI {
    @Test
    public void shpping(){
        CustomerServiceForShipingAndTracking ShipT = new CustomerServiceForShipingAndTracking(getDriver());
        ShipT.setClickOnHelpContact();
       // ShipT.setTracyourItem();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void ship(){
        CustomerServiceForShipingAndTracking ShipT = new CustomerServiceForShipingAndTracking(getDriver());
        ShipT.setClickOnHelpContact();
        ShipT.setShping();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }
    @Test
    public void TracyourItem(){
        CustomerServiceForShipingAndTracking ShipT = new CustomerServiceForShipingAndTracking(getDriver());
        ShipT.setClickOnHelpContact();
        ShipT.setShping();
        ShipT.setTracyourItem();

        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }

}
