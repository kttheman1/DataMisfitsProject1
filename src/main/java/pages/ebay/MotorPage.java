package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MotorPage extends CommonAPI {

    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[3]/a[1]")
    WebElement Motor;

    @FindBy(xpath = "//span[contains(text(),'Cameras & Photo')]")
    WebElement Vehi;

    @FindBy(xpath = "//a[contains(text(),'Cars & Trucks')]")
    WebElement CarsTruck;
    public MotorPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void setMotor(){
        click(Motor);
    }
    public void setVehi(){
        click(Vehi);
    }
    public void setCarsTruck(){
        click(CarsTruck);
    }

}
