package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-eb']/li[@id='gh-eb-My']/div[1]/a[1]")
    WebElement Mebay;

    @FindBy(xpath = "//a[contains(text(),'Summary')]")
    WebElement Summary;

    @FindBy(xpath ="//img[@id='gh-logo']")
    WebElement ebayHome;

    @FindBy(xpath = "//a[contains(text(),'Recently Viewed')]")
    WebElement reView;

    @FindBy(css = "body.desktop.gh-1199.gh-979.gh-939.gh-899.gh-flex:nth-child(2) footer.gh-w:nth-child(1) div.gffoot:nth-child(3) table.gf-t tr:nth-child(1) td:nth-child(3) ul:nth-child(2) li.gf-li:nth-child(1) > a.thrd.gf-i:nth-child(2)")
    WebElement fabook;
    @FindBy(xpath = "//body[1]/div[6]/footer[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/ul[1]/li[2]/a[1]")
    WebElement twitter;
    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-eb']/li[@id='gh-p-2']/a[1]")
    WebElement sell;
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void setShopnow(){
        click(Mebay);
    }
public void setSerf(){
        click(ebayHome);
}
public void setPhotos(){
        click(reView);
}
public void setSummary (){
        click(Summary);
}
public void setSell(){
        click(sell);
}
public void setFabook(){
        click(fabook);
}
public void setTwitter(){
        click(twitter);
}
}
