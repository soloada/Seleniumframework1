package org.TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;

public class HashMapLoginTest2 {
    WebDriver driver;
    
    @Test(dataProvider ="javaCollection1")
    public void getLogin (HashMap<String,String> input){

        ChromeOptions options= new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://automationteststore.com/");

        driver.findElement(By.cssSelector("ul[id='customer_menu_top'] li a")).click();
        driver.findElement(By.id("loginFrm_loginname")).sendKeys(input.get("email"));
        driver.findElement(By.id("loginFrm_password")).sendKeys((input.get("password")));
        driver.findElement(By.cssSelector("button[title='Login']")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationteststore.com/index.php?rt=account/account");



    }

    @DataProvider
    public Object [] [] javaCollection1 (){
        HashMap<String,String> map = new HashMap<>();
        map.put("email","webdriverio2");
        map.put("password", "webdriverio2");

        HashMap<String,String> map1 = new HashMap<>();
        map1.put("email","webdriverio2");
        map1.put("password", "webdriverio2");

        return new Object[][]     {{map},{map1}};
    }
}
