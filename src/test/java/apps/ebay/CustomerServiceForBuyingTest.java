package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.CustomerServiceForBuying;

public class CustomerServiceForBuyingTest extends CommonAPI {
@Test
    public void forBuuing(){
        CustomerServiceForBuying buy = new CustomerServiceForBuying(getDriver());
        buy.setClickOnHelpContact();
     //  buy.setBuingAsGuest();

    // buy.setBuing();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }
    @Test
    public void buying(){
        CustomerServiceForBuying buy = new CustomerServiceForBuying(getDriver());
        buy.setClickOnHelpContact();
        buy.setBuing();
        //buy.setBuingAsGuest();

        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }
    @Test
    public void Asguest(){
        CustomerServiceForBuying buy = new CustomerServiceForBuying(getDriver());
        buy.setClickOnHelpContact();
        buy.setBuing();
        buy.setBuingAsGuest();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());



    }


}
