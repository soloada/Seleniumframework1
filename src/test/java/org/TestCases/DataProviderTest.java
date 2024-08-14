package org.TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;

public class DataProviderTest {

    WebDriver driver;

    @Test(dataProvider = "getData")
    public void getDataTest(String email, String password) {
        driver = new ChromeDriver();

        /*ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);*/

        driver.get("https://automationteststore.com/");

        //loginOrRegister.click();
        driver.findElement(By.cssSelector("ul[id='customer_menu_top'] li a")).click();

        driver.findElement(By.id("loginFrm_loginname")).sendKeys(email);
        driver.findElement(By.id("loginFrm_password")).sendKeys(password);
        driver.findElement(By.cssSelector("button[title='Login']")).click();


    }


    @DataProvider
    public Object[][] getData() {

        return new Object[][]{{"webdriverio2", "webdriverio2"}, {"webdriverio2", "webdriveri222"}};
    }


}
