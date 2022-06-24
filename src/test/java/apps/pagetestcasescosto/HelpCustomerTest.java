package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.costco.HomePage;
import pages.costco.NavigateToCustomerServicePage;

public class HelpCustomerTest extends CommonAPI {
    @Test
    public void helpCustomerService(){
        getDriver().switchTo().alert().dismiss();
        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();
        homePage.closeEmailTab();
        NavigateToCustomerServicePage customerService= new NavigateToCustomerServicePage(getDriver());
        customerService.helpCustomer();
        String text =customerService.getPageTitle();
        Assert.assertEquals(text,"Costco Customer Service");

    }
}
