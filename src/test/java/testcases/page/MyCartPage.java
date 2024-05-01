package testcases.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyCartPage extends TestBase {


    public void clickRemove(){
        List<WebElement> addedProduct=driver.findElements(By.xpath("//button[text()='Remove']"));
        addedProduct.get(0).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
