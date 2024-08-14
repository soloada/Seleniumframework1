package org.TestCases;

import org.PageObjects.LandingPage;
import org.TestComponents.BaseTest;
import org.TestComponents.Retry;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseTest {


    @Test(retryAnalyzer = Retry.class)
    public void  landingPageRunner (){
// This class is purposely failed to test whether ITestListener report/record and take screenshot of failed testcases
// I have added retryAnalyzer = Retry.class to this class so that it will re-run the test one more time in case of flaky test
        LandingPage landingPage = new LandingPage(driver);
        landingPage.bannerArrows();
        //This code run very fine, but i deliberately failed it by assert_false
        Assert.assertTrue(false);
        Assert.assertTrue(landingPage.getFacebookIcon().getText().trim().contains("Facebook".trim()));
        Assert.assertTrue(landingPage.getFacebookIcon().isDisplayed());
        Assert.assertTrue(landingPage.getFacebookIcon().isEnabled());
        this.landingPage.getFacebookIcon().click();





    }




}
