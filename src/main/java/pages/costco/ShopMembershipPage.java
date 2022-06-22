package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopMembershipPage extends CommonAPI {

    @FindBy(xpath = "//*[@id='Home_Ancillary_9']")
    private WebElement memberTab;

    @FindBy(xpath="//*[@id='Home_Ancillary_9']")
    private WebElement shopTab;
    @FindBy (xpath = "//*[@id='personal-membership-button']/div/p")
    private WebElement personalshopTab;
    public ShopMembershipPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void hoverTomemberTab(){
        hoverOver(getDriver(),memberTab);
    }
    public void buymembershipTab(){
        click(shopTab);
    }
    public void selectmembershipTab(){
        click(personalshopTab);
    }
}
