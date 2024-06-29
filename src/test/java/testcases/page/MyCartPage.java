package testcases.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyCartPage extends TestBase {

    WebElement continueShoppingBtn;
    WebElement checkOut;
    ProductsPage productPage = new ProductsPage();

    public void clickRemove(){
        List<WebElement> addedProduct=driver.findElements(By.xpath("//button[text()='Remove']"));
        addedProduct.get(0).click();
    }

    public void clickContinueShopping(){
        continueShoppingBtn =driver.findElement(By.id("continue-shopping"));
        continueShoppingBtn.click();
    }

    public void clickCheckOut(){
        continueShoppingBtn =driver.findElement(By.id("checkout"));
        continueShoppingBtn.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

     public void verifyAddedProduct(){
        List<WebElement> addedprods = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

        for(int i=0; i<addedprods.size();i++){
            if ((productPage.addedProductName).equals(addedprods.get(i).getText())) {
                System.out.println("Added Product "+productPage.addedProductName+ "in My Cart Page" );
                break;
            }
            
        }     
     }
}
