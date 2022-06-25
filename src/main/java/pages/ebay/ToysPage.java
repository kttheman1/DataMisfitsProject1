package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToysPage extends CommonAPI {
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[8]/a[1]")
    WebElement Toy;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[1]/button[1]")
    WebElement ActionFigure;

    @FindBy(xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
    WebElement seeActionFigure;

    public ToysPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setToy(){
        click(Toy);
    }
    public void setActionFigure(){
        click(ActionFigure);
    }
    public void setSeeActionFigure(){
        click(seeActionFigure);
    }

}
