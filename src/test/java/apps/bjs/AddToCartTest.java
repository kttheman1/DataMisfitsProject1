package apps.bjs;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.bjs.HomePage;
import pages.bjs.SearchResultPage;

public class AddToCartTest extends CommonAPI {

    @Test
    public void addWellsleyFarmsEggs() {
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.clickSearchBar();
        homePage.typeSearchTerm("eggs");
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"contentOverlay\"]/div/app-search-main/app-search-result-page-gb/div[2]/app-search-header/div/span/div")).isDisplayed());
        searchResultPage.hoverOverSearchResultWellsleyFarmsEggs(getDriver());
        searchResultPage.clickWellsleyFarmsEggsAddToCartBtn();
        searchResultPage.clickCartBtn();
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"cartProductName\"]")).isDisplayed());

    }



}
