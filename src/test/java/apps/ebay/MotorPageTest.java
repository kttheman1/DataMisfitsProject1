package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.MotorPage;

public class MotorPageTest extends CommonAPI {
    @Test
    public void Moto(){
        MotorPage moto = new MotorPage(getDriver());
        moto.setMotor();
        //moto.setVehi();
      //  moto.setCarsTruck();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
    @Test
    public void Vehi(){
        MotorPage moto = new MotorPage(getDriver());
        moto.setMotor();
        moto.setVehi();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());



    }
    @Test
    public void CarsTruck(){
        MotorPage moto = new MotorPage(getDriver());
        moto.setMotor();
        moto.setVehi();

        moto.setCarsTruck();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }


}
