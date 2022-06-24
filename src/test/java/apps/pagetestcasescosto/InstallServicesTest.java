package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.costco.HomePage;
import pages.costco.InstallServicesPage;

public class InstallServicesTest extends CommonAPI {
    @Test
    public  void callToInstall(){
        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();
        homePage.closeEmailTab();

        InstallServicesPage install=new InstallServicesPage(getDriver());
        install.servicesTab();
        install.selectOptions();
        install.selectTocall();
        String expected ="Installation Services | Costco";
        String actual = install.getPageTitle();
        Assert.assertEquals(expected,actual);
    }


}
