package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends CommonAPI {
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
    }
    public void printname(String uname){
        emailaddress.sendKeys(uname);
    }

    public void printpassword(String pwd){
        password.sendKeys(pwd);
    }
    public  void setToSign(){
        click(signinBtn);
    }
    public void getWindowClose(){
        click(windowToClose);
    }
    public void  accountTab(){
        click(accntTab);
    }
    public void getSignout(){

        click(signOutTab);
    }
}
