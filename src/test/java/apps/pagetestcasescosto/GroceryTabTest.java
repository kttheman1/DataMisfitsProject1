package apps.pagetestcasescosto;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.costco.GroceryPage;
import pages.costco.HomePage;

public class GroceryTabTest extends CommonAPI {
@Test
    public  void getGrocery(){
    getDriver().switchTo().alert().dismiss();
    HomePage homePage =new HomePage(getDriver());
    homePage.setWindowToClose();
    homePage.closeEmailTab();
    GroceryPage grocery=new GroceryPage(getDriver());
    grocery.moveToGrocery();
    grocery.selectitems();
    String expected="Pantry & Dry Goods&nbsp;| Costco";
    String actual=grocery.getPageTitle();
    Assert.assertEquals(expected,actual);


}


}
