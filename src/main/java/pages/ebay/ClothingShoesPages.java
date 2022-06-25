package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClothingShoesPages extends CommonAPI {
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[7]/a[1]")
    WebElement ClothingShoes;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[1]/button[1]")
    WebElement Women;

    @FindBy(css = "body.no-touch.skin-large.whitebg.DS6-enabled.flex-lg.gh-1199.gh-979.gh-939.gh-flex:nth-child(2) div.pagecontainer.srp-main--isLarge:nth-child(7) div.pagecontainer__leftnav.b-sidenav div.container:nth-child(1) div.dialog__cell section.b-module.b-list.b-speciallinks.b-display--landscape:nth-child(1) ul:nth-child(2) li.b-links-accordion:nth-child(1) ul.b-accordion-subtree li:nth-child(2) > a.b-textlink.b-textlink--sibling")
    WebElement seeAllWomen;

    public ClothingShoesPages(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setClothingShoes(){
        click(ClothingShoes);
    }
    //  LOG.info("clicked on clothing/shoes");
    public void setWomen(){
        click(Women);
    }
    //  LOG.info("clicked on women");
    public void setSeeAllWomen(){
        click(seeAllWomen);
    }
    //  LOG.info("clicked on see all women");

}
