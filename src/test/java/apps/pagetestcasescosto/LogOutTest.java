package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.costco.HomePage;
import pages.costco.LogoutPage;

public class LogOutTest extends CommonAPI {

    @Test
    public  void checkSignOut(){
        getDriver().switchTo().alert().dismiss();
        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();
        homePage.closeEmailTab();
        LogoutPage logout=new LogoutPage(getDriver());
        logout.goTosign();
        logout.printname("dilruba@shaw.ca");
        logout.printpassword("Abcd@2022");
        logout.setToSign();
        logout.getWindowClose();
        logout.accountTab();
        logout.getSignout();


    }
}
