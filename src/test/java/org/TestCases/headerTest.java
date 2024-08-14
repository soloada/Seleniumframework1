package org.TestCases;

import org.PageObjects.HeaderPage;
import org.PageObjects.LoginPage;
import org.TestComponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class headerTest extends BaseTest {
    //WebDriver driver;
    @Test
    public void headerRunner(){

        HeaderPage headerPage = new HeaderPage(driver);
        LoginPage loginPage = new LoginPage(driver);



        headerPage.logoVerification();
        headerPage.clickLoginLink();
        Assert.assertEquals("RETURNING CUSTOMER",headerPage.assertReturningCustomer_txt());

        headerPage.clickSpecialsLink();
        headerPage.clickAccountLink();
        headerPage.clickCartLink();
       /*headerPage.clickCheckoutLink();*/
        headerPage.clickFilterSearchKeyWord();









    }
}
