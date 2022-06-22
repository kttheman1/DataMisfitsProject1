package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroceryPage extends CommonAPI {

    @FindBy(xpath="//*[@id='Home_Ancillary_0']")
    WebElement groceryTab;
    @FindBy( xpath="//*[@id='category-list-link0']/div/a")
    WebElement pantryTab;

    public GroceryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public  void moveToGrocery(){
        click( groceryTab);
    }

    public  void selectitems(){
        pantryTab.click();
    }

}
