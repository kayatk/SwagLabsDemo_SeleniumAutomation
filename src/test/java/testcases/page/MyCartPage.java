package testcases.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyCartPage extends TestBase {

    WebElement continueShoppingBtn;

    public void clickRemove(){
        List<WebElement> addedProduct=driver.findElements(By.xpath("//button[text()='Remove']"));
        addedProduct.get(0).click();
    }

    public void clickContinueShopping(){
        continueShoppingBtn =driver.findElement(By.id("continue-shopping"));
        continueShoppingBtn.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
