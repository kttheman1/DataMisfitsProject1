package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HelpAndContactPage;


public class HelpAndContactPageTest extends CommonAPI {
@Test
    public void Helpand() {
        HelpAndContactPage HelpAnd = new HelpAndContactPage(getDriver());
        HelpAnd.setClickOnHelpContact();
        HelpAnd.setBuyingAsaguest();
        HelpAnd.setClickOnHelpContact();
        HelpAnd.setHasntArrived();
        HelpAnd.setClickOnHelpContact();
        HelpAnd.setHackedaccount();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());




    }




}
