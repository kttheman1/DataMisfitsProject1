package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.CommunityPage;

public class CommunityPageTest extends CommonAPI {
    @Test
    public void community(){
        CommunityPage community = new CommunityPage(getDriver());
        community.setCommunity();
       community.setEbayLogo();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void announment(){
        CommunityPage community = new CommunityPage(getDriver());
        community.setAnnounment();
       community.setEbayLogo();
       Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void ebaycommunity(){
        CommunityPage community = new CommunityPage(getDriver());
        community.seteBayCommunity();
       community.setEbayLogo();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void ebaypodcast(){
        CommunityPage community = new CommunityPage(getDriver());
        community.setBusinessPodcast();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }

}
