package testcases.tests;

import org.testng.annotations.Test;
import testcases.functions.loginFunction;
import testcases.page.ProductsPage;

public class AboutTest extends ProductsPage {

    @Test(dataProvider = "jsondata")
    public void verifyAbout(String ar){
        loginFunction loginFn = new loginFunction();
        loginFn.Login(ar);
        clickMenu();
        clickAbout();
    }
}
