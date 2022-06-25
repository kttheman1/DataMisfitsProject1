package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.BrandOutletPage;

public class BrandOutletPageTest extends CommonAPI {
    @Test
    public void brandOutlet(){
        BrandOutletPage outlet = new BrandOutletPage(getDriver());
        outlet.setBrandOutlet();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

        //outlet.setClothing();
       // outlet.setChampionUPtoFity();
    }
@Test
    public void Clothing(){
    BrandOutletPage outlet = new BrandOutletPage(getDriver());
    outlet.setBrandOutlet();
    outlet.setClothing();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


}
@Test
    public void champion(){
    BrandOutletPage outlet = new BrandOutletPage(getDriver());
   outlet.setBrandOutlet();
    outlet.setClothing();
    outlet.setChampionUPtoFity();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

}
@Test
    public void hanes(){
    BrandOutletPage outlet = new BrandOutletPage(getDriver());
    outlet.setBrandOutlet();
    outlet.setClothing();
    outlet.setHanesUpToSixFive();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

}
@Test
    public void superdry(){
    BrandOutletPage outlet = new BrandOutletPage(getDriver());
    outlet.setBrandOutlet();
    outlet.setClothing();
    outlet.setSuperdryUpToFifty();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


}
@Test
    public void volcom(){
    BrandOutletPage outlet = new BrandOutletPage(getDriver());
    outlet.setBrandOutlet();
    outlet.setClothing();
    outlet.setVolcomUpToThirty();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());



}
@Test
public void FootwearApprel(){
    BrandOutletPage outlet = new BrandOutletPage(getDriver());
    outlet.setBrandOutlet();
    outlet.setFootwearApprel();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());



}
@Test
    public void Asis(){
    BrandOutletPage outlet = new BrandOutletPage(getDriver());
    outlet.setBrandOutlet();
    outlet.setFootwearApprel();
    outlet.setASISUptoSixty();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

}
@Test
    public void Crocs(){
    BrandOutletPage outlet = new BrandOutletPage(getDriver());
    outlet.setBrandOutlet();
    outlet.setFootwearApprel();
    outlet.setCrocsUptoForty();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


}
@Test
    public void Keds(){
    BrandOutletPage outlet = new BrandOutletPage(getDriver());
    outlet.setBrandOutlet();
    outlet.setFootwearApprel();
    outlet.setKedsUptoFif();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


}
@Test
    public void Puma(){
    BrandOutletPage outlet = new BrandOutletPage(getDriver());
    outlet.setBrandOutlet();
    outlet.setFootwearApprel();
    outlet.setPumaUptoSity();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

}
@Test
    public void Reebok(){
    BrandOutletPage outlet = new BrandOutletPage(getDriver());
    outlet.setBrandOutlet();
    outlet.setFootwearApprel();
    outlet.setReebookUptoForty();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

}
@Test
    public void sauony(){
    BrandOutletPage outlet = new BrandOutletPage(getDriver());
    outlet.setBrandOutlet();
    outlet.setFootwearApprel();
    outlet.setSauconyUptoFif();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

}

}
