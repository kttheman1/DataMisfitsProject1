package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchbarPage extends CommonAPI {
 @FindBy(css = "#gh-ac")
    WebElement searchBar;
@FindBy(css = "#gh-btn")
WebElement searchButton;
@FindBy(css = "body.s-page.no-touch.skin-large.srp--list-view.no-touch.skin-large.srp-top-nav.srp-left-nav.gh-1199.gh-979.gh-939.gh-899.gh-799.gh-flex:nth-child(2) div.srp-main.srp-main--isLarge:nth-child(14) div.srp-main-content.clearfix.srp-main-content--flex div.srp-river.srp-layout-inner:nth-child(2) div.srp-river-main.clearfix div.srp-river-results.clearfix:nth-child(2) ul.srp-results.srp-list.clearfix:nth-child(1) li.s-item.s-item__pl-on-bottom.s-item--watch-at-corner:nth-child(2) div.s-item__wrapper.clearfix div.s-item__info.clearfix a.s-item__link > h3.s-item__title")
WebElement firstItemSelect;




    public SearchbarPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

public void setSearchBar(String text){ type(searchBar,text); }

    public void clickSearchField() {click(searchBar);}

public void setSearchButton(){
        click(searchButton);
}

public void setFirstItemSelect(){
        click(firstItemSelect);
}
}
