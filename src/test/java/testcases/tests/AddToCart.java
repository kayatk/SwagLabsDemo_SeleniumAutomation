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

    @Test(dataProvider = "jsondata")
    public void verifyContinueShoppingWithoutProduct(String ar){
        loginFn.Login(ar);
        clickMyCart();
        myCartPage.clickContinueShopping();
    }

    @Test(dataProvider = "jsondata")
    public void verifyContinueShoppingWithProduct(String ar){
        loginFn.Login(ar);
        selectProduct();
        clickMyCart();
        myCartPage.clickContinueShopping();
    }

    @Test(dataProvider = "jsondata")
    public void verifyCheckoutNavigationWithProduct(String ar){
        loginFn.Login(ar);
        selectProduct();
        selectProduct();
        clickMyCart();
        myCartPage.clickCheckOut();
    }

    @Test(dataProvider = "jsondata")
    public void verifyCheckoutNavigationWithoutProduct(String ar){
        loginFn.Login(ar);
        clickMyCart();
        myCartPage.clickCheckOut();
    }
}
