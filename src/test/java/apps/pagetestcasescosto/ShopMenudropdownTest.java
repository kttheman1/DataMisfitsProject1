package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.costco.HomePage;

public class ShopMenudropdownTest extends CommonAPI {

    @Test(enabled = false)
    public void selectBabyOptionFromShopMenu() {
        getDriver().switchTo().alert().dismiss();
        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();
        homePage.closeEmailTab();

        homePage.searchProduct("toy cars");
        homePage.clickToSearch();
        homePage.selectOptionFromShopMenuDropdown("Baby");

    }

    @Test(enabled = false)
    public void getDropDownlist() {
        getDriver().switchTo().alert().dismiss();
        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();
        homePage.closeEmailTab();

        for (String str : homePage.getHomePageDropdownOptions()) {
            System.out.println(str);
        }

    }

    @Test(enabled = false)
    public void selectComputerOptionFromDropdown() {
        getDriver().switchTo().alert().dismiss();
        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();
        homePage.closeEmailTab();

        homePage.selectOptionFromShopMenuDropdownWithSelectOptions("computer");
        waitFor(5);
    }

    @Test(enabled = false)
    public void selectprinterOptionFromDropdown() {
        getDriver().switchTo().alert().dismiss();
        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();
        homePage.closeEmailTab();
        homePage.selectOptionFromShopMenuDropdownWithGivenText("printer");
        waitFor(5);
    }
}