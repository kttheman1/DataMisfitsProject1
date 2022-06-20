package apps.cargurus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cargurus.HomePage;
import pages.cargurus.LogInPage;
import utility.Utility;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Login extends CommonAPI {

    Properties prop = Utility.loadProperties();
    String duration = prop.getProperty("implicit.wait");

    @Test
    public void loginValidCred() {
        HomePage homePage = new HomePage(getDriver());
        LogInPage login = new LogInPage(getDriver());
        homePage.clickSignInBtn();
        login.enterEmail("Ravenn587@aol.com");
        login.enterEmailNextBtn();
        String passwordDecode = Utility.decode("QWJjZDEyMzQqPw==");
        login.enterPassword(passwordDecode);
        login.enterPasswordSignInBtn();
        String actual = homePage.getAccountUserName();
        Assert.assertEquals("RavenN1", actual);


        //Sign out of user profile

        homePage.clickProfileMenuDropDown();
        homePage.signOutProfileUsingDropDown();
        // Assert.assertEquals("Sell your car | It’s free & 100% online | CarGurus - CarGurus", driver.getTitle());
    }

  //  @Test
    public void loginInvalidCred() {
        HomePage homePage = new HomePage(getDriver());
        LogInPage login = new LogInPage(getDriver());
        homePage.clickSignInBtn();
        login.enterEmail("ravenn587@aol.com");
        login.enterEmailNextBtn();
        String passwordDecode = Utility.decode("QWJkMTIzNCo/");
        login.enterPassword(passwordDecode);
        login.enterPasswordSignInBtn();
        String actual = login.invalidPasswordErrorText();
        Assert.assertEquals("Incorrect email address or password", actual);
    }
}
