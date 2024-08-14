package org.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.PageObjects.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.function.Function;

import static org.testng.Assert.assertEquals;

public class demoStepDefinition {

    WebDriver driver;
    private org.openqa.selenium.WebDriver WebDriver;


    @Given("that user navigate to url {string}")
    public void that_user_navigate_to_url(String url) {
        ChromeOptions option = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.get(url);


    }


    @And("enter Correct User name or Email address {string} and Password {string}")
    public void enter_correct_user_name_or_email_address_and_password(String Email, String Password) {
        driver.findElement(By.cssSelector("input[id=':r0:']")).sendKeys(Email);
        driver.findElement(By.cssSelector("input[id=':r1:']")).sendKeys(Password);

    }

    @When("user click login")
    public void user_click_login() {
        driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();


    }

    @Then("user should be on homepage")
    public void user_should_be_on_homepage() {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //String dashboardLink = "https://wisterias.digimonk.xyz/dashboard";
        //Assert.assertEquals(driver.getCurrentUrl(), dashboardLink);

    }

}