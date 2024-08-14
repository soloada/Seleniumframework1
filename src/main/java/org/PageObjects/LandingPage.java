package org.PageObjects;

import org.AbstractComponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class LandingPage  extends AbstractComponent {

    WebDriver driver;
    public static String url = "https://automationteststore.com/";

    public LandingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy (css = "div.oneByOneSlide")
    private WebElement bannerFrame;
    @FindBy (css = "div.oneByOne_item.banner")
    private List<WebElement> bannerImages;

    @FindBy (css = "div.nextArrow")
    private WebElement RightBannerNextArrow;

    @FindBy (css = "div.prevArrow")
    private WebElement LeftBannerPrevArrow;



    @FindBy (css = "div[class='header_block'] a[title='Facebook']")
    private WebElement facebookIcon;




    public void gotoUrl() {
        this.driver.get(url);


    }


    public void bannerArrows (){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.elementToBeClickable(bannerFrame));
        //driver.switchTo().frame(RightBannerNextArrow);
        /*Actions actions = new Actions(driver);
        actions.moveToElement(RightBannerNextArrow).perform();*/
        //Assert.assertTrue(RightBannerNextArrow.isDisplayed ());

        int i=0;

        while (i<3){

            RightBannerNextArrow.click();
            i++;

        }

        /*while (i<3){

            LeftBannerPrevArrow.click();
            i++;

        }*/

    }

    public WebElement getFacebookIcon() {
        return facebookIcon;
    }


}
