package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends CommonAPI {

    @FindBy(xpath= "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-eb-u']/span[@id='gh-ug']/a[1]")
    WebElement SignInUp;

    @FindBy(id = "userid")
    WebElement email;

    @FindBy(id = "signin-continue-btn")
    WebElement continueButton;
    @FindBy(id = "pass")
    WebElement enterPasswordTextBox;

    @FindBy(id = "sgnBt")
    WebElement SignIn;

    @FindBy(id = "#gh-logo")
    WebElement logoforhome;

    @FindBy(id = "webauthn-maybe-later-link")
    WebElement later;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void signIn(){
        click(SignInUp);
    }

    public void clickEmailField() {click(email); }
    public void enterEmail(String text){
        type(email, text);
    }
    public void Cbutton(){
        click(continueButton);
    }
    public void enterPassword(String text){
        type(enterPasswordTextBox, text);
    }
    public void enterPasswordSignInBtn(){
        click(SignIn);
    }
    public void logoBTn(){
        click(logoforhome);
}

    public void findlater(){
        click(later);
}

}


