package pages.ebay;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrentStorePage extends CommonAPI {

    @FindBy(css = "button[class = 'submitClass btn join-btn submit-Btn']")
    private WebElement findOtherClubsBtn;

    @FindBy(css = "button[class = 'shopBtn-myClub btn btn-primary']")
    private WebElement myClubBtn;

    @FindBy(css = "#getDirection")
    private WebElement getDirectionFromField;

    @FindBy(css = "button[class = 'btn btn-default']")
    private WebElement getDirectionsBtn;

    public CurrentStorePage(WebDriver driver) { PageFactory.initElements(driver, this); }

    public void clickFindOtherClubsBtn() {click(findOtherClubsBtn); }

    public void clickMyClubBtn() {click(myClubBtn); }

    public void clickGetDirectionFromField() {click(getDirectionFromField); }

    public void clickGetDirectionsBtn() {click(getDirectionsBtn); }



}
