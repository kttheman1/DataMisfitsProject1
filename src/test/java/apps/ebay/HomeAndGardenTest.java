package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomeAndGarden;

public class HomeAndGardenTest extends CommonAPI {
    @Test
    public void home(){
        HomeAndGarden Homegarden = new HomeAndGarden(getDriver());
        Homegarden.setGardenHome();
        //Homegarden.setSeeAllBathroom();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void bathroom(){
        HomeAndGarden Homegarden = new HomeAndGarden(getDriver());
        Homegarden.setGardenHome();
        Homegarden.setBathroom();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());
    }
    @Test
    public void allbathroom(){
        HomeAndGarden Homegarden = new HomeAndGarden(getDriver());

        Homegarden.setGardenHome();
        Homegarden.setBathroom();
        Homegarden.setSeeAllBathroom();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }

}
