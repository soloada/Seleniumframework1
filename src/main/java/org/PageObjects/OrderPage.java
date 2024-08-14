package org.PageObjects;

import org.AbstractComponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OrderPage extends AbstractComponent {

    WebDriver driver;
    public OrderPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy (xpath = "//div[@class='col-md-3 col-sm-6 col-xs-12']")
    private List<WebElement> products;

   /* @FindBy (xpath = "a[title=\"Add to Cart\"]")
    private WebElement addToCart;*/ //general add to cart


    @FindBy (css = "select#option321")
    private WebElement fragranceSize;

    /*@FindBy (xpath = "div/div[3]/a")
    private WebElement clickCart;*/

    @FindBy (css = "a.cart")
    private WebElement addToCart;

    @FindBy (css = "a#cart_checkout1")
    private WebElement Checkout;



    public void getProduct(){

        for (int i=0;i<products.size(); i++){
            if (products.get(i).getText().trim().equalsIgnoreCase("Total Moisture Facial Cream".trim()));
            products.get(i).click();
            break;
                    }


    }


    public void getFragranceSize() {
        Select select = new Select((WebElement) driver);
        select.selectByValue("665");
    }

    public void setAddToCart(){

        this.addToCart.click();
    }







    }

