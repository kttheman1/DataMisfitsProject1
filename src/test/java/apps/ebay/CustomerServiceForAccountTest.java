package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.CustomerServiceForAccount;

public class CustomerServiceForAccountTest extends CommonAPI {
    @Test
    public void account(){
        CustomerServiceForAccount Account = new CustomerServiceForAccount(getDriver());
        Account.setClickOnHelpContact();
      //  Account.setAccount();
       // Account.setResetyourPass();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void SetAccount(){
        CustomerServiceForAccount Account = new CustomerServiceForAccount(getDriver());
        Account.setClickOnHelpContact();
        Account.setAccount();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void ResetPass(){
        CustomerServiceForAccount Account = new CustomerServiceForAccount(getDriver());
        Account.setClickOnHelpContact();
        Account.setAccount();
        Account.setResetyourPass();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());
    }
}
