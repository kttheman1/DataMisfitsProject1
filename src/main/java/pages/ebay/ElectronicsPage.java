package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage extends CommonAPI {
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[4]/a[1]")
    WebElement ElectronicsPag;
    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[1]/button[1]")
    WebElement cmera;
    @FindBy(xpath = "//a[contains(text(),'See all in Cameras & Photo')]")
    WebElement Seeallcamera;

    public ElectronicsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setElectronicsPag(){
        click(ElectronicsPag);
    }
public void setCmera(){
        click(cmera);
}
public void setSeeallcamera(){
        click(Seeallcamera);
}
}
