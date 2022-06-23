package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage extends CommonAPI  {
    private final Logger LOG = LoggerFactory.getLogger(LoginPage.class);
    @FindBy(css ="#signInHeader")
    WebElement headerText;

    @FindBy( css ="#lnkCostcoLogo")
    WebElement costcoLogo;
    @FindBy(xpath="//*[@id='header_sign_in']")
    WebElement signInOrRegisterTab;


    @FindBy(name="Sign in name")
    WebElement emailaddress;
    @FindBy(name="Password")
    WebElement password;
    @FindBy(xpath ="//*[@id='next']")
    WebElement btnSignin;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public String getHeaderText(String s){
        return getElementText(headerText);

    }
    public boolean checkLogoIsPresent(){
        return isPresent(costcoLogo);

    }
    public  void clickTosignInTab(){
        signInOrRegisterTab.click();
        LOG.info("signin here ");

    }
    public void setname(String uname){
        emailaddress.sendKeys(uname);
        LOG.info(" print name");
    }

    public void setpassword(String pwd){
        password.sendKeys(pwd);
        LOG.info("print password");
    }

    public  void clickSignInBtn()
    {
        btnSignin.click();
        LOG.info("click to signIn");

    }


    /*@FindBy(name="Sign in name")
    WebElement emailaddress;
    @FindBy(name="Password")
    WebElement password;
    @FindBy(xpath ="//*[@id='next']")
    WebElement btnSignin;
    // logo search
    @FindBy(css ="img.bc-logo logo-ca")
    WebElement toCheckLogo();

     */


}
