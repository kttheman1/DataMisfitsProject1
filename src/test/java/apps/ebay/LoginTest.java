package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.loginPage;

public class LoginTest extends CommonAPI {

    @Test
    public void validLoginCred() {
        loginPage Login = new loginPage(getDriver());
        Login.Signinup();
        waitFor(6);
        Login.enterEmail("kevinsundeep@gmail.com");
        Login.Cbutton();
        Login.enterPassword("Testing@123");
        Login.enterPasswordSignInBtn();
        waitFor(7);
        Login.findlater();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }
}
