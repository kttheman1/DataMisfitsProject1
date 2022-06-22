package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.costco.HomePage;
import pages.costco.LoginPage;

public class LoginValidationTest extends CommonAPI {

    @Test(enabled = false)
    public void validateLoginPage(){
        getDriver().switchTo().alert().dismiss();
        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();
        homePage.closeEmailTab();
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.hoverOverFloatingMenu(getDriver());
        homePage.clickSignIn();
        Assert.assertFalse(loginPage.checkLogoIsPresent());
        //loginPage.checkLogoIsPresent();
        }



    }


