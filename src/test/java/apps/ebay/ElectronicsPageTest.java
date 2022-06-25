package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.ElectronicsPage;

public class ElectronicsPageTest extends CommonAPI {
    @Test
    public void eletro(){
        ElectronicsPage Ele = new ElectronicsPage(getDriver());
        Ele.setElectronicsPag();
        //Ele.setMera();
       // Ele.setPrinter();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void camera(){
        ElectronicsPage Ele = new ElectronicsPage(getDriver());
        Ele.setElectronicsPag();
        Ele.setCmera();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


    }
    @Test
    public void printer(){
        ElectronicsPage Ele = new ElectronicsPage(getDriver());
        Ele.setElectronicsPag();
        Ele.setCmera();
        Ele.setSeeallcamera();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());
    }
}
