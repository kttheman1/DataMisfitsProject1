package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandOutletPage extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Brand Outlet')]")
    WebElement BrandOutlet;

    @FindBy(xpath = "//span[contains(text(),'Clothing')]")
    WebElement Clothing;

   @FindBy(xpath = "//a[contains(text(),'Champion - Up to 50% off')]")
    WebElement ChampionUPtoFity;

  @FindBy(xpath = "//a[contains(text(),'Hanes - Up to 65% off')]")
    WebElement HanesUpToSixFive;
  @FindBy(xpath = "//a[contains(text(),'Superdry - Up to 50% off')]")
    WebElement SuperdryUpToFifty;
  @FindBy(xpath = "//a[contains(text(),'Volcom - Up to 30% off')]")
    WebElement VolcomUpToThirty;

  @FindBy(xpath = "//span[contains(text(),'Footwear & Apparel')]")
    WebElement FootwearApprel;
  @FindBy(xpath = "//a[contains(text(),'ASICS - Up to 60% off')]")
    WebElement ASISUptoSixty;
  @FindBy(xpath = "//a[contains(text(),'Crocs - Up to 40% off')]")
  WebElement CrocsUptoForty;

  @FindBy(xpath = "//a[contains(text(),'Keds - Up to 50% off')]")
    WebElement kedsUptoFif;
  @FindBy(xpath = "//a[contains(text(),'Puma - Up to 60% off')]")
    WebElement PumaUptoSity;
  @FindBy(xpath = "//a[contains(text(),'Reebok - Up to 40% off')]")
    WebElement ReebookUptoForty;
  @FindBy(xpath = "//a[contains(text(),'Saucony - Up to 50% off')]")
    WebElement SauconyUptoFif;

    public BrandOutletPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setBrandOutlet(){
        click(BrandOutlet);
    }
    public  void setClothing()
    {
        click(Clothing);
    }
    public void setChampionUPtoFity(){
        click(ChampionUPtoFity);
    }
    public void setHanesUpToSixFive(){
        click(HanesUpToSixFive);
    }
    public void setSuperdryUpToFifty(){
        click(SuperdryUpToFifty);
    }
    public void setVolcomUpToThirty(){
        click(VolcomUpToThirty);
    }
    public void setFootwearApprel(){
        click(FootwearApprel);
    }
    public void setASISUptoSixty(){
        click(ASISUptoSixty);
    }
    public void setCrocsUptoForty(){
        click(CrocsUptoForty);
    }
public void setKedsUptoFif(){
        click(kedsUptoFif);
}
public void setPumaUptoSity(){
        click(PumaUptoSity);

}
public void setReebookUptoForty(){
        click(ReebookUptoForty);
}
public void setSauconyUptoFif(){
        click(SauconyUptoFif);
}

}
