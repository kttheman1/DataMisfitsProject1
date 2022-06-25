package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.SearchbarPage;

public class SearchbarPageTest extends CommonAPI {
    @Test
    public void Search(){
        SearchbarPage search = new SearchbarPage(getDriver());
        search.setSearchBar("Tv");
        search.setSearchButton();
       // search.setFirstItemSelect();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }

}
