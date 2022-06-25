package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToysPage extends CommonAPI {
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[8]/a[1]")
   private WebElement Toy;

    @FindBy(css = ".s-item__title")
    private WebElement stuffedBear;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[1]/button[1]")
   private WebElement ActionFigure;

    @FindBy(xpath = "//*[@id='srp-river-results']/ul/li[1]/div/div[2]/a/h3")
    private WebElement pokemonToy;
    @FindBy(xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
    private WebElement seeActionFigure;

    @FindBy(xpath = "//*[@id='srp-river-results']/ul/li[2]/div/div[2]/a/h3/span")
    private WebElement remoteControlCar;

    @FindBy(xpath = "//*[@id='srp-river-results']/ul/li[2]/div/div[2]/a/h3")
    private WebElement yoYo;

    public ToysPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setStuffedBear() {click(stuffedBear); }

    public void setYoYo() {click(yoYo); }

    public void setPokemonToy() {click(pokemonToy); }

    public void setToy(){
        click(Toy);
    }
    public void setActionFigure(){
        click(ActionFigure);
    }
    public void setSeeActionFigure(){
        click(seeActionFigure);
    }

    public void setRemoteControlCar() { click(remoteControlCar);}



}
