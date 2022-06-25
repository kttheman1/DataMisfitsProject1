package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.BuyAndAddCartPage;
import pages.ebay.LoginPage;

public class AddcartPageTest extends CommonAPI {
    @Test(priority = 1)
    public void login() {
        LoginPage log = new LoginPage(getDriver());
        LoginPage Login = new LoginPage(getDriver());
        Login.signIn();
        waitFor(6);
        Login.enterEmail("kevinsundeep@gmail.com");
        Login.Cbutton();
        Login.enterPassword("Testing@123");
        Login.enterPasswordSignInBtn();
        waitFor(7);
        Login.findlater();
        BuyAndAddCartPage buyAndAddCartPage = new BuyAndAddCartPage(getDriver());
        buyAndAddCartPage.setHensegg();
        buyAndAddCartPage.setAddtoCart();
        buyAndAddCartPage.setGotoCart();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }

    @Test(priority = 2)
    public void ClickHens() {
        BuyAndAddCartPage hen = new BuyAndAddCartPage(getDriver());
        hen.setHensegg();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }

    @Test(priority = 3)
    public void addcart() {
        BuyAndAddCartPage hen = new BuyAndAddCartPage(getDriver());
        hen.setAddtoCart();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }

    @Test(priority = 4)
    public void GotoCart() {
        BuyAndAddCartPage hen = new BuyAndAddCartPage(getDriver());
        hen.setGotoCart();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }

}
