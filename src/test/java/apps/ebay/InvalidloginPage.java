package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.InvalidLoginPage;
import pages.ebay.LoginPage;

public class InvalidloginPage extends CommonAPI {
    @Test
    public void InvalidLoginCred() {
        InvalidLoginPage Ilogin = new InvalidLoginPage(getDriver());
        LoginPage Login = new LoginPage(getDriver());
        Ilogin.Signinup();
        waitFor(6);
        Login.clickEmailField();
        Ilogin.enterEmail("kevinsundeep@gmal.com");
        Ilogin.Cbutton();
        Ilogin.enterPassword("Testin123");
        Ilogin.enterPasswordSignInBtn();
        waitFor(7);
        Ilogin.logoBTn();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }

}
