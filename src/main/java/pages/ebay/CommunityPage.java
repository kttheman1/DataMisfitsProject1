package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommunityPage extends CommonAPI {
    @FindBy(xpath = "//tbody/tr[1]/td[5]/h3[2]/a[1]")
    WebElement community;

    @FindBy(xpath = "//tbody/tr[1]/td[5]/ul[2]/li[1]/a[1]")
    WebElement Announment;

    @FindBy(xpath = "//a[contains(text(),'eBay Community')]")
    WebElement eBayCommunity;

    @FindBy(xpath = "//a[contains(text(),'eBay for Business Podcast')]")
    WebElement BusinessPodcast;

    @FindBy(xpath = "//body/div[2]/center[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h1[1]/a[1]")
    WebElement EbayLogo;

    public CommunityPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setCommunity(){
        click(community);
    }
    public void setAnnounment(){
        click(Announment);
    }
    public void seteBayCommunity(){
        click(eBayCommunity);
    }
public void  setBusinessPodcast(){
        click(BusinessPodcast);
}
public void  setEbayLogo(){
        click(EbayLogo);
}

}
