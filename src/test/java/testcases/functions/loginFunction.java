package testcases.functions;

import org.testng.annotations.DataProvider;
import testcases.page.LoginPage;

import java.io.IOException;

public class loginFunction extends LoginPage {


   public void Login (String arr) {
       String users[] =arr.split(",");
       enterUserName(users[0]);
       enterPassword(users[1]);
       clickLogin();
    }
    

}
