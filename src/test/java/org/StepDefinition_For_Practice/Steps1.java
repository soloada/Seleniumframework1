package org.StepDefinition_For_Practice;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.PageObjects.TestPage_Practice.LoginDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Steps1 {

WebDriver driver;

    @Given("user navigates to the web application as {string}")
    public void userNavigatesToTheWebApplicationAs(String url) {
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @And("user should be in the homepage")
    public void userShouldBeInTheHomepage() {
        Assert.assertEquals(driver.getTitle(), "A place to practice your automation skills!");

    }

    @And("user clicks on Login or register")
    public void userClicksOnLoginOrRegister() {
        LoginDemo loginDemo = new LoginDemo(driver);
        loginDemo.getLoginOrRegister();
    }

    @And("user should see RETURNING CUSTOMER")
    public void userShouldSeeRETURNINGCUSTOMER() {
        LoginDemo loginDemo = new LoginDemo(driver);

        Assert.assertTrue(loginDemo.GetAssertText().getText().equalsIgnoreCase("Returning Customer"));

    }

    @When("user enters valid & invalid login information as {string} and {string}")
    public void userEntersValidInvalidLoginInformationAsAnd(String userName, String password) {
        LoginDemo loginDemo = new LoginDemo(driver);
        loginDemo.loginInfo(userName, password);


    }

    @And("clicks on Login")
    public void clicksOnLogin() {
        LoginDemo loginDemo = new LoginDemo(driver);
        loginDemo.setClickLogin();
    }

    @Then("user should be on account dashboard")
    public void userShouldBeOnAccountDashboard() {

        Assert.assertEquals(driver.getCurrentUrl(), "https://automationteststore.com/index.php?rt=account/account");


    }




}
