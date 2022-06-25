package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerServiceForShipingAndTracking extends CommonAPI {
    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-p-3']/a[1]")
    WebElement clickOnHelpContact;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[@id='wrapper']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]/a[1]/span[1]/span[1]")
    WebElement Shping;
    @FindBy(xpath = "//div[contains(text(),'Tracking your item')]")
    WebElement TracyourItem;
    public CustomerServiceForShipingAndTracking(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
public void setClickOnHelpContact(){
        click(clickOnHelpContact);
}
public void setShping(){
        click(Shping);
}
public void setTracyourItem(){
        click(TracyourItem);
}
}
