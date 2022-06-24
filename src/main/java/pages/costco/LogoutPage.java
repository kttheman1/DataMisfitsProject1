package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogoutPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(LogoutPage.class);
    @FindBy(css ="#header_sign_in")
    private WebElement signInTab;

    @FindBy(css ="#Signinname")
    private WebElement emailaddress;

    @FindBy(xpath="//*[@id='password']")
    private WebElement password;

    @FindBy (xpath="//*[@id='next']")
    private WebElement signinBtn;

    @FindBy(xpath = "//*[@id='language-region-set']")
    private WebElement windowToClose;

    @FindBy(xpath = "//*[@id='myaccount-react-d']")
    private  WebElement accntTab;
    @FindBy(xpath="//*[@id='mi_signout']")
    private  WebElement signOutTab;

    public LogoutPage (WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public  void goTosign(){
        click(signinBtn);
        LOG.info("go to sign");
    }
    public void printname(String uname){
        emailaddress.sendKeys(uname);
        LOG.info("print name ");
    }

    public void printpassword(String pwd){
        password.sendKeys(pwd);
        LOG.info("print password ");
    }
    public  void setToSign(){
        click(signinBtn);
        LOG.info("set to sign ");
    }
    public void getWindowClose(){
        click(windowToClose);
        LOG.info("window to close ");
    }
    public void  accountTab(){
        click(accntTab);
        LOG.info("account tab ");
    }
    public void getSignout(){

        click(signOutTab);
        LOG.info("sign out done");
    }
}
