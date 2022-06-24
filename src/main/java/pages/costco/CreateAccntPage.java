package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;

public class CreateAccntPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(CreateAccntPage.class);

    @FindBy(xpath="//*[@id='next']")
    WebElement createAcctbtn;
    @FindBy(xpath="//*[@id='email']")
    WebElement emailIdBtn;
    @FindBy(xpath = "//*[@id='newPassword']")
    WebElement pwdBtn;
    @FindBy(xpath = "//*[@id='reenterPassword']")
    WebElement confirmPwdBtn;
    @FindBy(xpath = "//*[@id='continue']")
    WebElement BtnToCreateAcct;
    public CreateAccntPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void newToCreateAccnt(){
        click(createAcctbtn);
        LOG.info("new user account");
    }
    public void enterEmailId (String text ){

        type(emailIdBtn, text);
        LOG.info("enter email ");
    }
    public void  enterpwd (String text ){
        type(pwdBtn, text);
        LOG.info("password here ");

    }
    public void enterpwdToConfirm(String text){
        type(confirmPwdBtn, text);
        LOG.info("conform password ");

    }
    public void clickToCreate( ){
        BtnToCreateAcct.click();
        LOG.info("click to create ");
    }
}
