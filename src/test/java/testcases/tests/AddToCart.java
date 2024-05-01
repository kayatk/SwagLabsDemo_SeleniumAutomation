package testcases.tests;

import org.testng.annotations.Test;
import testcases.functions.loginFunction;
import testcases.page.MyCartPage;
import testcases.page.ProductsPage;

public class AddToCart extends ProductsPage {
    loginFunction loginFn = new loginFunction();
    MyCartPage myCartPage =new MyCartPage();

    @Test(dataProvider = "jsondata")
    public void verifyMyCartNavigation(String ar){
        loginFn.Login(ar);
        clickMyCart();
    }

    @Test(dataProvider = "jsondata")
    public void verifyAddToCart(String ar){
        loginFn.Login(ar);
        selectProduct();
        clickMyCart();
        myCartPage.clickRemove();
    }



}
