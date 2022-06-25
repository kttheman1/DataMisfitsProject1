package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerServiceForBuying extends CommonAPI {
    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-p-3']/a[1]")
    WebElement clickOnHelpContact;

@FindBy(xpath = "//body/div[@id='mainContent']/div[@id='wrapper']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]/a[1]/span[1]/span[1]")
WebElement Buing;

@FindBy(xpath = "//body/div[@id='mainContent']/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]")
WebElement buingAsGuest;

    public CustomerServiceForBuying(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setClickOnHelpContact(){
        click(clickOnHelpContact);
    }
    public void setBuing(){
        click(Buing);
    }
    public void setBuingAsGuest(){
        click(buingAsGuest);
    }

}
