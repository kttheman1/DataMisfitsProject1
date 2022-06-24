package pages.costco;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RenewPersonalMembershipPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(RenewPersonalMembershipPage.class);

    @FindBy(xpath="//*[@id='Home_Ancillary_9']")
    private  WebElement membershipTab;

    @FindBy(xpath="//*[@id='personal-membership-button']/div/p")
     private WebElement personalTab;
    @FindBy (xpath="//*[@id='show_personal_membership']/div/div[1]/div/div[1]/a[2]")
    private WebElement executiveRenewTab;


    public RenewPersonalMembershipPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public  void selectMemebership(){
        click(membershipTab);
        LOG.info(" select to member");
    }
    public void selectPersonalMembership(){
        click(personalTab);
        LOG.info(" select personal");
    }
    public void selectExecutiveMembership(){
        click(executiveRenewTab);
        LOG.info(" select executive");
    }

}
