package org.TestCases.TestClass_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class AssertionTestClass {

    WebDriver driver;

    String eleName = "Login or register";
    String getTitle = "A place to practice your automation skills!";

    String assertLoginOrRegister ="Login or register";


    @Test
    public void assertTest() {
        /*ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        options.addArguments("--remote-allow-origins=*");*/
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://automationteststore.com/");

        /*AbstractComponent abstractComponent = new AbstractComponent(driver);
        Assert.assertTrue(abstractComponent.setAssertEle().getText().contains(eleName));*/

        WebElement ele1 = driver.findElement(By.cssSelector("ul[id='customer_menu_top'] li a"));
        Assert.assertTrue(ele1.getText().equalsIgnoreCase(eleName));

        Assert.assertEquals(driver.getTitle(), getTitle);

        driver.findElement(By.cssSelector("ul[id='customer_menu_top'] li a")).isDisplayed();
        driver.findElement(By.cssSelector("ul[id='customer_menu_top'] li a")).isSelected();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(ele1)).click();

    }

    @Test
    public void assertFromPOM() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationteststore.com/");

        AbstractComponent abstractComponent = new AbstractComponent(driver);
        Assert.assertTrue(abstractComponent.setAssertEle().getText().trim().equalsIgnoreCase(assertLoginOrRegister.trim()));
    }
    @Test
    public void assertRunner2 (){
        /*ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);*/

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://automationteststore.com/");

        WebElement ele3 = driver.findElement(By.cssSelector("ul[id='customer_menu_top'] li a"));

        Assert.assertTrue(ele3.getText().trim().contains(assertLoginOrRegister.trim()));

        ele3.isDisplayed();
        ele3.isEnabled();


    }

}
