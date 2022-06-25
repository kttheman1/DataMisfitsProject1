package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.CustomerServiceForSelling;

public class CustomerServiceForSellingTest extends CommonAPI {
@Test
    public void selling(){
        CustomerServiceForSelling Sell = new CustomerServiceForSelling(getDriver());
        Sell.setClickOnHelpContact();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void sell(){
        CustomerServiceForSelling Sell = new CustomerServiceForSelling(getDriver());
        Sell.setClickOnHelpContact();
        Sell.setSelling();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }
    @Test
    public void sellOnebay(){
        CustomerServiceForSelling Sell = new CustomerServiceForSelling(getDriver());
        Sell.setClickOnHelpContact();
        Sell.setSelling();
        Sell.setSellingOnEbay();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());



    }
}
