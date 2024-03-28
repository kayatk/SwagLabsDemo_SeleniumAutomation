package testcases.tests;

import base.TestBase;
import org.testng.annotations.Test;
import testcases.page.LoginPage;

import java.io.IOException;

public class LoginTest extends TestBase {

    LoginPage lg=new LoginPage();

    @Test
    public void loginTest() throws IOException, InterruptedException {
        lg.enterUserName("standard_user");
        lg.enterPassword("secret_sauce");
        lg.clickLogin();
       // Thread.sleep(7000);
    }


}
