package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialMediaPage extends CommonAPI {

    @FindBy(xpath = "//body[1]/div[6]/footer[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/ul[1]/li[1]/a[1]")
    WebElement fabook;
    @FindBy(xpath = "//body[1]/div[6]/footer[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/ul[1]/li[2]/a[1]")
    WebElement twitter;
    public SocialMediaPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void setFabook(){
        click(fabook);
    }
public void setTwitter(){
        click(twitter);
}
}
