package org.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.AbstractComponents.AbstractComponent;
import org.PageObjects.*;
import org.TestComponents.BaseTest;
import org.TestComponents.TakeScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import java.io.IOException;

public class Submenu_Steps extends BaseTest {


    //public SubmenuPage submenuPage;


    public LandingPage landingPage;

    @Given("That User navigates to Landing page")
    public void thatUserNavigatesToLandingPage() throws IOException {
        landingPage = launchApplication();
        Assert.assertEquals(driver.getCurrentUrl(), LandingPage.url);
        Assert.assertEquals(driver.getTitle(),title);
        //TakeScreenShot takeScreenShot = new TakeScreenShot(driver);
        //takeScreenShot.TakingScreenShots();


    }

    @When("User hoover over  dropdowns and click one product in each dropdowns as follow £ POUND STERLING-£ Pound Sterling")
    public void userHooverOverDropdownsAndClickOneProductInEachDropdownsAsFollow£POUNDSTERLING£PoundSterling() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.setCurrency(selectPoundsSterling);
    }

    @And("ITEMS-View Cart")
    public void itemsViewCart() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.setItemsLink();
    }

    @And("HOME-Checkout")
    public void homeCheckout() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.setHomeDropdown(clickCheckout);
    }

    @And("APPAREL & ACCESSORIES-tShirt")
    public void apparelACCESSORIESTShirt() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.ApparelDropdown(selectTShirt);
    }

    @And("makeup-face")
    public void makeupFace() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.makeupList(selectFace);
    }

    @And("SKINCARE-gift_ideas_sets")
    public void skincareGift_ideas_sets() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.SkincareMenu(selectGift_ideas_sets);
    }

    @And("Fragrance-women")
    public void fragranceWomen() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.FragranceMenu(selectWomen);
    }

    @And("Men-preShave_shave")
    public void menPreShave_shave() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.menMenu(selectPreShave_shave);
    }

    @And("Haircare_Shampoo")
    public void haircare_shampoo() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.HaircareMenu(selectShampoo);
    }

    @And("Book-Paperback")
    public void bookPaperback() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        submenuPage.booksMenu(selectPaperback);
    }

    @Then("user should be able to hover each dropdown and click on at-least one product")
    public void userShouldBeAbleToHoverEachDropdownAndClickOnAtLeastOneProduct() {
    }

    @When("hoover over Books, clicks Paperback & click on Allegiant by Veronica Roth")
    public void hooverOverBooksClicksPaperbackClickOnAllegiantByVeronicaRoth() {
        SubmenuPage submenuPage = new SubmenuPage(driver);
        BookOrderPage bookOrderPage = new BookOrderPage(driver);
        submenuPage.booksMenu(selectPaperback);
        bookOrderPage.getAllegiantByVeronicaRoth();

    }

    @And("clicks Add to Cart")
    public void clicksAddToCart() {
        BookOrderPage bookOrderPage = new BookOrderPage(driver);
        bookOrderPage.setAddToCart();
    }

    @And("clicks Checkout")
    public void clicksCheckout() {
        BookOrderPage bookOrderPage = new BookOrderPage(driver);
        bookOrderPage.setCheckout();
    }

    @And("enters login credentials as {string} & {string}")
    public void entersLoginCredentialsAs(String LoginName, String Password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginApplication(LoginName,Password);

    }

    @And("click on Confirm order")
    public void clickOnConfirmOrder() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.CheckoutConfirmation();
    }

    @Then("user should see order confirmation message as {string}")
    public void userShouldSeeOrderConfirmationMessageAs(String SuccessMsg) {
        BookOrderPage bookOrderPage = new BookOrderPage(driver);
        Assert.assertTrue(driver.findElement(By.cssSelector(".maintext")).getText().equalsIgnoreCase(SuccessMsg));
    }


    @When("When user verify that the logo is displayed & enabled")
    public void whenUserVerifyThatTheLogoIsDisplayedEnabled() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.logoVerification();

    }

    @And("Click on Login or register")
    public void clickOnLoginOrRegister() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickLoginLink();
    }

    @And("Click on Cart")
    public void clickOnCart() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickCartLink();
    }


    @Then("User should be able to click on Filter SearchKey and enter text as <shoes>")
    public void userShouldBeAbleToClickOnFilterSearchKeyAndEnterTextAsShoes() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickFilterSearchKeyWord();
        headerPage.ClickSearchBtn();
    }


}
