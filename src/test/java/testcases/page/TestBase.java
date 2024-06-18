package testcases.page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.*;
import utilities.ReadPropertiesFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestBase {

    public static WebDriver driver;
    ReadPropertiesFile readPropertiesFile = new ReadPropertiesFile();

    @BeforeMethod
    public void setUp() throws IOException {
        String userBrowser = readPropertiesFile.valueOf("browser");
        if (userBrowser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().clearDriverCache().setup();
            ChromeOptions options = new ChromeOptions();
            // Additional options if needed
            driver = new ChromeDriver(options);
        } else if (userBrowser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            // Additional options if needed
            driver = new FirefoxDriver(options);
        }
        driver.get(readPropertiesFile.valueOf("url"));
        driver.manage().window().maximize();
        System.out.println(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @DataProvider(name= "jsondata")
    public String[] jsonReader() throws IOException, ParseException {

        JSONParser Parser = new JSONParser();
        FileReader reader =new FileReader("src/test/resources/testdata/loginData.json");
        FileReader infoReader =new FileReader("src/test/resources/testdata/checkoutInfo.json");
        Object obj =  Parser.parse(reader);

        JSONObject jobj = (JSONObject) obj;
        JSONArray arr =(JSONArray) jobj.get("loginCredentials");
        JSONArray infoArr =(JSONArray)jobj.get("personalInfo");

        String array[] =new String [arr.size()];

        for(int i= 0;i<arr.size();i++){
            JSONObject users =(JSONObject) arr.get(i);
            String username =(String)users.get("username");
            String password =(String)users.get("password");
            array[i] = username +","+password;
        }
        return array;
    }

    public void screenshot(){
        TakesScreenshot ts =(TakesScreenshot)driver;
       File src = ts.getScreenshotAs(OutputType.FILE);
       File dest= new File("src/test/resources/screenshots/screenshot.png");
       try {
        FileHandler.copy(src,dest);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

}
