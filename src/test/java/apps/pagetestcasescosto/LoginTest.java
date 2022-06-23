package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.costco.HomePage;
import pages.costco.LoginPage;

public class LoginTest extends CommonAPI {

    @Test
    public void signInOrRegister(){

        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();
        homePage.closeEmailTab();
        LoginPage logtoPage = new LoginPage(getDriver());
        logtoPage.clickTosignInTab();
        logtoPage.setname("dilruba@shaw.ca");
        logtoPage.setpassword("Abcd@2022");
        logtoPage.clickSignInBtn();

        String expected ="Add Membership Number | Costco";
        String  actual=logtoPage.getPageTitle();
        Assert.assertEquals(expected,actual);
}






}









