package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAndGarden extends CommonAPI {
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[6]/a[1]")
    WebElement GardenHome;

    @FindBy(xpath = "//span[contains(text(),'Bathroom Accessories & Supplies')]")
    WebElement Bathroom;

    @FindBy(css = "body.no-touch.skin-large.whitebg.DS6-enabled.flex-lg.gh-1199.gh-979.gh-939.gh-flex:nth-child(2) div.pagecontainer.srp-main--isLarge:nth-child(7) div.pagecontainer__leftnav.b-sidenav div.container:nth-child(1) div.dialog__cell section.b-module.b-list.b-speciallinks.b-display--landscape:nth-child(1) ul:nth-child(2) li.b-links-accordion:nth-chi")
    WebElement seeAllBathroom;

    public HomeAndGarden(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setGardenHome(){
        click(GardenHome);
    }
    public void setBathroom(){
        click(Bathroom);
    }
    public void setSeeAllBathroom(){
        click(seeAllBathroom);
    }
}
