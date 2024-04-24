package testcases.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductsPage extends TestBase {

    WebElement menu;
    WebElement logOut;
    WebElement about;

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
}
