package testcases.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends TestBase {

    WebElement menu;
    WebElement logOut;
    WebElement about;
    WebElement myCart;

    public  void clickMenu(){
        menu=driver.findElement(By.id("react-burger-menu-btn"));
        menu.click();
    }
    public  void clickAbout(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        about = driver.findElement(By.id("about_sidebar_link"));
        about.click();
    }



    public  void clickLogout(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logOut = driver.findElement(By.id("logout_sidebar_link"));
        logOut.click();
    }
    public void selectProduct(){
        List<WebElement> products =driver.findElements(By.xpath("//button[text()='Add to cart']"));
        (products.get(0)).click();

    }
    public void removeProduct(){
        List<WebElement> products =driver.findElements(By.xpath("//button[text()='Remove']"));
        (products.get(0)).click();

    }
    public void clickProductName(){
        List<WebElement> productName =driver.findElements(By.xpath("//a[contains(@id,'title')]"));
        (productName.get(0)).click();

    }
    public void clickMyCart(){
        myCart = driver.findElement(By.className("shopping_cart_link"));
        myCart.click();
    }
}
