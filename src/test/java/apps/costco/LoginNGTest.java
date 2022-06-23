package apps.costco;

import base.CommonAPI;
import org.testng.annotations.Test;

public class LoginNGTest extends CommonAPI {

@Test
    public void checkOnlogInButton(){
    click( "*[id ='language-region-set']");
    click("*[id='email-popup']");
    click();
//    click("#header_sign_in");
//    String expectedPage="signInTitle";
//    Assert.assertEquals(expectedPage,getPageTitle());

}

}
