package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewWarehouseSavingsPage extends CommonAPI {

    @FindBy(xpath="//*[@id='warehouse-coupons']")
    WebElement wareHouseBtn;
    @FindBy (xpath="//*[@id=\"itw-lp\"]/div/div/a")
    WebElement checkToVisit;

    public ViewWarehouseSavingsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void warehouseTab(){
        click(wareHouseBtn);
    }
    public void clicktoViewTab(){
        click(checkToVisit);
    }

}
