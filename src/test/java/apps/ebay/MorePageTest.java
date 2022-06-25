package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.MorePage;

public class MorePageTest extends CommonAPI {
    @Test
public void more(){
    MorePage moree = new MorePage(getDriver());
    moree.setMore();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

}
@Test
public void buissnes(){
    MorePage moree = new MorePage(getDriver());
    moree.setHome();
    moree.setBussness();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


}
@Test
public void jewlarly(){
    MorePage moree = new MorePage(getDriver());
    moree.setHome();
   moree.setJewlaaryWath();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

}
@Test
public void ebayefer(){
    MorePage moree = new MorePage(getDriver());
    moree.setHome();
    moree.seteBayRefurbis();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


}
}
