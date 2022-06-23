
package apps.costco;

import base.CommonAPI;
import org.testng.annotations.Test;

public class CreateAccountNGTest extends CommonAPI {
@Test(enabled = false)
    public void CreateAccount(){

    click( "*[id ='language-region-set']");
    click("*[id='email-popup']");
    click("//*[@id='header_sign_in']");
    click("//*[@id='createAccount']");
    waitFor(5);



}
}
