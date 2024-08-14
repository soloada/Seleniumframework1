package org.TestCases.TestClass_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class GlobalPropDemo {

    WebDriver driver;

    public WebDriver initializeDriver() throws IOException {

        Properties props = new Properties();

        FileInputStream fil1 = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\org\\Resource\\GlobalData.properties");

        props.load(fil1);


        String getBrowser = props.getProperty("browser");

        if(getBrowser.equalsIgnoreCase("chrome")){

            ChromeOptions options = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

        }
        return driver;

    }


    @Test
    @BeforeMethod(alwaysRun = true)
    public void launchApplication () throws IOException {

        driver = initializeDriver();
        driver.get("https://automationteststore.com/");


    }
}
