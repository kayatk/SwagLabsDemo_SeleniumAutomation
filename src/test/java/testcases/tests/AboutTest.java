package testcases.tests;

import org.testng.annotations.Test;
import testcases.functions.loginFunction;
import testcases.page.AboutPage;
import testcases.page.ProductsPage;

public class AboutTest extends ProductsPage {

    loginFunction loginFn = new loginFunction();
    AboutPage about =new AboutPage();

    @Test(dataProvider = "jsondata")
    public void verifyAbout(String ar){
        loginFn.Login(ar);
        clickMenu();
        clickAbout();
        about.verifyAboutPage();
    }
}
