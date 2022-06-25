package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.CollectiblesArtPage;

public class CollectiblesArtPageTest extends CommonAPI {
    @Test
    public void Art(){
        CollectiblesArtPage art = new CollectiblesArtPage(getDriver());
        art.setMainContent();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void Antiq(){
        CollectiblesArtPage art = new CollectiblesArtPage(getDriver());
        art.setMainContent();
        art.setAntiques();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }
    @Test
    public void seeAntiq(){
        CollectiblesArtPage art = new CollectiblesArtPage(getDriver());
        art.setMainContent();
        art.setAntiques();

        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());
    }
}
