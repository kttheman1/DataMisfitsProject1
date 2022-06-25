package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.CommunityPage;

public class CommunityPageTest extends CommonAPI {
    @Test
    public void community(){
        CommunityPage nityy = new CommunityPage(getDriver());
        nityy.setCommunity();
       // nityy.setEbayLogo();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void announment(){
        CommunityPage nityy = new CommunityPage(getDriver());
        nityy.setAnnounment();
       // nityy.setEbayLogo();
       // Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void ebaycommunity(){
        CommunityPage nityy = new CommunityPage(getDriver());
        nityy.seteBayCommunity();
       // nityy.setEbayLogo();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void ebaypodcast(){
        CommunityPage nityy = new CommunityPage(getDriver());
        nityy.setBusinessPodcast();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }

}
