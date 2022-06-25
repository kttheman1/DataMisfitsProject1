package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.ToysPage;

public class ToysPageTest extends CommonAPI {
    @Test
    public void Toy(){
        ToysPage toy = new ToysPage(getDriver());
        toy.setToy();
       // toy.setActionFigure();
       // toy.setSeeActionFigure();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void onfiq(){
        ToysPage toy = new ToysPage(getDriver());
        toy.setToy();
        toy.setActionFigure();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());
    }
    @Test
    public void ssseA(){
        ToysPage toy = new ToysPage(getDriver());
        toy.setToy();
        toy.setActionFigure();
        toy.setSeeActionFigure();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }
}
