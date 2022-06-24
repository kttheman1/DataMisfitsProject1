package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class InstallServicesPage extends  CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(InstallServicesPage.class);


    @FindBy(xpath="//*[@id='Home_Ancillary_4']")
    private WebElement tabServices;

    @FindBy(xpath="//*[@id='scroll']/li[2]/a/span")
    private WebElement installServices;

    @FindBy(xpath="//*[@id='costco-services-lp']/div[1]/div/div/a")
    private WebElement callServices;


    public InstallServicesPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public  void servicesTab(){
        click(tabServices);
    }
    public  void selectOptions(){
        click(installServices);
    }
    public  void selectTocall(){
        click(callServices);
    }

}
