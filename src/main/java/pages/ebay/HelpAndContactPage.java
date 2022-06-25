package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpAndContactPage extends CommonAPI {
    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-p-3']/a[1]")
    WebElement clickOnHelpContact;

    @FindBy(xpath = "//h2[contains(text(),'Buying as a guest')]")
    WebElement BuyingAsaguest;


    @FindBy(xpath = "//h2[contains(text(),\"Get help with an item that hasn't arrived\")]")
    WebElement hasntArrived;
    @FindBy(xpath = "//h2[contains(text(),'Get help with a hacked account')]")
    WebElement hackedaccount;
    public HelpAndContactPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void setClickOnHelpContact(){
        click(clickOnHelpContact);
    }
    public void setBuyingAsaguest(){
        click(BuyingAsaguest);
    }
    public void setHasntArrived(){
        click(hasntArrived);
    }
    public void setHackedaccount(){
        click(hackedaccount);
    }

}
