package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyAndAddCartPage extends CommonAPI {
    @FindBy(xpath = "//body[1]/div[6]/div[7]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]/img[1]")
    WebElement hensegg;
    @FindBy(xpath = "//a[@id='atcRedesignId_btn']")
    WebElement AddtoCart;
    @FindBy(css = "body.vi-contv2.lhdr-ie-.vi-hd-ops.vi-wide-watch-btn.vi-ds3-global.vi-bb-flex.label-right-align.vi-bb-btnclr1.vi-ds6.vi-bb-r-btn.vi-white-spacing.vi-rounded-btns.vi-long-cta:nth-child(2) div.atcOlay.oly.old:nth-child(24) div.body div.oly_container div.oly_upnl div.atc-layer-wrapper div.atc-layer-container div.app-atc-layer-redesign-content-wrapper div.app-atc-layer__actionRow > a.btn.btn-scnd.vi-VR-btnWdth-XL:nth-child(2)")
    WebElement GotoCart;
    public BuyAndAddCartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setHensegg(){
        click(hensegg);
    }
    //  LOG.info("clicked on hensegg");
    public void setAddtoCart(){
        click(AddtoCart);
    }
    //  LOG.info("clicked on add to cart");
    public void setGotoCart(){
        click(GotoCart);
    }
    //  LOG.info("clicked on go to cart");

}
