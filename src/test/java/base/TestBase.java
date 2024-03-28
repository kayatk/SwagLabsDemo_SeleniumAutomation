package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import utilities.ReadPropertiesFile;

import java.io.FileReader;
import java.io.IOException;

public class TestBase {

    public static WebDriver driver;
    ReadPropertiesFile readPropertiesFile =new ReadPropertiesFile();

@BeforeTest
    public void setUp() throws IOException {
        if (driver==null){
            String userBrowser =readPropertiesFile.valueOf("browser");
            if(userBrowser.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
            }
            else if(userBrowser.equalsIgnoreCase("firefox")){
                WebDriverManager.firefoxdriver().setup();
                driver= new FirefoxDriver();
            }

           }
        driver.get(readPropertiesFile.valueOf("url"));
       driver.manage().window().maximize();
    }


   @AfterTest
    public void tearDown(){
        driver.close();
    }
}
