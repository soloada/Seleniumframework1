package org.TestCases;

import org.AbstractComponents.AbstractComponent;
import org.PageObjects.BookOrderPage;
import org.PageObjects.LandingPage;
import org.PageObjects.LoginPage;
import org.PageObjects.SubmenuPage;
import org.TestComponents.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.TestComponents.TakeScreenShot;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SubmenuTest extends BaseTest  {

//public TakeScreenShot screenShots;

    @Test
    public void submenuRunner() throws IOException {
        //SubmenuPage submenu = new SubmenuPage(driver);
        AbstractComponent component = new AbstractComponent(driver);
        assertEquals(driver.getCurrentUrl(), LandingPage.url);
        assertEquals(driver.getTitle(),title);
        //TakeScreenShot takeScreenShot = new TakeScreenShot(driver);
        //takeScreenShot.TakingScreenShots();
        component.setCurrency(selectPoundsSterling);
        component.setItemsLink();
        component.setHomeDropdown(clickCheckout);
        component.ApparelDropdown(selectTShirt);
        component.makeupList(selectFace);
        component.SkincareMenu(selectGift_ideas_sets);
        component.FragranceMenu(selectWomen);
        component.menMenu(selectPreShave_shave);
        component.HaircareMenu(selectShampoo);
        BookOrderPage bookOrderPage = component.booksMenu(selectPaperback);
        bookOrderPage.getAllegiantByVeronicaRoth();
        bookOrderPage.setAddToCart();
        LoginPage loginPage = bookOrderPage.setCheckout();
        loginPage.loginApplication("webdriverio2","webdriverio2");
        loginPage.CheckoutConfirmation();
        //Assert.assertTrue(driver.findElement(By.cssSelector(".maintext")).getText().trim().equalsIgnoreCase(" YOUR ORDER HAS BEEN PROCESSED!".trim())); //Your Order Has Been Processed!
        Assert.assertEquals(driver.getCurrentUrl(),checkoutSuccess);
        AbstractComponent abstractComponent = new AbstractComponent(driver);
        abstractComponent.getContBtn();





    }



}
