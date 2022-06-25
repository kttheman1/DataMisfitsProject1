package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MorePage extends CommonAPI {
    @FindBy(xpath = "//body[1]/div[5]/div[1]/ul[1]/li[13]/span[1]")
    WebElement More;
    @FindBy(xpath = "//img[@id='gh-logo']")
    WebElement home;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[13]/div[2]/a[7]")
    WebElement sport;

    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[13]/div[2]/a[8]")
    WebElement bussness;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[13]/div[2]/a[9]")
    WebElement jewlaaryWath;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[13]/div[2]/a[10]")
    WebElement eBayRefurbis;



    public MorePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void setMore(){
      click(More);
    }
    public void setHome(){
        click(home);
    }
    public void setSport(){
        click(sport);
    }
    public void setBussness(){
        click(bussness);
    }
    public void setJewlaaryWath(){
        click(jewlaaryWath);
    }
    public void seteBayRefurbis(){
        click(eBayRefurbis);
    }
}
