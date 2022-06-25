package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.LoginPage;
import pages.ebay.InvalidLoginPage;

public class InvalidLogin extends CommonAPI {
    @Test
    public void InvalidLoginCred() {
        InvalidLoginPage Ilogin = new InvalidLoginPage(getDriver());
        LoginPage Login = new LoginPage(getDriver());
        Login.signIn();
        Login.clickEmailField();
        Login.enterEmail("kevinsundeep@gmail.com");
        Ilogin.Cbutton();
        Ilogin.enterPassword("Testin123");
        Ilogin.enterPasswordSignInBtn();
        Ilogin.logoBTn();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }

}
