package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandOutletPage extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Brand Outlet')]")
    WebElement BrandOutlet;

    @FindBy(css = ".b-accordion-text")
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
    WebElement kedsUptoFifty;
  @FindBy(xpath = "//a[contains(text(),'Puma - Up to 60% off')]")
    WebElement PumaUptoSity;
  @FindBy(xpath = "//a[contains(text(),'Reebok - Up to 40% off')]")
    WebElement ReebookUptoForty;
  @FindBy(xpath = "//a[contains(text(),'Saucony - Up to 50% off')]")
    WebElement SauconyUptoFifty;

    public BrandOutletPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setBrandOutlet(){ click(BrandOutlet);
//        LOG.info("clicked on Brand Outlet");
    }

    public  void setClothing() { click(Clothing);
       // LOG.info("clicked on clothing");
    }
    public void setChampionUPtoFity(){ click(ChampionUPtoFity);
      //  LOG.info("clicked to 50% off");
    }
    public void setHanesUpToSixFive(){ click(HanesUpToSixFive);
     //   LOG.info("clicked on 65% off");
    }
    public void setSuperdryUpToFifty(){ click(SuperdryUpToFifty);
    //    LOG.info("clicked on superdry to 50% off");
    }
    public void setVolcomUpToThirty(){ click(VolcomUpToThirty);
       // LOG.info("clicked on 30% off");
    }
    public void setFootwearApprel(){ click(FootwearApprel);
      //  LOG.info("clicked on footwear apparel");
    }
    public void setASISUptoSixty(){ click(ASISUptoSixty);
      //  LOG.info("clicked on 60% off");
    }
    public void setCrocsUptoForty(){ click(CrocsUptoForty);
       // LOG.info("clicked on 40% off");
    }
    public void setKedsUptoFif(){ click(kedsUptoFifty);
      //  LOG.info("clicked on 50% off");
}
    public void setPumaUptoSity(){ click(PumaUptoSity);
       // LOG.info("clicked on 60% off");
}
    public void setReebookUptoForty(){ click(ReebookUptoForty);
       // LOG.info("clicked on 40% off");
}
    public void setSauconyUptoFif(){ click(SauconyUptoFifty);
       // LOG.info("clicked on 50% off");
}

}
