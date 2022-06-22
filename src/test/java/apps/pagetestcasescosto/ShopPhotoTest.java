package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.costco.HomePage;
import pages.costco.ShopPhotoPage;

public class ShopPhotoTest extends CommonAPI {
    @Test
    public void printPhotoTest(){
        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();
        //homePage.closeEmailTab();
        ShopPhotoPage printPhoto=new ShopPhotoPage(getDriver());
        printPhoto.selectPhotoTab();
        printPhoto.shopPhoto();
        printPhoto.printPhoto();
        waitFor(3);
        String expected="Photo Prints | Online Photo Printing | Costco Photo Centre";
        String actual =printPhoto.getPageTitle();
        Assert.assertEquals(expected,actual);
    }
}
