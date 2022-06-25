package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.SearchbarPage;
import pages.ebay.ToysPage;

public class SearchBarTest extends CommonAPI {

//    @Test
//    public void Search(){
//        SearchbarPage search = new SearchbarPage(getDriver());
//        search.setSearchBar("Tv");
//        search.setSearchButton();
//        search.setFirstItemSelect();
//        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());
//
//    }

    @Test
    public void SearchStuffedAnimal() {
        SearchbarPage search = new SearchbarPage(getDriver());
        search.clickSearchField();
        search.setSearchBar("stuffed bear");
        search.setSearchButton();
        ToysPage toys = new ToysPage(getDriver());
        toys.setStuffedBear();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("ux-textspans ux-textspans--BOLD")).isDisplayed());

    }

    @Test
    public void SearchPokemon() {
        SearchbarPage search = new SearchbarPage(getDriver());
        search.clickSearchField();
        search.setSearchBar("pokemon toys");
        search.setSearchButton();
        ToysPage toys = new ToysPage(getDriver());
        toys.setPokemonToy();
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id='LeftSummaryPanel']/div[1]/div[1]/div/h1/span")).isDisplayed());
    }
    @Test
    public void SearchRemoteControlCar() {
        SearchbarPage search = new SearchbarPage(getDriver());
        search.clickSearchField();
        search.setSearchBar("remote control cars");
        search.setSearchButton();
        ToysPage toys = new ToysPage(getDriver());
        toys.setRemoteControlCar();
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id='LeftSummaryPanel']/div[1]/div[1]/div/h1/span")).isDisplayed());
    }

    @Test
    public void SearchYoYo() {
        SearchbarPage search = new SearchbarPage(getDriver());
        search.clickSearchField();
        search.setSearchBar("yoyo");
        search.setSearchButton();
        ToysPage toys = new ToysPage(getDriver());
        toys.setYoYo();
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id='LeftSummaryPanel']/div[1]/div[1]/div/h1/span")).isDisplayed());
    }
}
