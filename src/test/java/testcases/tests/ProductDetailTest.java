package testcases.tests;

import org.testng.annotations.Test;
import testcases.functions.loginFunction;
import testcases.page.MyCartPage;
import testcases.page.ProductsPage;
import testcases.page.TestBase;

public class ProductDetailTest extends ProductsPage {

    loginFunction loginFn = new loginFunction();
    MyCartPage cartPage =new MyCartPage();


    @Test(dataProvider = "jsondata")
    public void verifyAddProduct_AddToCart(String ar){
        
        loginFn.Login(ar);
        clickProductName();
        selectProduct();
        clickMyCart();
      //  cartPage.verifyAddedProduct();
        removeProduct();
    }

    @Test(dataProvider = "jsondata")
    public void verifyAddProduct_ProductDetailPage(String ar){
        loginFn.Login(ar);
        clickProductName();
        selectProduct();
        removeProduct();

    }
}
