package org.TestComponents;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.PageObjects.LandingPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class BaseTest extends Utility {

    public WebDriver driver;



    public LandingPage landingPage;

    public WebDriver initializeDriver() throws IOException {

        Properties props = new Properties();
        FileInputStream fil = new FileInputStream(System.getProperty("user.dir")
                +"\\src\\main\\java\\org\\Resource\\GlobalData.properties");
        props.load(fil);
        //String browserName = System.getProperty("browser")!= null ? System.getProperty("browser") : props.getProperty("browser");
        String browserName = props.getProperty("browser");

        if (browserName.equalsIgnoreCase("chrome")) {
            /*ChromeOptions option = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            option.addArguments("--remote-allow-origins=*");*/
            driver = new ChromeDriver();



        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;

    }

    @BeforeMethod(alwaysRun = true)
    public LandingPage launchApplication() throws IOException {
        driver = initializeDriver();
        landingPage = new LandingPage(driver);
        landingPage.gotoUrl();
        return landingPage;


    }

    public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File file = new File(System.getProperty("user.dir") + "//reports" + testCaseName + ".png");
        FileUtils.copyFile(source,file);
        return System.getProperty("user.dir") + "//reports" + testCaseName + ".png";

    }

    public List<HashMap<String, String>> getJsonDataMap (String filePath) throws IOException {

        String jsonContent = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);
        ObjectMapper mapper = new ObjectMapper();
        List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
        });
        return data;

    }

    @AfterMethod(alwaysRun = true)

    public void tearDown() {
        //driver.close();

    }

}


