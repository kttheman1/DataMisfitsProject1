package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class NavigateToCustomerServicePage extends CommonAPI {


    private final Logger LOG = LoggerFactory.getLogger(NavigateToCustomerServicePage.class);

    @FindBy(xpath="//*[@id='customer-service-link']")
    WebElement CustmrServiceTab;


    public NavigateToCustomerServicePage (WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public  void helpCustomer(){
       click(CustmrServiceTab);
        LOG.info(" help customers");
    }


}
