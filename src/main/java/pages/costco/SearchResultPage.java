package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;

public class SearchResultPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchResultPage.class);

    @FindBy(css="#search-field")
    WebElement typeToSearch;

    //*[@id="search-field"]
    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void searchProd(String item){
        typeAndEnter( typeToSearch,item );
        LOG.info(" search product");
    }

    }






