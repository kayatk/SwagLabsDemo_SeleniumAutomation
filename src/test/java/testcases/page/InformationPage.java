package testcases.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InformationPage extends TestBase{

    WebElement fName;
    WebElement lName;
    WebElement zipCode;
    WebElement cancelBtn;

    public void enterFirstName(String firstname){
        fName= driver.findElement(By.id("first-name"));
        fName.clear();
        fName.sendKeys(firstname);

    }

    public void enterLastName(String lastname){
        lName= driver.findElement(By.id("last-name"));
        lName.clear();
        lName.sendKeys(lastname);

    }

    public void enterZipCode(String zip){
        zipCode= driver.findElement(By.id("postal-code"));
        zipCode.clear();
        zipCode.sendKeys(zip);
    }

    public void clickCancel(){
        cancelBtn=driver.findElement(By.id("cancel"));
    }

    public void clickContinue(){
        cancelBtn=driver.findElement(By.id("continue"));
    }
}
