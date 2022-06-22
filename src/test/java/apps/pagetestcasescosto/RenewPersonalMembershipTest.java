package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.costco.RenewPersonalMembershipPage;
import pages.costco.ShopMembershipPage;

public class RenewPersonalMembershipTest extends CommonAPI {

    @Test
    public  void renewalPersonalMembership(){

        RenewPersonalMembershipPage renew=new RenewPersonalMembershipPage(getDriver());
        renew.selectMemebership();
        renew.selectPersonalMembership();
        renew.selectExecutiveMembership();
        String actualPage=renew.getPageTitle();
        String expectedPage ="Sign In | Costco";
        Assert.assertEquals(expectedPage,actualPage);

    }
}
