package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.ClothingShoesPages;

public class ClothingShoesPagesTest extends CommonAPI {
  @Test
    public void  ClothingShoes(){
        ClothingShoesPages shoesWomen = new ClothingShoesPages(getDriver());
        shoesWomen.setClothingShoes();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void women(){
        ClothingShoesPages shoesWomen = new ClothingShoesPages(getDriver());
        shoesWomen.setClothingShoes();
        shoesWomen.setWomen();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }
    @Test
    public void allWomen(){
        ClothingShoesPages shoesWomen = new ClothingShoesPages(getDriver());
        shoesWomen.setClothingShoes();
        shoesWomen.setWomen();
        shoesWomen.setSeeAllWomen();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }

}
