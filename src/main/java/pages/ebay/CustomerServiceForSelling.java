package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerServiceForSelling extends CommonAPI {
    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-p-3']/a[1]")
    WebElement clickOnHelpContact;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[@id='wrapper']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/a[1]/span[1]/span[1]")
    WebElement selling;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[@id='wrapper']/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]")
    WebElement sellingOnEbay;
    public CustomerServiceForSelling(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setClickOnHelpContact(){
        click(clickOnHelpContact);
    }
    public void setSelling(){
        click(selling);
    }
    public void setSellingOnEbay(){
        click(sellingOnEbay);
    }

}
