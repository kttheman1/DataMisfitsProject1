package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ViewWarehouseSavingsPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(ViewWarehouseSavingsPage.class);

    @FindBy(xpath="//*[@id='warehouse-coupons']")
    WebElement wareHouseBtn;
    @FindBy (xpath="//*[@id=\"itw-lp\"]/div/div/a")
    WebElement checkToVisit;

    public ViewWarehouseSavingsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void warehouseTab(){
        click(wareHouseBtn);
        LOG.info(" go to warehouse tab");
    }
    public void clicktoViewTab(){
        click(checkToVisit);
        LOG.info("view options");
    }

}
