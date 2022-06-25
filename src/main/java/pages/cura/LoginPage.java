package pages.cura;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {

    @FindBy(css="#btn-make-appointment")
    private WebElement btnAppoint;

    @FindBy(css="#txt-username")
    private WebElement setname;

    @FindBy(css="#txt-password")
    private WebElement setpwd;
    @FindBy(css="btn-login")
    private WebElement clicklog;



    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public  void btnToAppoint(){
        click(btnAppoint);
    }
    public  void setusername( String uname){
       setname.sendKeys(uname);
}
    public  void setpassword(String pwd){
        setpwd.sendKeys(pwd);
    }


    public  void setBtnAppoint(){
        click(clicklog);
    }



}
