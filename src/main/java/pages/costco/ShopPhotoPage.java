package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPhotoPage extends CommonAPI {

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
    }

    public  void shopPhoto(){
        click(shopPhotoTab);
    }
    public  void printPhoto(){
        click(printTab);
    }


}
