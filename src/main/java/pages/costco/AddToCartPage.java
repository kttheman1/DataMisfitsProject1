package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class AddToCartPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(AddToCartPage.class);
    @FindBy(css  = "#cart-d")
    WebElement cartTab;
    @FindBy(xpath = "//*[@id='empty-cart-id']/div[2]/div/input")
    WebElement continueTab;
    @FindBy(xpath = "//*[@id='search-results']/div[4]/div[1]/div[2]/div[2]/div[2]/div[2]/span/a")
    WebElement addProd;
    @FindBy(xpath = "//*[@id=add-to-cart-btn]")
    WebElement addItemToCart;

    @FindBy(css="#costcoModalText")
    WebElement viewCart;
    @FindBy(xpath ="//*[@id='shopCartCheckoutSubmitButton']")
    WebElement chkoutTab;
    public AddToCartPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public  void cartAtHomePage(){
        click(cartTab);
        LOG.info("add cart from homepage");
    }
    public  void clickcontinueShopping(){
        click(continueTab);
        LOG.info("continue shopping btn ");
    }
    public void addProductToCart(){
        click(addProd);
        LOG.info("add products");
    }
    public  void prodAdded(){
        click(addItemToCart);
        LOG.info("prod added displayed");
    }
    public  void viewCartWindow(){
        click(viewCart);
        LOG.info("view cart dispalyed");
    }
    public void getCheckout(){

        click(chkoutTab);
        LOG.info("checkout done");
    }

}
