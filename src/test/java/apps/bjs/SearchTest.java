package apps.bjs;

import base.CommonAPI;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;
import pages.ebay.SearchResultPage;

public class SearchTest extends CommonAPI {

    @Test
    public void searchBarWorks() {
    HomePage homePage = new HomePage(getDriver());
    homePage.clickSearchBar();
    homePage.typeSearchTerm("eggs");
    homePage.clickSearchBtn();
    Assert.assertTrue(getDriver().findElement(By.xpath("//*[@id=\"contentOverlay\"]/div/app-search-main/app-search-result-page-gb/div[2]/app-search-header/div/span/div")).isDisplayed());

}

    @Test
    public void searchLandOLakesEggs() {
    HomePage homePage = new HomePage(getDriver());
    SearchResultPage searchResultPage = new SearchResultPage(getDriver());
    homePage.clickSearchBar();
    homePage.typeSearchTerm("Land O Lakes eggs");
    homePage.clickSearchBtn();
    Assert.assertTrue(getDriver().findElement(By.cssSelector("mz-thumb-selected dark-bg mz-thumb")).isDisplayed());

}



    }
