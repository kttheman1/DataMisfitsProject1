package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationPage extends CommonAPI {

    @FindBy(xpath="//*[@id=\"navigation-widget\"]/div/nav/div[11]/a")
    WebElement locatationTab;
    @FindBy(css="#search-warehouse")
    //*[@id="search-warehouse"]
    WebElement locationfld;

    public LocationPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public  void locationField(){
        click(locatationTab);
    }

    public  void setLocation(){
        click(locationfld);
    }

}
