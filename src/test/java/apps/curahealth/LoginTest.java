package apps.curahealth;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.cura.LoginPage;

import java.io.ObjectInputStream;

public class LoginTest extends CommonAPI {
    @Test
    public void appointmentTologin(){
        LoginPage lp=new LoginPage(getDriver());
        lp.btnToAppoint();
        lp.setusername("John Doe");
        lp.setpassword("ThisIsNotAPassword");
        lp.setBtnAppoint();

    }
}
