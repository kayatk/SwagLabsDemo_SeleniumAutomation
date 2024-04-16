package testcases.tests;

import org.testng.annotations.Test;
import testcases.functions.loginFunction;
import testcases.page.ProductsPage;

public class LogoutTest extends ProductsPage {

    @Test(dataProvider = "jsondata")
    public void verifyLogout(String ar){
        loginFunction loginFn = new loginFunction();
        loginFn.Login(ar);
        clickMenu();
        clickLogout();
    }
}
