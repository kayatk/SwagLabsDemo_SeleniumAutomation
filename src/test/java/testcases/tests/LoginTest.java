package testcases.tests;

import base.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testcases.page.LoginPage;

import java.io.IOException;

public class LoginTest extends TestBase {

    LoginPage lg=new LoginPage();

    @Test(dataProvider = "loggin_Credentials")
    public void loginTest(String userName, String password) throws IOException, InterruptedException {
        lg.enterUserName(userName);
        lg.enterPassword(password);
        lg.clickLogin();
       // Thread.sleep(7000);
    }

    @DataProvider(name="loggin_Credentials")
    public  Object[][] loginUsers(){
          return new Object[][]{
            {"standard_user","secret_sauce"},
               {"locked_out_user","secret_sauce"},
                 {"problem_user","secret_sauce"},
                  {"performance_glitch_user","secret_sauce"},
                 {"error_user","secret_sauce"},
                {"visual_user","secret_sauce"}
        };
    }


}
