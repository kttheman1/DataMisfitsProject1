package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.costco.HomePage;
import pages.costco.ShopMembershipPage;

import java.util.Collections;

public class ShopMembershipTest extends CommonAPI {
    @Test
    public  void buyMembership(){
        HomePage homePage =new HomePage(getDriver());
        homePage.setWindowToClose();
        homePage.closeEmailTab();

        ShopMembershipPage buymembership =new ShopMembershipPage(getDriver());
        buymembership.hoverTomemberTab();
        buymembership.buymembershipTab();
        buymembership.selectmembershipTab();

    }
}
