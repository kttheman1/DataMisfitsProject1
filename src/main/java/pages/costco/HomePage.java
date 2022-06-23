package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    @FindBy(css="#language-region-set")
    private WebElement closeTabToproceed;

    @FindBy( css ="#email-popup")
    private WebElement emailTab;

    @FindBy(name = "keyword")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id='navigation-dropdown']")
    private WebElement menuDropdown;
    @FindBy(css = "#header_sign_in")
    private WebElement floatingMenu;

    @FindBy(css ="# navigation-dropdown")
    private WebElement menuDropdownOptions;
    @FindBy( css  = "#formcatsearch")
    WebElement btnClick;

    @FindBy(xpath = "//*[@id='header_sign_in']")
    WebElement signInBtn;

    @FindBy(xpath = "//*[@id='deliveryLocation']/div/div/div[1]/div[1]")
    WebElement setWareHouse;

    @FindBy(xpath = "//*[@id='deliveryLocation']/div/div/div[2]/div")
    WebElement setDeliveryLocation;

    @FindBy(css ="# header_order_and_returns")
    WebElement orderReturnTab;

    @FindBy(css = "#cart-d")
    WebElement cartTab;

    @FindBy( css ="# warehouse-coupons")
    WebElement warehouseSavingTab;

    @FindBy(css = "# email-signup-link")
    WebElement emailOffersTab;

    @FindBy(css = "# customer-service-link ")
    WebElement customerServiceTab;
    @FindBy(xpath = "//*[@id='country-select']/span[1]")
    WebElement setCountryTab;

    @FindBy(css = "# header-selected-language ")
    WebElement languageTab;
    @FindBy(xpath = "//*[@id='next']")
    WebElement btnSignin;

    //constructor
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //reusable steps

    public  void setWindowToClose(){
        click(closeTabToproceed);
        LOG.info("set region");
    }
    public void closeEmailTab(){
        click(emailTab);
        LOG.info("close email");
    }
    public void searchProduct(String prodname) {
        searchField.sendKeys(prodname);
        LOG.info("search product ");
    }

    public void searchElementAndEnter(String item) {
        typeAndEnter(searchField, item);
    }

    public void selectOptionFromShopMenuDropdown(String option) {
        selectFromDropdown(menuDropdown, option);
        LOG.info("select from shopmenu");
    }

    public void hoverOverFloatingMenu(WebDriver driver) {
        hoverOver(driver, floatingMenu);
        LOG.info("mouse hover starts ");
    }

    public void clearSearchField() {
        clear(searchField);
        LOG.info("clear search ");
    }

    public void clickToSearch() {
        click(btnClick);
        LOG.info("click for searching");
    }
    public void currentWarehouse () {
        setWareHouse.click();
        LOG.info("set warehouse");
    }
    public void setDeliveryAddress () {

        setDeliveryLocation.click();
        LOG.info("set delivery address");
    }
    public  void clickSignIn()
    {
        btnSignin.click();
        LOG.info("Sign in btn");

    }
    public void findOrderAndReturn ()
    {

        orderReturnTab.click();
        LOG.info("navigate to order tab");
    }
    public void getWareHouseSavings ()
    {
        warehouseSavingTab.click();
        LOG.info("get tp warehosue savings");
    }
    public void getEmailOffers ()
    {
        emailOffersTab.click();
        LOG.info("naviate to email offers");
    }
    public void getCustmrService ()
    {
        customerServiceTab.click();
        LOG.info("customer services");
    }
    public void cartToCheck ()
    {
        cartTab.click();
        LOG.info(" cart tab");
    }
    public void selectCountry ()
    {
        setCountryTab.click();
        LOG.info("select country");
    }
    public void selectLanguage ()
    {
        languageTab.click();
        LOG.info("set language");
    }
    public List<String> getHomePageDropdownOptions() {
        List<String> options = new ArrayList<>();
        List<WebElement> elements = getDropDownOptions(menuDropdown);

        {
            for (WebElement element : elements) {
                options.add(element.getText());
            }
        }
        return options;
    }

    public void selectOptionFromShopMenuDropdownWithSelectOptions(String options){
        List<WebElement> elementshop = getDropDownOptions(menuDropdown);
        for (WebElement element:elementshop) {
            if (element.getText().equalsIgnoreCase(options)){
                element.click();
            }
        }
    }

    public void selectOptionFromShopMenuDropdownWithGivenText(String options){
        List <WebElement> elements = (List<WebElement>) menuDropdownOptions;
        for (WebElement element :elements) {
            if (element.getText().equalsIgnoreCase(options)){
                element.click();
            }
        }
    }

    }





