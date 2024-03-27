package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utilities.ReadPropertiesFile;

import java.io.IOException;

public class TestBase {

    WebDriver driver;
    ReadPropertiesFile readPropertiesFile =new ReadPropertiesFile();

    @BeforeTest
    public void openTheBrowser() throws IOException {
        if (driver==null){
            String userBrowser =readPropertiesFile.valueOf("browser");
            if(userBrowser.equalsIgnoreCase("chrome")){
                driver= new ChromeDriver();
            }
            else if(userBrowser.equalsIgnoreCase("firefox")){
                driver= new FirefoxDriver();
            }

           }
        driver.get(readPropertiesFile.valueOf("url"));
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
