package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocationPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(LocationPage.class);
    @FindBy(xpath="//*[@id='navigation-widget']/div/nav/div[11]/a")
    WebElement locatationTab;
    @FindBy(css="#search-warehouse")
    //*[@id="search-warehouse"]
    WebElement locationfld;

    public LocationPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public  void locationField(){
        click(locatationTab);
        LOG.info("location here ");
    }

    public  void setLocation(){
        click(locationfld);
        LOG.info("set location ");
    }

}
