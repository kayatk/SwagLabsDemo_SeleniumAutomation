package testcases.tests;

import base.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testcases.functions.loginFunction;
import testcases.page.LoginPage;
import utilities.ReadXLSfiles;

import java.io.IOException;

public class LoginTest extends loginFunction {


   // @Test(dataProviderClass = ReadXLSfiles.class,dataProvider = "loggin_Credentials")
    @Test()
    public void validUserLogins(String userName, String password) {


    }
    @Test()
    public void lockedUserLogin(String userName, String password) {


    }
    @Test()
    public void UserLogin(String userName, String password) {


    }


 /*   @DataProvider(name="loggin_Credentials")
    public  Object[][] loginUsers(){
          return new Object[][]{
           // {"standard_user","secret_sauce"},
               {"locked_out_user","secret_sauce"},
             //    {"problem_user","secret_sauce"},
              //    {"performance_glitch_user","secret_sauce"},
              //   {"error_user","secret_sauce"},
              //  {"visual_user","secret_sauce"}
        };
    }*/


}
