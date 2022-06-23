package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShopPhotoPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(ShopPhotoPage.class);
    @FindBy(xpath="//*[@id='navigation-widget']/div/nav/div[6]")
    private WebElement photoTab;

    @FindBy (xpath="//*[@id='visit-external-link-button']")
    private  WebElement shopPhotoTab;

    @FindBy(xpath="//*[@id='upload_link_2']")
    private  WebElement printTab;
    public ShopPhotoPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public  void selectPhotoTab(){
        click(photoTab);
        LOG.info("select photo tab");
    }

    public  void shopPhoto(){
        click(shopPhotoTab);
        LOG.info("shop photo");
    }
    public  void printPhoto(){
        click(printTab);
        LOG.info("print options");
    }


}
