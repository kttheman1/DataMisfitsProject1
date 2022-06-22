package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Type;

public class SearchResultPage extends CommonAPI {

    @FindBy(css="#search-field")
    WebElement typeToSearch;

    //*[@id="search-field"]
    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void searchProd(String item){
        typeAndEnter( typeToSearch,item );
    }

    }






