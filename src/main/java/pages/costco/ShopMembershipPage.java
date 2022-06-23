package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShopMembershipPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ShopMembershipPage.class);

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
        LOG.info(" hover to member btn");
    }
    public void buymembershipTab(){
        click(shopTab);
        LOG.info("chk membership options");
    }
    public void selectmembershipTab(){
        click(personalshopTab);
        LOG.info(" select type");
    }
}
