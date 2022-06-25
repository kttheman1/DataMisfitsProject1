package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.LoginPage;

public class LoginTest extends CommonAPI {


    @Test
    public void validLoginCred() {
        LoginPage Login = new LoginPage(getDriver());
        waitFor(7);
        Login.signIn();
        waitFor(7);
        Login.clickEmailField();
        Login.enterEmail("kevinsundeep@gmail.com");
        Login.Cbutton();
        Login.enterPassword("Testing@123");
        Login.enterPasswordSignInBtn();
        waitFor(7);
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }

}
