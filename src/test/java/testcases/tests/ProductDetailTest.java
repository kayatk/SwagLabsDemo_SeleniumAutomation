package testcases.tests;

import org.testng.annotations.Test;
import testcases.functions.loginFunction;
import testcases.page.ProductsPage;

public class ProductDetailTest extends ProductsPage {

    @Test(dataProvider = "jsondata")
    public void verifyAddToCart(String ar){
        loginFunction loginFn = new loginFunction();
        loginFn.Login(ar);
        clickProductName();
        selectProduct();

    }
}
